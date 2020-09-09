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
@JsonPropertyOrder({ "price_sat", "price_rural", "total_price", "kind", "addOns", "price", "price_net", "price_sig",
		"addOnPrice_Sig", "total_tax", "insuredAmount" })
public class PackageDetails {

	@JsonProperty("price_sat")
	private Integer priceSat;
	@JsonProperty("price_rural")
	private Integer priceRural;
	@JsonProperty("total_price")
	private Float totalPrice;
	@JsonProperty("kind")
	private Object kind;
	@JsonProperty("addOns")
	private List<AddOn> addOns = null;
	@JsonProperty("price")
	private Float price;
	@JsonProperty("price_net")
	private Float priceNet;
	@JsonProperty("price_sig")
	private Integer priceSig;
	@JsonProperty("addOnPrice_Sig")
	private Integer addOnPriceSig;
	@JsonProperty("total_tax")
	private Float totalTax;
	@JsonProperty("insuredAmount")
	private Integer insuredAmount;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("price_sat")
	public Integer getPriceSat() {
		return priceSat;
	}

	@JsonProperty("price_sat")
	public void setPriceSat(Integer priceSat) {
		this.priceSat = priceSat;
	}

	@JsonProperty("price_rural")
	public Integer getPriceRural() {
		return priceRural;
	}

	@JsonProperty("price_rural")
	public void setPriceRural(Integer priceRural) {
		this.priceRural = priceRural;
	}

	@JsonProperty("total_price")
	public Float getTotalPrice() {
		return totalPrice;
	}

	@JsonProperty("total_price")
	public void setTotalPrice(Float totalPrice) {
		this.totalPrice = totalPrice;
	}

	@JsonProperty("kind")
	public Object getKind() {
		return kind;
	}

	@JsonProperty("kind")
	public void setKind(Object kind) {
		this.kind = kind;
	}

	@JsonProperty("addOns")
	public List<AddOn> getAddOns() {
		return addOns;
	}

	@JsonProperty("addOns")
	public void setAddOns(List<AddOn> addOns) {
		this.addOns = addOns;
	}

	@JsonProperty("price")
	public Float getPrice() {
		return price;
	}

	@JsonProperty("price")
	public void setPrice(Float price) {
		this.price = price;
	}

	@JsonProperty("price_net")
	public Float getPriceNet() {
		return priceNet;
	}

	@JsonProperty("price_net")
	public void setPriceNet(Float priceNet) {
		this.priceNet = priceNet;
	}

	@JsonProperty("price_sig")
	public Integer getPriceSig() {
		return priceSig;
	}

	@JsonProperty("price_sig")
	public void setPriceSig(Integer priceSig) {
		this.priceSig = priceSig;
	}

	@JsonProperty("addOnPrice_Sig")
	public Integer getAddOnPriceSig() {
		return addOnPriceSig;
	}

	@JsonProperty("addOnPrice_Sig")
	public void setAddOnPriceSig(Integer addOnPriceSig) {
		this.addOnPriceSig = addOnPriceSig;
	}

	@JsonProperty("total_tax")
	public Float getTotalTax() {
		return totalTax;
	}

	@JsonProperty("total_tax")
	public void setTotalTax(Float totalTax) {
		this.totalTax = totalTax;
	}

	@JsonProperty("insuredAmount")
	public Integer getInsuredAmount() {
		return insuredAmount;
	}

	@JsonProperty("insuredAmount")
	public void setInsuredAmount(Integer insuredAmount) {
		this.insuredAmount = insuredAmount;
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