package io.apicurio;

import com.github.javaparser.ParseResult;
import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.PackageDeclaration;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.expr.Name;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.utils.Log;
import com.github.javaparser.utils.SourceRoot;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;
import org.codehaus.plexus.util.FileUtils;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import static com.github.javaparser.utils.CodeGenerationUtils.f;

/**
 * This plugin is a demo that can take a sources folder and deduplicate the content.
 */
@Mojo(name = "class-dedup", defaultPhase = LifecyclePhase.GENERATE_SOURCES)
public class ClassDedupMojo extends AbstractMojo {
    /**
     * Location for the source files where deduplication should happen.
     */
    @Parameter(required = true, defaultValue = "${project.build.directory}/generated-sources/java")
    private File sourceDirectory;

    /**
     * The current Maven project.
     */
    @Parameter(property = "project", required = true, readonly = true)
    private MavenProject project;

    @Override
    public void execute() throws MojoExecutionException {
        JavaParserMavenUtils.makeJavaParserLogToMavenOutput(getLog());
        findDuplicates(sourceDirectory);
    }

    class Duplicate {
        private Duplicate() {}
        public Duplicate(String name, Set<String> duplicates, ClassOrInterfaceDeclaration content) {
            this.name = name;
            this.duplicates = duplicates;
            this.content = content;
        }

        public String name;
        public Set<String> duplicates;
        public ClassOrInterfaceDeclaration content;
    }

    private List<List<ClassOrInterfaceDeclaration>> duplicates = new ArrayList<>();

    // TODO: improve actually comparing fields e.g. with/without substituted types etc.
    // TODO: should we make this tunable/injectable?
    private boolean areDuplicates(ClassOrInterfaceDeclaration o1, ClassOrInterfaceDeclaration o2) {
        if (
                o1.getNameAsString().equals(o2.getNameAsString()) &&
                o1.getFields().size() == o2.getFields().size()
        ) {
            return o1
                    .getFields()
                    .stream()
                    .map(f -> f.getVariable(0).getNameAsString())
                    .collect(Collectors.toList())
                    .containsAll(
                            o2
                            .getFields()
                            .stream()
                            .map(f -> f.getVariable(0).getNameAsString())
                            .collect(Collectors.toList())
                    );
        } else {
            return false;
        }
    }

    private void addPotentialDuplicate(ClassOrInterfaceDeclaration clazz) {
        Log.info(f("Processing %s", clazz.getFullyQualifiedName().get()));

        Optional<List<ClassOrInterfaceDeclaration>> duplicateFound = duplicates
                .stream()
                .filter(ds -> areDuplicates(ds.get(0), clazz))
                .findFirst();

        if (duplicateFound.isPresent()) {
            duplicateFound.get().add(clazz);
        } else {
            List<ClassOrInterfaceDeclaration> rem = new ArrayList<>();
            rem.add(clazz);
            duplicates.add(rem);
        }
    }

    private class RefactorResult {
        public CompilationUnit cu;
        public String pack;

        public RefactorResult(CompilationUnit cu, String pack) {
            this.cu = cu;
            this.pack = pack;
        }
    }

    private RefactorResult refactorCUs(List<CompilationUnit> cus) {
        List<String[]> allPackageNames = cus
                .stream()
                .map(cu ->
                    cu
                            .getPackageDeclaration()
                            .get()
                            .getNameAsString()
                            .split("\\.")
                )
                .collect(Collectors.toList());

        String[] onePackageName = cus.get(0).getPackageDeclaration().get().getNameAsString().split("\\.");
        String resultingName = onePackageName[0];
        int i = 1;
        while (i < onePackageName.length) {
            final int j = i;
            boolean differ = allPackageNames
                    .stream()
                    .filter(pn -> pn.length <= j || !pn[j].equals(onePackageName[j]))
                    .findFirst()
                    .isPresent();
            if (differ) {
                break;
            } else {
                resultingName = resultingName + "." + onePackageName[i];
                i++;
            }
        }

        String backPath = "";
        for (int j = 0; j < onePackageName.length - i; j++) {
            backPath = backPath + "../";
        }

        Log.info(f("Resulting package name is: %s", resultingName));
        CompilationUnit result = new CompilationUnit();

        CompilationUnit tmpCu = cus.get(0).clone();
        Path newFolder = tmpCu.getStorage().get().getDirectory().resolve(backPath);
        result.setPackageDeclaration(new PackageDeclaration(new Name(resultingName)));
        result.setStorage(newFolder.resolve(tmpCu.getStorage().get().getFileName()).normalize());

        result.setTypes(tmpCu.getTypes());

        return new RefactorResult(result, resultingName);
    }

