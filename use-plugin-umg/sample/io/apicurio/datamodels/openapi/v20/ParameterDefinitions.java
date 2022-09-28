package io.apicurio.datamodels.openapi.v20;

import io.apicurio.datamodels.core.models.Node;
import io.apicurio.datamodels.core.visitors.IVisitor;

public class ParameterDefinitions extends Node {

	public void accept(IVisitor visitor) {
		visitor.visitParameterDefinitions(this);
	}
}