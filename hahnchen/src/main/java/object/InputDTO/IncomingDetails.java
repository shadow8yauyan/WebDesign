
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
    "id",
    "queue",
    "replyTo",
    "preserveMessageQos",
    "exchangePattern",
    "deliveryPersistent",
    "testConnectionOnStartup"
})
public class IncomingDetails {
    @JsonProperty("id")
    private String id;
    @JsonProperty("queue")
    private String queue;
    @JsonProperty("replyTo")
    private String replyTo;
    @JsonProperty("preserveMessageQos")
    private String preserveMessageQos;
    @JsonProperty("exchangePattern")
    private String exchangePattern;
    @JsonProperty("deliveryPersistent")
    private String deliveryPersistent;
    @JsonProperty("testConnectionOnStartup")
    private String testConnectionOnStartup;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     *     The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The queue
     */
    @JsonProperty("queue")
    public String getQueue() {
        return queue;
    }

    /**
     * 
     * @param queue
     *     The queue
     */
    @JsonProperty("queue")
    public void setQueue(String queue) {
        this.queue = queue;
    }

    /**
     * 
     * @return
     *     The replyTo
     */
    @JsonProperty("replyTo")
    public String getReplyTo() {
        return replyTo;
    }

    /**
     * 
     * @param replyTo
     *     The replyTo
     */
    @JsonProperty("replyTo")
    public void setReplyTo(String replyTo) {
        this.replyTo = replyTo;
    }

    /**
     * 
     * @return
     *     The preserveMessageQos
     */
    @JsonProperty("preserveMessageQos")
    public String getPreserveMessageQos() {
        return preserveMessageQos;
    }

    /**
     * 
     * @param preserveMessageQos
     *     The preserveMessageQos
     */
    @JsonProperty("preserveMessageQos")
    public void setPreserveMessageQos(String preserveMessageQos) {
        this.preserveMessageQos = preserveMessageQos;
    }

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

    /**
     * 
     * @return
     *     The deliveryPersistent
     */
    @JsonProperty("deliveryPersistent")
    public String getDeliveryPersistent() {
        return deliveryPersistent;
    }

    /**
     * 
     * @param deliveryPersistent
     *     The deliveryPersistent
     */
    @JsonProperty("deliveryPersistent")
    public void setDeliveryPersistent(String deliveryPersistent) {
        this.deliveryPersistent = deliveryPersistent;
    }

    /**
     * 
     * @return
     *     The testConnectionOnStartup
     */
    @JsonProperty("testConnectionOnStartup")
    public String getTestConnectionOnStartup() {
        return testConnectionOnStartup;
    }

    /**
     * 
     * @param testConnectionOnStartup
     *     The testConnectionOnStartup
     */
    @JsonProperty("testConnectionOnStartup")
    public void setTestConnectionOnStartup(String testConnectionOnStartup) {
        this.testConnectionOnStartup = testConnectionOnStartup;
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
