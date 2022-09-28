package io.apicurio.datamodels.openapi.v20;

import io.apicurio.datamodels.core.models.ExtensibleNode;
import io.apicurio.datamodels.openapi.v20.Operation;
import java.util.List;
import io.apicurio.datamodels.openapi.v20.Parameter;
import io.apicurio.datamodels.core.visitors.IVisitor;

public class PathItem extends ExtensibleNode {

	private io.apicurio.datamodels.openapi.v20.Operation head;
	private Operation patch;
	private Operation post;
	private Operation get;
	private Operation options;
	private Operation delete;
	private List<io.apicurio.datamodels.openapi.v20.Parameter> parameters;
	private Operation put;

	public Operation getHead() {
		return head;
	}

	public void setHead(io.apicurio.datamodels.openapi.v20.Operation head) {
		this.head = head;
	}

	public Operation getPatch() {
		return patch;
	}

	public void setPatch(Operation patch) {
		this.patch = patch;
	}

	public Operation getPost() {
		return post;
	}

	public void setPost(Operation post) {
		this.post = post;
	}

	public Operation getGet() {
		return get;
	}

	public void setGet(Operation get) {
		this.get = get;
	}

	public Operation getOptions() {
		return options;
	}

	public void setOptions(Operation options) {
		this.options = options;
	}

	public Operation getDelete() {
		return delete;
	}

	public void setDelete(Operation delete) {
		this.delete = delete;
	}

	public List<Parameter> getParameters() {
		return parameters;
	}

	public void setParameters(java.util.List<io.apicurio.datamodels.openapi.v20.Parameter> parameters) {
		this.parameters = parameters;
	}

	public Operation getPut() {
		return put;
	}

	public void setPut(Operation put) {
		this.put = put;
	}

	public void accept(IVisitor visitor) {
		visitor.visitPathItem(this);
	}
}