package io.apicurio.datamodels.openapi.v20;

import io.apicurio.datamodels.core.models.ExtensibleNode;
import io.apicurio.datamodels.openapi.v20.Schema;
import java.util.List;
import io.apicurio.datamodels.openapi.v20.Items;
import io.apicurio.datamodels.core.visitors.IVisitor;

public class Parameter extends ExtensibleNode {

	private io.apicurio.datamodels.openapi.v20.Schema schema;
	private Number multipleOf;
	private Integer maxItems;
	private String in;
	private Integer minLength;
	private String format;
	private String pattern;
	private String description;
	private String type;
	private String collectionFormat;
	private Boolean required;
	private List<String> _enum;
	private Boolean exclusiveMaximum;
	private Integer minItems;
	private Object _default;
	private Boolean allowEmptyValue;
	private Boolean uniqueItems;
	private String name;
	private Number maximum;
	private Boolean exclusiveMinimum;
	private io.apicurio.datamodels.openapi.v20.Items items;
	private Number minimum;
	private Integer maxLength;

	public Schema getSchema() {
		return schema;
	}

	public void setSchema(io.apicurio.datamodels.openapi.v20.Schema schema) {
		this.schema = schema;
	}

	public Number getMultipleOf() {
		return multipleOf;
	}

	public void setMultipleOf(Number multipleOf) {
		this.multipleOf = multipleOf;
	}

	public Integer getMaxItems() {
		return maxItems;
	}

	public void setMaxItems(Integer maxItems) {
		this.maxItems = maxItems;
	}

	public String getIn() {
		return in;
	}

	public void setIn(String in) {
		this.in = in;
	}

	public Integer getMinLength() {
		return minLength;
	}

	public void setMinLength(Integer minLength) {
		this.minLength = minLength;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCollectionFormat() {
		return collectionFormat;
	}

	public void setCollectionFormat(String collectionFormat) {
		this.collectionFormat = collectionFormat;
	}

	public Boolean isRequired() {
		return required;
	}

	public void setRequired(Boolean required) {
		this.required = required;
	}

	public List<String> getEnum() {
		return _enum;
	}

	public void setEnum(java.util.List<String> _enum) {
		this._enum = _enum;
	}

	public Boolean isExclusiveMaximum() {
		return exclusiveMaximum;
	}

	public void setExclusiveMaximum(Boolean exclusiveMaximum) {
		this.exclusiveMaximum = exclusiveMaximum;
	}

	public Integer getMinItems() {
		return minItems;
	}

	public void setMinItems(Integer minItems) {
		this.minItems = minItems;
	}

	public Object getDefault() {
		return _default;
	}

	public void setDefault(Object _default) {
		this._default = _default;
	}

	public Boolean isAllowEmptyValue() {
		return allowEmptyValue;
	}

	public void setAllowEmptyValue(Boolean allowEmptyValue) {
		this.allowEmptyValue = allowEmptyValue;
	}

	public Boolean isUniqueItems() {
		return uniqueItems;
	}

	public void setUniqueItems(Boolean uniqueItems) {
		this.uniqueItems = uniqueItems;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Number getMaximum() {
		return maximum;
	}

	public void setMaximum(Number maximum) {
		this.maximum = maximum;
	}

	public Boolean isExclusiveMinimum() {
		return exclusiveMinimum;
	}

	public void setExclusiveMinimum(Boolean exclusiveMinimum) {
		this.exclusiveMinimum = exclusiveMinimum;
	}

	public Items getItems() {
		return items;
	}

	public void setItems(io.apicurio.datamodels.openapi.v20.Items items) {
		this.items = items;
	}

	public Number getMinimum() {
		return minimum;
	}

	public void setMinimum(Number minimum) {
		this.minimum = minimum;
	}

	public Integer getMaxLength() {
		return maxLength;
	}

	public void setMaxLength(Integer maxLength) {
		this.maxLength = maxLength;
	}

	public void accept(IVisitor visitor) {
		visitor.visitParameter(this);
	}
}