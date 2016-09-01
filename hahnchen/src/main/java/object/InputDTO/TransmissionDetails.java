
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
    "tranmissionType",
    "csType",
    "setupdetails"
})
public class TransmissionDetails {

    @JsonProperty("tranmissionType")
    private String tranmissionType;
    @JsonProperty("csType")
    private String csType;
    @JsonProperty("setupdetails")
    private Setupdetails setupdetails;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The tranmissionType
     */
    @JsonProperty("tranmissionType")
    public String getTranmissionType() {
        return tranmissionType;
    }

    /**
     * 
     * @param tranmissionType
     *     The tranmissionType
     */
    @JsonProperty("tranmissionType")
    public void setTranmissionType(String tranmissionType) {
        this.tranmissionType = tranmissionType;
    }

    /**
     * 
     * @return
     *     The csType
     */
    @JsonProperty("csType")
    public String getCsType() {
        return csType;
    }

    /**
     * 
     * @param csType
     *     The csType
     */
    @JsonProperty("csType")
    public void setCsType(String csType) {
        this.csType = csType;
    }

    /**
     * 
     * @return
     *     The setupdetails
     */
    @JsonProperty("setupdetails")
    public Setupdetails getSetupdetails() {
        return setupdetails;
    }

    /**
     * 
     * @param setupdetails
     *     The setupdetails
     */
    @JsonProperty("setupdetails")
    public void setSetupdetails(Setupdetails setupdetails) {
        this.setupdetails = setupdetails;
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
