package io.apicurio.datamodels.openapi.v20;

import io.apicurio.datamodels.core.models.ExtensibleNode;
import io.apicurio.datamodels.core.visitors.IVisitor;

public class Xml extends ExtensibleNode {

	private String prefix;
	private String name;
	private String namespace;
	private Boolean attribute;
	private Boolean wrapped;

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNamespace() {
		return namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	public Boolean isAttribute() {
		return attribute;
	}

	public void setAttribute(Boolean attribute) {
		this.attribute = attribute;
	}

	public Boolean isWrapped() {
		return wrapped;
	}

	public void setWrapped(Boolean wrapped) {
		this.wrapped = wrapped;
	}

	public void accept(IVisitor visitor) {
		visitor.visitXml(this);
	}
}