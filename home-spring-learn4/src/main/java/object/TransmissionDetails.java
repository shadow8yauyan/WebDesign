
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
    "TranmissionType",
    "CSType",
    "Setupdetails"
})
public class TransmissionDetails {

    @JsonProperty("TranmissionType")
    private String tranmissionType;
    @JsonProperty("CSType")
    private String cSType;
    @JsonProperty("Setupdetails")
    private Setupdetails setupdetails;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The tranmissionType
     */
    @JsonProperty("TranmissionType")
    public String getTranmissionType() {
        return tranmissionType;
    }

    /**
     * 
     * @param tranmissionType
     *     The TranmissionType
     */
    @JsonProperty("TranmissionType")
    public void setTranmissionType(String tranmissionType) {
        this.tranmissionType = tranmissionType;
    }

    /**
     * 
     * @return
     *     The cSType
     */
    @JsonProperty("CSType")
    public String getCSType() {
        return cSType;
    }

    /**
     * 
     * @param cSType
     *     The CSType
     */
    @JsonProperty("CSType")
    public void setCSType(String cSType) {
        this.cSType = cSType;
    }

    /**
     * 
     * @return
     *     The setupdetails
     */
    @JsonProperty("Setupdetails")
    public Setupdetails getSetupdetails() {
        return setupdetails;
    }

    /**
     * 
     * @param setupdetails
     *     The Setupdetails
     */
    @JsonProperty("Setupdetails")
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
