
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
    "environment",
    "transmissionTools",
    "transmissionMethod",
    "tpid",
    "direction",
    "srcEncoding",
    "destEncoding",
    "recognize"
})
public class BasicInformation {

    @JsonProperty("environment")
    private String environment;
    @JsonProperty("transmissionTools")
    private String transmissionTools;
    @JsonProperty("transmissionMethod")
    private String transmissionMethod;
    @JsonProperty("tpid")
    private String tpid;
    @JsonProperty("direction")
    private String direction;
    @JsonProperty("srcEncoding")
    private String srcEncoding;
    @JsonProperty("destEncoding")
    private String destEncoding;
    @JsonProperty("recognize")
    private Recognize recognize;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The environment
     */
    @JsonProperty("environment")
    public String getEnvironment() {
        return environment;
    }

    /**
     * 
     * @param environment
     *     The environment
     */
    @JsonProperty("environment")
    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    /**
     * 
     * @return
     *     The transmissionTools
     */
    @JsonProperty("transmissionTools")
    public String getTransmissionTools() {
        return transmissionTools;
    }

    /**
     * 
     * @param transmissionTools
     *     The transmissionTools
     */
    @JsonProperty("transmissionTools")
    public void setTransmissionTools(String transmissionTools) {
        this.transmissionTools = transmissionTools;
    }

    /**
     * 
     * @return
     *     The transmissionMethod
     */
    @JsonProperty("transmissionMethod")
    public String getTransmissionMethod() {
        return transmissionMethod;
    }

    /**
     * 
     * @param transmissionMethod
     *     The transmissionMethod
     */
    @JsonProperty("transmissionMethod")
    public void setTransmissionMethod(String transmissionMethod) {
        this.transmissionMethod = transmissionMethod;
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
     * @param tpid
     *     The tpid
     */
    @JsonProperty("tpid")
    public void setTpid(String tpid) {
        this.tpid = tpid;
    }

    /**
     * 
     * @return
     *     The direction
     */
    @JsonProperty("direction")
    public String getDirection() {
        return direction;
    }

    /**
     * 
     * @param direction
     *     The direction
     */
    @JsonProperty("direction")
    public void setDirection(String direction) {
        this.direction = direction;
    }

    /**
     * 
     * @return
     *     The srcEncoding
     */
    @JsonProperty("srcEncoding")
    public String getSrcEncoding() {
        return srcEncoding;
    }

    /**
     * 
     * @param srcEncoding
     *     The srcEncoding
     */
    @JsonProperty("srcEncoding")
    public void setSrcEncoding(String srcEncoding) {
        this.srcEncoding = srcEncoding;
    }

    /**
     * 
     * @return
     *     The destEncoding
     */
    @JsonProperty("destEncoding")
    public String getDestEncoding() {
        return destEncoding;
    }

    /**
     * 
     * @param destEncoding
     *     The destEncoding
     */
    @JsonProperty("destEncoding")
    public void setDestEncoding(String destEncoding) {
        this.destEncoding = destEncoding;
    }

    /**
     * 
     * @return
     *     The recognize
     */
    @JsonProperty("recognize")
    public Recognize getRecognize() {
        return recognize;
    }

    /**
     * 
     * @param recognize
     *     The recognize
     */
    @JsonProperty("recognize")
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
