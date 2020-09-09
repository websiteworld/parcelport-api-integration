package world.website.parcelportnz.client.response;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "code", "gstPrice", "price", "name", "description", "type" })
public class AddOn {

	@JsonProperty("code")
	private String code;
	@JsonProperty("gstPrice")
	private Float gstPrice;
	@JsonProperty("price")
	private Float price;
	@JsonProperty("name")
	private String name;
	@JsonProperty("description")
	private String description;
	@JsonProperty("type")
	private Integer type;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("code")
	public String getCode() {
		return code;
	}

	@JsonProperty("code")
	public void setCode(String code) {
		this.code = code;
	}

	@JsonProperty("gstPrice")
	public Float getGstPrice() {
		return gstPrice;
	}

	@JsonProperty("gstPrice")
	public void setGstPrice(Float gstPrice) {
		this.gstPrice = gstPrice;
	}

	@JsonProperty("price")
	public Float getPrice() {
		return price;
	}

	@JsonProperty("price")
	public void setPrice(Float price) {
		this.price = price;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("type")
	public Integer getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(Integer type) {
		this.type = type;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
