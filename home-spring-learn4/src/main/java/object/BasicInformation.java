
package object;

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
    "Environment",
    "TransmissionTools",
    "TransmissionMethod",
    "Direction",
    "Recognize"
})
public class BasicInformation {

    @JsonProperty("Environment")
    private String environment;
    @JsonProperty("tpid")
    private String tpid;
    @JsonProperty("TransmissionTools")
    private String transmissionTools;
    @JsonProperty("TransmissionMethod")
    private String transmissionMethod;
    @JsonProperty("Direction")
    private String direction;
    @JsonProperty("Recognize")
    private Recognize recognize;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     *     The environment
     */
    @JsonProperty("Environment")
    public String getEnvironment() {
        return environment;
    }

    /**
     *
     * @param tpid
     *     The Environment
     */
    @JsonProperty("tpid")
    public void setTpid(String tpid) {
        this.tpid = tpid;
    }
    /**
     *
     * @return
     *     The tpid
     */
    @JsonProperty("tpid")
    public String getTpid() {
        return tpid;
    }

    /**
     *
     * @param environment
     *     The Environment
     */
    @JsonProperty("Environment")
    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    /**
     * 
     * @return
     *     The transmissionTools
     */
    @JsonProperty("TransmissionTools")
    public String getTransmissionTools() {
        return transmissionTools;
    }

    /**
     * 
     * @param transmissionTools
     *     The TransmissionTools
     */
    @JsonProperty("TransmissionTools")
    public void setTransmissionTools(String transmissionTools) {
        this.transmissionTools = transmissionTools;
    }

    /**
     * 
     * @return
     *     The transmissionMethod
     */
    @JsonProperty("TransmissionMethod")
    public String getTransmissionMethod() {
        return transmissionMethod;
    }

    /**
     * 
     * @param transmissionMethod
     *     The TransmissionMethod
     */
    @JsonProperty("TransmissionMethod")
    public void setTransmissionMethod(String transmissionMethod) {
        this.transmissionMethod = transmissionMethod;
    }

    /**
     * 
     * @return
     *     The direction
     */
    @JsonProperty("Direction")
    public String getDirection() {
        return direction;
    }

    /**
     * 
     * @param direction
     *     The Direction
     */
    @JsonProperty("Direction")
    public void setDirection(String direction) {
        this.direction = direction;
    }

    /**
     * 
     * @return
     *     The recognize
     */
    @JsonProperty("Recognize")
    public Recognize getRecognize() {
        return recognize;
    }

    /**
     * 
     * @param recognize
     *     The Recognize
     */
    @JsonProperty("Recognize")
    public void setRecognize(Recognize recognize) {
        this.recognize = recognize;
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
