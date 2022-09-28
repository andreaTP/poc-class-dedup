package io.apicurio.datamodels.openapi.v30;

import io.apicurio.datamodels.core.models.ExtensibleNode;
import java.util.Map;
import io.apicurio.datamodels.openapi.v30.ServerVariable;
import io.apicurio.datamodels.core.visitors.IVisitor;

public class Server extends ExtensibleNode {

	private Map<String, io.apicurio.datamodels.openapi.v30.ServerVariable> variables;
	private String description;
	private String url;

	public Map<String, ServerVariable> getVariables() {
		return variables;
	}

	public void setVariables(java.util.Map<String, io.apicurio.datamodels.openapi.v30.ServerVariable> variables) {
		this.variables = variables;
	}

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
		visitor.visitServer(this);
	}
}