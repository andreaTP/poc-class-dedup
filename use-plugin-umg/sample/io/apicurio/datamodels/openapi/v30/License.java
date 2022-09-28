package io.apicurio.datamodels.openapi.v30;

import io.apicurio.datamodels.core.models.ExtensibleNode;
import io.apicurio.datamodels.core.visitors.IVisitor;

public class License extends ExtensibleNode {

	private String name;
	private String url;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void accept(IVisitor visitor) {
		visitor.visitLicense(this);
	}
}