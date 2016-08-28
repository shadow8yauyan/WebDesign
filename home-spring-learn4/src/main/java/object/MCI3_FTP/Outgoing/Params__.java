
package object.MCI3_FTP.Outgoing;

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
    "exchangePattern"
})
public class Params__ {

    @JsonProperty("exchangePattern")
    private String exchangePattern;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The exchangePattern
     */
    @JsonProperty("exchangePattern")
    public String getExchangePattern() {
        return exchangePattern;
    }

    /**
     * 
     * @param exchangePattern
     *     The exchangePattern
     */
    @JsonProperty("exchangePattern")
    public void setExchangePattern(String exchangePattern) {
        this.exchangePattern = exchangePattern;
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
