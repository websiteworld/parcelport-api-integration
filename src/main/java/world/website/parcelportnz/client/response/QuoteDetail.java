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
@JsonPropertyOrder({ "quote", "type" })
public class QuoteDetail {

	@JsonProperty("quote")
	private Quote_ quote;
	@JsonProperty("type")
	private Type type;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("quote")
	public Quote_ getQuote() {
		return quote;
	}

	@JsonProperty("quote")
	public void setQuote(Quote_ quote) {
		this.quote = quote;
	}

	@JsonProperty("type")
	public Type getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(Type type) {
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
