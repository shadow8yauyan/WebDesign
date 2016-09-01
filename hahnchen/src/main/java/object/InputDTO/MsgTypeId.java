
package object.InputDTO;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "defaultVar",
    "location",
    "translate"
})
public class MsgTypeId {

    @JsonProperty("defaultVar")
    private String defaultVar;
    @JsonProperty("location")
    private String location;
    @JsonProperty("translate")
    private String translate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The defaultVar
     */
    @JsonProperty("defaultVar")
    public String getDefaultVar() {
        return defaultVar;
    }

    /**
     * 
     * @param defaultVar
     *     The defaultVar
     */
    @JsonProperty("defaultVar")
    public void setDefaultVar(String defaultVar) {
        this.defaultVar = defaultVar;
    }

    /**
     * 
     * @return
     *     The location
     */
    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     *     The location
     */
    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * 
     * @return
     *     The translate
     */
    @JsonProperty("translate")
    public String getTranslate() {
        return translate;
    }

    /**
     * 
     * @param translate
     *     The translate
     */
    @JsonProperty("translate")
    public void setTranslate(String translate) {
        this.translate = translate;
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
