package io.apicurio.datamodels.openapi.v20;

import io.apicurio.datamodels.core.models.Node;
import io.apicurio.datamodels.openapi.v20.ExternalDocumentation;
import io.apicurio.datamodels.core.visitors.IVisitor;

public class Tag extends Node {

	private String name;
	private String description;
	private io.apicurio.datamodels.openapi.v20.ExternalDocumentation externalDocs;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ExternalDocumentation getExternalDocs() {
		return externalDocs;
	}

	public void setExternalDocs(io.apicurio.datamodels.openapi.v20.ExternalDocumentation externalDocs) {
		this.externalDocs = externalDocs;
	}

	public void accept(IVisitor visitor) {
		visitor.visitTag(this);
	}
}