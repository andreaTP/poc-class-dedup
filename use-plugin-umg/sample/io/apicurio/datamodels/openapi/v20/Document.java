package io.apicurio.datamodels.openapi.v20;

import io.apicurio.datamodels.core.models.ExtensibleNode;
import java.util.List;
import io.apicurio.datamodels.openapi.v20.Tag;
import io.apicurio.datamodels.openapi.v20.SecurityRequirement;
import io.apicurio.datamodels.openapi.v20.Paths;
import io.apicurio.datamodels.openapi.v20.ResponseDefinitions;
import io.apicurio.datamodels.openapi.v20.ExternalDocumentation;
import io.apicurio.datamodels.openapi.v20.Definitions;
import io.apicurio.datamodels.openapi.v20.ParameterDefinitions;
import io.apicurio.datamodels.openapi.v20.SecurityDefinitions;
import io.apicurio.datamodels.openapi.v20.Info;
import io.apicurio.datamodels.core.visitors.IVisitor;

public class Document extends ExtensibleNode {

	private List<String> schemes;
	private String swagger;
	private List<io.apicurio.datamodels.openapi.v20.Tag> tags;
	private List<io.apicurio.datamodels.openapi.v20.SecurityRequirement> security;
	private String basePath;
	private io.apicurio.datamodels.openapi.v20.Paths paths;
	private String host;
	private List<String> produces;
	private io.apicurio.datamodels.openapi.v20.ResponseDefinitions responses;
	private io.apicurio.datamodels.openapi.v20.ExternalDocumentation externalDocs;
	private io.apicurio.datamodels.openapi.v20.Definitions definitions;
	private io.apicurio.datamodels.openapi.v20.ParameterDefinitions parameters;
	private io.apicurio.datamodels.openapi.v20.SecurityDefinitions securityDefinitions;
	private io.apicurio.datamodels.openapi.v20.Info info;
	private List<String> consumes;

	public List<String> getSchemes() {
		return schemes;
	}

	public void setSchemes(java.util.List<String> schemes) {
		this.schemes = schemes;
	}

	public String getSwagger() {
		return swagger;
	}

	public void setSwagger(String swagger) {
		this.swagger = swagger;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<io.apicurio.datamodels.openapi.v20.Tag> tags) {
		this.tags = tags;
	}

	public List<SecurityRequirement> getSecurity() {
		return security;
	}

	public void setSecurity(List<io.apicurio.datamodels.openapi.v20.SecurityRequirement> security) {
		this.security = security;
	}

	public String getBasePath() {
		return basePath;
	}

	public void setBasePath(String basePath) {
		this.basePath = basePath;
	}

	public Paths getPaths() {
		return paths;
	}

	public void setPaths(io.apicurio.datamodels.openapi.v20.Paths paths) {
		this.paths = paths;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public List<String> getProduces() {
		return produces;
	}

	public void setProduces(List<String> produces) {
		this.produces = produces;
	}

	public ResponseDefinitions getResponses() {
		return responses;
	}

	public void setResponses(io.apicurio.datamodels.openapi.v20.ResponseDefinitions responses) {
		this.responses = responses;
	}

	public ExternalDocumentation getExternalDocs() {
		return externalDocs;
	}

	public void setExternalDocs(io.apicurio.datamodels.openapi.v20.ExternalDocumentation externalDocs) {
		this.externalDocs = externalDocs;
	}

	public Definitions getDefinitions() {
		return definitions;
	}

	public void setDefinitions(io.apicurio.datamodels.openapi.v20.Definitions definitions) {
		this.definitions = definitions;
	}

	public ParameterDefinitions getParameters() {
		return parameters;
	}

	public void setParameters(io.apicurio.datamodels.openapi.v20.ParameterDefinitions parameters) {
		this.parameters = parameters;
	}

	public SecurityDefinitions getSecurityDefinitions() {
		return securityDefinitions;
	}

	public void setSecurityDefinitions(io.apicurio.datamodels.openapi.v20.SecurityDefinitions securityDefinitions) {
		this.securityDefinitions = securityDefinitions;
	}

	public Info getInfo() {
		return info;
	}

	public void setInfo(io.apicurio.datamodels.openapi.v20.Info info) {
		this.info = info;
	}

	public List<String> getConsumes() {
		return consumes;
	}

	public void setConsumes(List<String> consumes) {
		this.consumes = consumes;
	}

	public void accept(IVisitor visitor) {
		visitor.visitDocument(this);
	}
}