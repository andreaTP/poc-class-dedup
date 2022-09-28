package io.apicurio.datamodels.openapi.v30;

import io.apicurio.datamodels.core.models.Node;
import io.apicurio.datamodels.core.visitors.IVisitor;

public class Paths extends Node {

	public void accept(IVisitor visitor) {
		visitor.visitPaths(this);
	}
}