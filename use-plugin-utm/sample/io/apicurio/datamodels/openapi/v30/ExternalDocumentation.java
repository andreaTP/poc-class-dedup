package io.apicurio.datamodels.openapi.v30;

import io.apicurio.datamodels.core.models.Node;
import io.apicurio.datamodels.core.visitors.IVisitor;

public class ExternalDocumentation extends Node {

	private String description;
	private String url;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void accept(IVisitor visitor) {
		visitor.visitExternalDocumentation(this);
	}
}