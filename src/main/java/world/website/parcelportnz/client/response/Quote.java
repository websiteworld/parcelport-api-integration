package world.website.parcelportnz.client.response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "quoteDetails", "quoteType" })
public class Quote {

	@JsonProperty("quoteDetails")
	private List<QuoteDetail> quoteDetails = null;
	@JsonProperty("quoteType")
	private QuoteType quoteType;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("quoteDetails")
	public List<QuoteDetail> getQuoteDetails() {
		return quoteDetails;
	}

	@JsonProperty("quoteDetails")
	public void setQuoteDetails(List<QuoteDetail> quoteDetails) {
		this.quoteDetails = quoteDetails;
	}

	@JsonProperty("quoteType")
	public QuoteType getQuoteType() {
		return quoteType;
	}

	@JsonProperty("quoteType")
	public void setQuoteType(QuoteType quoteType) {
		this.quoteType = quoteType;
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
