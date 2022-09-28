package io.apicurio.datamodels.openapi.v30;

import io.apicurio.datamodels.core.models.ExtensibleNode;
import java.util.List;
import io.apicurio.datamodels.core.visitors.IVisitor;

public class ServerVariable extends ExtensibleNode {

	private String _default;
	private String description;
	private List<String> _enum;

	public String getDefault() {
		return _default;
	}

	public void setDefault(String _default) {
		this._default = _default;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getEnum() {
		return _enum;
	}

	public void setEnum(java.util.List<String> _enum) {
		this._enum = _enum;
	}

	public void accept(IVisitor visitor) {
		visitor.visitServerVariable(this);
	}
}