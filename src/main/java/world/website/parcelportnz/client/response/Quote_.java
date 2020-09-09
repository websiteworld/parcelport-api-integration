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
@JsonPropertyOrder({ "packageDetails", "insurance", "interchangeType", "carrier_method_code", "max_delivery_target",
		"carrier_method_name", "carrier_method_desc", "price_satchel", "tracking_included", "carrier_method_notesHtml",
		"carrier_id", "interchangeBrachCode", "is_signature", "interchangeAddress", "carrier_method_id",
		"min_delivery_target", "carrier_name", "items", "signature_included" })
public class Quote_ {

	@JsonProperty("packageDetails")
	private PackageDetails packageDetails;
	@JsonProperty("insurance")
	private Integer insurance;
	@JsonProperty("interchangeType")
	private Integer interchangeType;
	@JsonProperty("carrier_method_code")
	private String carrierMethodCode;
	@JsonProperty("max_delivery_target")
	private Object maxDeliveryTarget;
	@JsonProperty("carrier_method_name")
	private String carrierMethodName;
	@JsonProperty("carrier_method_desc")
	private String carrierMethodDesc;
	@JsonProperty("price_satchel")
	private Integer priceSatchel;
	@JsonProperty("tracking_included")
	private String trackingIncluded;
	@JsonProperty("carrier_method_notesHtml")
	private Object carrierMethodNotesHtml;
	@JsonProperty("carrier_id")
	private String carrierId;
	@JsonProperty("interchangeBrachCode")
	private Object interchangeBrachCode;
	@JsonProperty("is_signature")
	private Object isSignature;
	@JsonProperty("interchangeAddress")
	private Object interchangeAddress;
	@JsonProperty("carrier_method_id")
	private String carrierMethodId;
	@JsonProperty("min_delivery_target")
	private Object minDeliveryTarget;
	@JsonProperty("carrier_name")
	private String carrierName;
	@JsonProperty("items")
	private List<Item> items = null;
	@JsonProperty("signature_included")
	private String signatureIncluded;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("packageDetails")
	public PackageDetails getPackageDetails() {
		return packageDetails;
	}

	@JsonProperty("packageDetails")
	public void setPackageDetails(PackageDetails packageDetails) {
		this.packageDetails = packageDetails;
	}

	@JsonProperty("insurance")
	public Integer getInsurance() {
		return insurance;
	}

	@JsonProperty("insurance")
	public void setInsurance(Integer insurance) {
		this.insurance = insurance;
	}

	@JsonProperty("interchangeType")
	public Integer getInterchangeType() {
		return interchangeType;
	}

	@JsonProperty("interchangeType")
	public void setInterchangeType(Integer interchangeType) {
		this.interchangeType = interchangeType;
	}

	@JsonProperty("carrier_method_code")
	public String getCarrierMethodCode() {
		return carrierMethodCode;
	}

	@JsonProperty("carrier_method_code")
	public void setCarrierMethodCode(String carrierMethodCode) {
		this.carrierMethodCode = carrierMethodCode;
	}

	@JsonProperty("max_delivery_target")
	public Object getMaxDeliveryTarget() {
		return maxDeliveryTarget;
	}

	@JsonProperty("max_delivery_target")
	public void setMaxDeliveryTarget(Object maxDeliveryTarget) {
		this.maxDeliveryTarget = maxDeliveryTarget;
	}

	@JsonProperty("carrier_method_name")
	public String getCarrierMethodName() {
		return carrierMethodName;
	}

	@JsonProperty("carrier_method_name")
	public void setCarrierMethodName(String carrierMethodName) {
		this.carrierMethodName = carrierMethodName;
	}

	@JsonProperty("carrier_method_desc")
	public String getCarrierMethodDesc() {
		return carrierMethodDesc;
	}

	@JsonProperty("carrier_method_desc")
	public void setCarrierMethodDesc(String carrierMethodDesc) {
		this.carrierMethodDesc = carrierMethodDesc;
	}

	@JsonProperty("price_satchel")
	public Integer getPriceSatchel() {
		return priceSatchel;
	}

	@JsonProperty("price_satchel")
	public void setPriceSatchel(Integer priceSatchel) {
		this.priceSatchel = priceSatchel;
	}

	@JsonProperty("tracking_included")
	public String getTrackingIncluded() {
		return trackingIncluded;
	}

	@JsonProperty("tracking_included")
	public void setTrackingIncluded(String trackingIncluded) {
		this.trackingIncluded = trackingIncluded;
	}

	@JsonProperty("carrier_method_notesHtml")
	public Object getCarrierMethodNotesHtml() {
		return carrierMethodNotesHtml;
	}

	@JsonProperty("carrier_method_notesHtml")
	public void setCarrierMethodNotesHtml(Object carrierMethodNotesHtml) {
		this.carrierMethodNotesHtml = carrierMethodNotesHtml;
	}

	@JsonProperty("carrier_id")
	public String getCarrierId() {
		return carrierId;
	}

	@JsonProperty("carrier_id")
	public void setCarrierId(String carrierId) {
		this.carrierId = carrierId;
	}

	@JsonProperty("interchangeBrachCode")
	public Object getInterchangeBrachCode() {
		return interchangeBrachCode;
	}

	@JsonProperty("interchangeBrachCode")
	public void setInterchangeBrachCode(Object interchangeBrachCode) {
		this.interchangeBrachCode = interchangeBrachCode;
	}

	@JsonProperty("is_signature")
	public Object getIsSignature() {
		return isSignature;
	}

	@JsonProperty("is_signature")
	public void setIsSignature(Object isSignature) {
		this.isSignature = isSignature;
	}

	@JsonProperty("interchangeAddress")
	public Object getInterchangeAddress() {
		return interchangeAddress;
	}

	@JsonProperty("interchangeAddress")
	public void setInterchangeAddress(Object interchangeAddress) {
		this.interchangeAddress = interchangeAddress;
	}

	@JsonProperty("carrier_method_id")
	public String getCarrierMethodId() {
		return carrierMethodId;
	}

	@JsonProperty("carrier_method_id")
	public void setCarrierMethodId(String carrierMethodId) {
		this.carrierMethodId = carrierMethodId;
	}

	@JsonProperty("min_delivery_target")
	public Object getMinDeliveryTarget() {
		return minDeliveryTarget;
	}

	@JsonProperty("min_delivery_target")
	public void setMinDeliveryTarget(Object minDeliveryTarget) {
		this.minDeliveryTarget = minDeliveryTarget;
	}

	@JsonProperty("carrier_name")
	public String getCarrierName() {
		return carrierName;
	}

	@JsonProperty("carrier_name")
	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}

	@JsonProperty("items")
	public List<Item> getItems() {
		return items;
	}

	@JsonProperty("items")
	public void setItems(List<Item> items) {
		this.items = items;
	}

	@JsonProperty("signature_included")
	public String getSignatureIncluded() {
		return signatureIncluded;
	}

	@JsonProperty("signature_included")
	public void setSignatureIncluded(String signatureIncluded) {
		this.signatureIncluded = signatureIncluded;
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