    private class RefactoredType {
        public RefactoredType(String name, String pack) {
            this.name = name;
            this.pack = pack;
        }

        public String name;
        public String pack;
    }

    private void findDuplicates(File sourceDirectory) throws MojoExecutionException {
        final SourceRoot source = new SourceRoot(sourceDirectory.toPath());
        final SourceRoot dest = new SourceRoot(sourceDirectory.toPath());

        try {
            for (ParseResult<CompilationUnit> parseResult : source.tryToParse()) {
                // Only deal with files without parse errors
                if (parseResult.isSuccessful()) {
                    parseResult.getResult().ifPresent(cu -> {
                        cu.getTypes().forEach(td -> {
                            if (td.isClassOrInterfaceDeclaration()) {
                                addPotentialDuplicate(td.asClassOrInterfaceDeclaration());
                            }
                        });
                    });
                }
            }

            HashMap<String, RefactoredType> substitutions = new HashMap<>();

            duplicates.forEach(dl -> {
                if (dl.size() > 1) {
                    Log.info(f("Removing duplicates: %s [%s]", dl.get(0).getNameAsString(), dl.stream().map(d -> d.getFullyQualifiedName().get()).collect(Collectors.joining(", "))));

                    // calculate and add the new CompilationUnit to the Root
                    RefactorResult refactored = refactorCUs(
                            dl.stream().map(d -> d.findCompilationUnit().get()).collect(Collectors.toList())
                    );

                    // add one compilation unit with the refactored type
                    dest.add(refactored.cu);

                    // TODO: this is a bit naive
                    String refactoredTypeName = refactored.cu.getPrimaryType().get().getNameAsString();
                    dl.forEach(x -> {
                        Log.info(f("Will substitute: %s with %s", x.getFullyQualifiedName().get(), refactored.pack + "." + refactoredTypeName));
                        substitutions.put(x.getFullyQualifiedName().get(), new RefactoredType(refactoredTypeName, refactored.pack));
                    });
                } else {
                    // add the compilation units without duplicates
                    dl.get(0).findCompilationUnit().ifPresent(cu -> dest.add(cu));
                }
            });

            dest.getCompilationUnits().forEach(cu -> cu.walk(node -> {
                if (node instanceof ClassOrInterfaceType) {
                    ClassOrInterfaceType clazzType = (ClassOrInterfaceType) node;
                    if (substitutions.containsKey(clazzType.getNameWithScope())) {
                        RefactoredType subst = substitutions.get(clazzType.getNameWithScope());
                        Log.info(f("Substituting %s with %s", clazzType.getNameWithScope(), subst.pack + "." + subst.name));
                        ((ClassOrInterfaceType) node).setScope(StaticJavaParser.parseClassOrInterfaceType(subst.pack));
                        ((ClassOrInterfaceType) node).setName(StaticJavaParser.parseSimpleName(subst.name));
                    }
                }
            }));

            FileUtils.deleteDirectory(sourceDirectory.toPath().toFile());

            // Everything parsed with sourceroot is kept in a cache so that it can be saved to disk in 1 line:
            dest.saveAll(sourceDirectory.toPath());
            // Tell Maven where we put the generated code so it will be added to the jar.
            // TODO: restore me if we want to save to a different folder
            // project.addCompileSourceRoot(destinationDirectory.getPath());
        } catch (Exception e) {
            throw new MojoExecutionException("Error reading from source directory", e);
        }
    }
}