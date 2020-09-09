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
@JsonPropertyOrder({ "expiryDate", "quoteRequestID", "errorMessage", "errors", "quotes" })
public class ParcelPortQuote {

	@JsonProperty("expiryDate")
	private String expiryDate;
	@JsonProperty("quoteRequestID")
	private String quoteRequestID;
	@JsonProperty("errorMessage")
	private Object errorMessage;
	@JsonProperty("errors")
	private Errors errors;
	@JsonProperty("quotes")
	private List<Quote> quotes = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("expiryDate")
	public String getExpiryDate() {
		return expiryDate;
	}

	@JsonProperty("expiryDate")
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	@JsonProperty("quoteRequestID")
	public String getQuoteRequestID() {
		return quoteRequestID;
	}

	@JsonProperty("quoteRequestID")
	public void setQuoteRequestID(String quoteRequestID) {
		this.quoteRequestID = quoteRequestID;
	}

	@JsonProperty("errorMessage")
	public Object getErrorMessage() {
		return errorMessage;
	}

	@JsonProperty("errorMessage")
	public void setErrorMessage(Object errorMessage) {
		this.errorMessage = errorMessage;
	}

	@JsonProperty("errors")
	public Errors getErrors() {
		return errors;
	}

	@JsonProperty("errors")
	public void setErrors(Errors errors) {
		this.errors = errors;
	}

	@JsonProperty("quotes")
	public List<Quote> getQuotes() {
		return quotes;
	}

	@JsonProperty("quotes")
	public void setQuotes(List<Quote> quotes) {
		this.quotes = quotes;
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
