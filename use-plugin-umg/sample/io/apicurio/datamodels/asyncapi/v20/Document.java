package io.apicurio.datamodels.asyncapi.v20;

import io.apicurio.datamodels.core.models.Node;
import io.apicurio.datamodels.asyncapi.v20.Components;
import java.util.List;
import io.apicurio.datamodels.asyncapi.v20.Server;
import io.apicurio.datamodels.asyncapi.v20.Channels;
import io.apicurio.datamodels.asyncapi.v20.ExternalDocumentation;
import io.apicurio.datamodels.asyncapi.v20.Info;
import io.apicurio.datamodels.asyncapi.v20.Tag;
import io.apicurio.datamodels.core.visitors.IVisitor;

public class Document extends Node {

	private io.apicurio.datamodels.asyncapi.v20.Components components;
	private List<io.apicurio.datamodels.asyncapi.v20.Server> servers;
	private io.apicurio.datamodels.asyncapi.v20.Channels channels;
	private String asyncapi;
	private String id;
	private io.apicurio.datamodels.asyncapi.v20.ExternalDocumentation externalDocs;
	private io.apicurio.datamodels.asyncapi.v20.Info info;
	private List<io.apicurio.datamodels.asyncapi.v20.Tag> tags;

	public Components getComponents() {
		return components;
	}

	public void setComponents(io.apicurio.datamodels.asyncapi.v20.Components components) {
		this.components = components;
	}

	public List<Server> getServers() {
		return servers;
	}

	public void setServers(java.util.List<io.apicurio.datamodels.asyncapi.v20.Server> servers) {
		this.servers = servers;
	}

	public Channels getChannels() {
		return channels;
	}

	public void setChannels(io.apicurio.datamodels.asyncapi.v20.Channels channels) {
		this.channels = channels;
	}

	public String getAsyncapi() {
		return asyncapi;
	}

	public void setAsyncapi(String asyncapi) {
		this.asyncapi = asyncapi;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ExternalDocumentation getExternalDocs() {
		return externalDocs;
	}

	public void setExternalDocs(io.apicurio.datamodels.asyncapi.v20.ExternalDocumentation externalDocs) {
		this.externalDocs = externalDocs;
	}

	public Info getInfo() {
		return info;
	}

	public void setInfo(io.apicurio.datamodels.asyncapi.v20.Info info) {
		this.info = info;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<io.apicurio.datamodels.asyncapi.v20.Tag> tags) {
		this.tags = tags;
	}

	public void accept(IVisitor visitor) {
		visitor.visitDocument(this);
	}
}