package io.apicurio.datamodels.asyncapi.v20;

import io.apicurio.datamodels.core.models.Node;
import io.apicurio.datamodels.asyncapi.v20.License;
import io.apicurio.datamodels.asyncapi.v20.Contact;
import io.apicurio.datamodels.core.visitors.IVisitor;

public class Info extends Node {

	private io.apicurio.datamodels.asyncapi.v20.License license;
	private io.apicurio.datamodels.asyncapi.v20.Contact contact;
	private String description;
	private String termsOfService;
	private String title;
	private String version;

	public License getLicense() {
		return license;
	}

	public void setLicense(io.apicurio.datamodels.asyncapi.v20.License license) {
		this.license = license;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(io.apicurio.datamodels.asyncapi.v20.Contact contact) {
		this.contact = contact;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTermsOfService() {
		return termsOfService;
	}

	public void setTermsOfService(String termsOfService) {
		this.termsOfService = termsOfService;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public void accept(IVisitor visitor) {
		visitor.visitInfo(this);
	}
}