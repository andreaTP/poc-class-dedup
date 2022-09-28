package io.apicurio.datamodels.openapi.v20;

import io.apicurio.datamodels.core.models.ExtensibleNode;
import java.util.List;
import io.apicurio.datamodels.openapi.v20.SecurityRequirement;
import io.apicurio.datamodels.openapi.v20.Responses;
import io.apicurio.datamodels.openapi.v20.ExternalDocumentation;
import io.apicurio.datamodels.openapi.v20.Parameter;
import io.apicurio.datamodels.core.visitors.IVisitor;

public class Operation extends ExtensibleNode {

	private String summary;
	private List<io.apicurio.datamodels.openapi.v20.SecurityRequirement> security;
	private Boolean deprecated;
	private List<String> produces;
	private String description;
	private String operationId;
	private io.apicurio.datamodels.openapi.v20.Responses responses;
	private io.apicurio.datamodels.openapi.v20.ExternalDocumentation externalDocs;
	private List<String> schemes;
	private List<io.apicurio.datamodels.openapi.v20.Parameter> parameters;
	private List<String> tags;
	private List<String> consumes;

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public List<SecurityRequirement> getSecurity() {
		return security;
	}

	public void setSecurity(java.util.List<io.apicurio.datamodels.openapi.v20.SecurityRequirement> security) {
		this.security = security;
	}

	public Boolean isDeprecated() {
		return deprecated;
	}

	public void setDeprecated(Boolean deprecated) {
		this.deprecated = deprecated;
	}

	public List<String> getProduces() {
		return produces;
	}

	public void setProduces(List<String> produces) {
		this.produces = produces;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOperationId() {
		return operationId;
	}

	public void setOperationId(String operationId) {
		this.operationId = operationId;
	}

	public Responses getResponses() {
		return responses;
	}

	public void setResponses(io.apicurio.datamodels.openapi.v20.Responses responses) {
		this.responses = responses;
	}

	public ExternalDocumentation getExternalDocs() {
		return externalDocs;
	}

	public void setExternalDocs(io.apicurio.datamodels.openapi.v20.ExternalDocumentation externalDocs) {
		this.externalDocs = externalDocs;
	}

	public List<String> getSchemes() {
		return schemes;
	}

	public void setSchemes(List<String> schemes) {
		this.schemes = schemes;
	}

	public List<Parameter> getParameters() {
		return parameters;
	}

	public void setParameters(List<io.apicurio.datamodels.openapi.v20.Parameter> parameters) {
		this.parameters = parameters;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public List<String> getConsumes() {
		return consumes;
	}

	public void setConsumes(List<String> consumes) {
		this.consumes = consumes;
	}

	public void accept(IVisitor visitor) {
		visitor.visitOperation(this);
	}
}