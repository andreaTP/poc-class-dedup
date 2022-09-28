package io.apicurio.datamodels.openapi.v20;

import io.apicurio.datamodels.core.models.ExtensibleNode;
import io.apicurio.datamodels.openapi.v20.Response;
import io.apicurio.datamodels.core.visitors.IVisitor;

public class Responses extends ExtensibleNode {

	private io.apicurio.datamodels.openapi.v20.Response _default;

	public Response getDefault() {
		return _default;
	}

	public void setDefault(io.apicurio.datamodels.openapi.v20.Response _default) {
		this._default = _default;
	}

	public void accept(IVisitor visitor) {
		visitor.visitResponses(this);
	}
}