package io.apicurio.datamodels.openapi.v20;

import io.apicurio.datamodels.core.models.ExtensibleNode;
import java.util.List;
import io.apicurio.datamodels.openapi.v20.Xml;
import io.apicurio.datamodels.openapi.v20.ExternalDocumentation;
import io.apicurio.datamodels.openapi.v20.Items;
import java.util.Map;
import io.apicurio.datamodels.core.visitors.IVisitor;

public class Schema extends ExtensibleNode {

	private Integer minLength;
	private String pattern;
	private String description;
	private String title;
	private String type;
	private Boolean required;
	private Object example;
	private Boolean exclusiveMaximum;
	private List<io.apicurio.datamodels.openapi.v20.Schema> allOf;
	private Object _default;
	private io.apicurio.datamodels.openapi.v20.Xml xml;
	private Integer maxProperties;
	private Boolean exclusiveMinimum;
	private Integer maxItems;
	private String format;
	private Boolean readOnly;
	private List<String> _enum;
	private Integer minProperties;
	private String discriminator;
	private Integer minItems;
	private Boolean uniqueItems;
	private Number maximum;
	private Object additionalProperties;
	private io.apicurio.datamodels.openapi.v20.ExternalDocumentation externalDocs;
	private Number minimum;
	private io.apicurio.datamodels.openapi.v20.Items items;
	private Integer maxLength;
	private Map<String, io.apicurio.datamodels.openapi.v20.Schema> properties;

	public Integer getMinLength() {
		return minLength;
	}

	public void setMinLength(Integer minLength) {
		this.minLength = minLength;
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Boolean isRequired() {
		return required;
	}

	public void setRequired(Boolean required) {
		this.required = required;
	}

	public Object getExample() {
		return example;
	}

	public void setExample(Object example) {
		this.example = example;
	}

	public Boolean isExclusiveMaximum() {
		return exclusiveMaximum;
	}

	public void setExclusiveMaximum(Boolean exclusiveMaximum) {
		this.exclusiveMaximum = exclusiveMaximum;
	}

	public List<io.apicurio.datamodels.openapi.v20.Schema> getAllOf() {
		return allOf;
	}

	public void setAllOf(java.util.List<io.apicurio.datamodels.openapi.v20.Schema> allOf) {
		this.allOf = allOf;
	}

	public Object getDefault() {
		return _default;
	}

	public void setDefault(Object _default) {
		this._default = _default;
	}

	public Xml getXml() {
		return xml;
	}

	public void setXml(io.apicurio.datamodels.openapi.v20.Xml xml) {
		this.xml = xml;
	}

	public Integer getMaxProperties() {
		return maxProperties;
	}

	public void setMaxProperties(Integer maxProperties) {
		this.maxProperties = maxProperties;
	}

	public Boolean isExclusiveMinimum() {
		return exclusiveMinimum;
	}

	public void setExclusiveMinimum(Boolean exclusiveMinimum) {
		this.exclusiveMinimum = exclusiveMinimum;
	}

	public Integer getMaxItems() {
		return maxItems;
	}

	public void setMaxItems(Integer maxItems) {
		this.maxItems = maxItems;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public Boolean isReadOnly() {
		return readOnly;
	}

	public void setReadOnly(Boolean readOnly) {
		this.readOnly = readOnly;
	}

	public List<String> getEnum() {
		return _enum;
	}

	public void setEnum(List<String> _enum) {
		this._enum = _enum;
	}

	public Integer getMinProperties() {
		return minProperties;
	}

	public void setMinProperties(Integer minProperties) {
		this.minProperties = minProperties;
	}

	public String getDiscriminator() {
		return discriminator;
	}

	public void setDiscriminator(String discriminator) {
		this.discriminator = discriminator;
	}

	public Integer getMinItems() {
		return minItems;
	}

	public void setMinItems(Integer minItems) {
		this.minItems = minItems;
	}

	public Boolean isUniqueItems() {
		return uniqueItems;
	}

	public void setUniqueItems(Boolean uniqueItems) {
		this.uniqueItems = uniqueItems;
	}

	public Number getMaximum() {
		return maximum;
	}

	public void setMaximum(Number maximum) {
		this.maximum = maximum;
	}

	public Object getAdditionalProperties() {
		return additionalProperties;
	}

	public void setAdditionalProperties(Object additionalProperties) {
		this.additionalProperties = additionalProperties;
	}

	public ExternalDocumentation getExternalDocs() {
		return externalDocs;
	}

	public void setExternalDocs(io.apicurio.datamodels.openapi.v20.ExternalDocumentation externalDocs) {
		this.externalDocs = externalDocs;
	}

	public Number getMinimum() {
		return minimum;
	}

	public void setMinimum(Number minimum) {
		this.minimum = minimum;
	}

	public Items getItems() {
		return items;
	}

	public void setItems(io.apicurio.datamodels.openapi.v20.Items items) {
		this.items = items;
	}

	public Integer getMaxLength() {
		return maxLength;
	}

	public void setMaxLength(Integer maxLength) {
		this.maxLength = maxLength;
	}

	public Map<String, io.apicurio.datamodels.openapi.v20.Schema> getProperties() {
		return properties;
	}

	public void setProperties(java.util.Map<String, io.apicurio.datamodels.openapi.v20.Schema> properties) {
		this.properties = properties;
	}

	public void accept(IVisitor visitor) {
		visitor.visitSchema(this);
	}
}