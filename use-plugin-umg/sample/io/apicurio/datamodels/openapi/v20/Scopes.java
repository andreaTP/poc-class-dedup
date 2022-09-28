package io.apicurio.datamodels.openapi.v20;

import io.apicurio.datamodels.core.models.ExtensibleNode;
import io.apicurio.datamodels.core.visitors.IVisitor;

public class Scopes extends ExtensibleNode {

	public void accept(IVisitor visitor) {
		visitor.visitScopes(this);
	}
}