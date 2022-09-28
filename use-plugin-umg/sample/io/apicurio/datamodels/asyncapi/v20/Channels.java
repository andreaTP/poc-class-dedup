package io.apicurio.datamodels.asyncapi.v20;

import io.apicurio.datamodels.core.models.Node;
import io.apicurio.datamodels.core.visitors.IVisitor;

public class Channels extends Node {

	public void accept(IVisitor visitor) {
		visitor.visitChannels(this);
	}
}