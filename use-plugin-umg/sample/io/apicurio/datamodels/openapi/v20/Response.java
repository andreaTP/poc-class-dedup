package io.apicurio.datamodels.openapi.v20;

import io.apicurio.datamodels.core.models.ExtensibleNode;
import io.apicurio.datamodels.openapi.v20.Schema;
import io.apicurio.datamodels.openapi.v20.Headers;
import io.apicurio.datamodels.openapi.v20.Example;
import io.apicurio.datamodels.core.visitors.IVisitor;

public class Response extends ExtensibleNode {

	private io.apicurio.datamodels.openapi.v20.Schema schema;
	private io.apicurio.datamodels.openapi.v20.Headers headers;
	private io.apicurio.datamodels.openapi.v20.Example examples;
	private String description;

	public Schema getSchema() {
		return schema;
	}

	public void setSchema(io.apicurio.datamodels.openapi.v20.Schema schema) {
		this.schema = schema;
	}

	public Headers getHeaders() {
		return headers;
	}

	public void setHeaders(io.apicurio.datamodels.openapi.v20.Headers headers) {
		this.headers = headers;
	}

	public Example getExamples() {
		return examples;
	}

	public void setExamples(io.apicurio.datamodels.openapi.v20.Example examples) {
		this.examples = examples;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void accept(IVisitor visitor) {
		visitor.visitResponse(this);
	}
}