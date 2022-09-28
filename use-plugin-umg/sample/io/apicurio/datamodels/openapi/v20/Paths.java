package io.apicurio.datamodels.openapi.v20;

import io.apicurio.datamodels.core.models.ExtensibleNode;
import io.apicurio.datamodels.core.visitors.IVisitor;

public class Paths extends ExtensibleNode {

	public void accept(IVisitor visitor) {
		visitor.visitPaths(this);
	}
}