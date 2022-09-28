package io.apicurio.datamodels.openapi.v30;

import io.apicurio.datamodels.core.models.ExtensibleNode;
import io.apicurio.datamodels.openapi.v30.Components;
import java.util.List;
import io.apicurio.datamodels.openapi.v30.SecurityRequirement;
import io.apicurio.datamodels.openapi.v30.Server;
import io.apicurio.datamodels.openapi.v30.Paths;
import io.apicurio.datamodels.openapi.v30.ExternalDocumentation;
import io.apicurio.datamodels.openapi.v30.Info;
import io.apicurio.datamodels.openapi.v30.Tag;
import io.apicurio.datamodels.core.visitors.IVisitor;

public class Document extends ExtensibleNode {

	private io.apicurio.datamodels.openapi.v30.Components components;
	private List<io.apicurio.datamodels.openapi.v30.SecurityRequirement> security;
	private List<io.apicurio.datamodels.openapi.v30.Server> servers;
	private String openapi;
	private io.apicurio.datamodels.openapi.v30.Paths paths;
	private io.apicurio.datamodels.openapi.v30.ExternalDocumentation externalDocs;
	private io.apicurio.datamodels.openapi.v30.Info info;
	private List<io.apicurio.datamodels.openapi.v30.Tag> tags;

	public Components getComponents() {
		return components;
	}

	public void setComponents(io.apicurio.datamodels.openapi.v30.Components components) {
		this.components = components;
	}

	public List<SecurityRequirement> getSecurity() {
		return security;
	}

	public void setSecurity(java.util.List<io.apicurio.datamodels.openapi.v30.SecurityRequirement> security) {
		this.security = security;
	}

	public List<Server> getServers() {
		return servers;
	}

	public void setServers(List<io.apicurio.datamodels.openapi.v30.Server> servers) {
		this.servers = servers;
	}

	public String getOpenapi() {
		return openapi;
	}

	public void setOpenapi(String openapi) {
		this.openapi = openapi;
	}

	public Paths getPaths() {
		return paths;
	}

	public void setPaths(io.apicurio.datamodels.openapi.v30.Paths paths) {
		this.paths = paths;
	}

	public ExternalDocumentation getExternalDocs() {
		return externalDocs;
	}

	public void setExternalDocs(io.apicurio.datamodels.openapi.v30.ExternalDocumentation externalDocs) {
		this.externalDocs = externalDocs;
	}

	public Info getInfo() {
		return info;
	}

	public void setInfo(io.apicurio.datamodels.openapi.v30.Info info) {
		this.info = info;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<io.apicurio.datamodels.openapi.v30.Tag> tags) {
		this.tags = tags;
	}

	public void accept(IVisitor visitor) {
		visitor.visitDocument(this);
	}
}