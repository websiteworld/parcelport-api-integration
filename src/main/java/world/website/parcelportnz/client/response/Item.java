package world.website.parcelportnz.client.response;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "volume", "cost_sat", "pack_name", "pc", "cost", "group_id", "kind", "weight", "cost_sig",
		"cust_ref", "cost_rural", "cost_net" })
public class Item {

	@JsonProperty("volume")
	private Integer volume;
	@JsonProperty("cost_sat")
	private Integer costSat;
	@JsonProperty("pack_name")
	private Object packName;
	@JsonProperty("pc")
	private Integer pc;
	@JsonProperty("cost")
	private BigDecimal cost;
	@JsonProperty("group_id")
	private Object groupId;
	@JsonProperty("kind")
	private Object kind;
	@JsonProperty("weight")
	private Integer weight;
	@JsonProperty("cost_sig")
	private Integer costSig;
	@JsonProperty("cust_ref")
	private Object custRef;
	@JsonProperty("cost_rural")
	private Integer costRural;
	@JsonProperty("cost_net")
	private Integer costNet;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("volume")
	public Integer getVolume() {
		return volume;
	}

	@JsonProperty("volume")
	public void setVolume(Integer volume) {
		this.volume = volume;
	}

	@JsonProperty("cost_sat")
	public Integer getCostSat() {
		return costSat;
	}

	@JsonProperty("cost_sat")
	public void setCostSat(Integer costSat) {
		this.costSat = costSat;
	}

	@JsonProperty("pack_name")
	public Object getPackName() {
		return packName;
	}

	@JsonProperty("pack_name")
	public void setPackName(Object packName) {
		this.packName = packName;
	}

	@JsonProperty("pc")
	public Integer getPc() {
		return pc;
	}

	@JsonProperty("pc")
	public void setPc(Integer pc) {
		this.pc = pc;
	}

	@JsonProperty("cost")
	public BigDecimal getCost() {
		return cost;
	}

	@JsonProperty("cost")
	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

	@JsonProperty("group_id")
	public Object getGroupId() {
		return groupId;
	}

	@JsonProperty("group_id")
	public void setGroupId(Object groupId) {
		this.groupId = groupId;
	}

	@JsonProperty("kind")
	public Object getKind() {
		return kind;
	}

	@JsonProperty("kind")
	public void setKind(Object kind) {
		this.kind = kind;
	}

	@JsonProperty("weight")
	public Integer getWeight() {
		return weight;
	}

	@JsonProperty("weight")
	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	@JsonProperty("cost_sig")
	public Integer getCostSig() {
		return costSig;
	}

	@JsonProperty("cost_sig")
	public void setCostSig(Integer costSig) {
		this.costSig = costSig;
	}

	@JsonProperty("cust_ref")
	public Object getCustRef() {
		return custRef;
	}

	@JsonProperty("cust_ref")
	public void setCustRef(Object custRef) {
		this.custRef = custRef;
	}

	@JsonProperty("cost_rural")
	public Integer getCostRural() {
		return costRural;
	}

	@JsonProperty("cost_rural")
	public void setCostRural(Integer costRural) {
		this.costRural = costRural;
	}

	@JsonProperty("cost_net")
	public Integer getCostNet() {
		return costNet;
	}

	@JsonProperty("cost_net")
	public void setCostNet(Integer costNet) {
		this.costNet = costNet;
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