
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
    "maxMessagesPerPoll",
    "delay",
    "delete"
})
public class Params {

    @JsonProperty("maxMessagesPerPoll")
    private String maxMessagesPerPoll;
    @JsonProperty("delay")
    private String delay;
    @JsonProperty("delete")
    private String delete;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The maxMessagesPerPoll
     */
    @JsonProperty("maxMessagesPerPoll")
    public String getMaxMessagesPerPoll() {
        return maxMessagesPerPoll;
    }

    /**
     * 
     * @param maxMessagesPerPoll
     *     The maxMessagesPerPoll
     */
    @JsonProperty("maxMessagesPerPoll")
    public void setMaxMessagesPerPoll(String maxMessagesPerPoll) {
        this.maxMessagesPerPoll = maxMessagesPerPoll;
    }

    /**
     * 
     * @return
     *     The delay
     */
    @JsonProperty("delay")
    public String getDelay() {
        return delay;
    }

    /**
     * 
     * @param delay
     *     The delay
     */
    @JsonProperty("delay")
    public void setDelay(String delay) {
        this.delay = delay;
    }

    /**
     * 
     * @return
     *     The delete
     */
    @JsonProperty("delete")
    public String getDelete() {
        return delete;
    }

    /**
     * 
     * @param delete
     *     The delete
     */
    @JsonProperty("delete")
    public void setDelete(String delete) {
        this.delete = delete;
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
