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
@JsonPropertyOrder({
"goddards",
"nw"
})
public class Errors {

@JsonProperty("goddards")
private List<String> goddards = null;
@JsonProperty("nw")
private List<String> nw = null;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("goddards")
public List<String> getGoddards() {
return goddards;
}

@JsonProperty("goddards")
public void setGoddards(List<String> goddards) {
this.goddards = goddards;
}

@JsonProperty("nw")
public List<String> getNw() {
return nw;
}

@JsonProperty("nw")
public void setNw(List<String> nw) {
this.nw = nw;
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