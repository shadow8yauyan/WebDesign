
package object;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "BasicInformation",
    "MsgCfg",
    "TransmissionDetails",
    "Remarks"
})
public class ApiInterface {

    @JsonProperty("BasicInformation")
    private BasicInformation basicInformation;
    @JsonProperty("MsgCfg")
    private List<MsgCfg> msgCfg = new ArrayList<MsgCfg>();
    @JsonProperty("TransmissionDetails")
    private TransmissionDetails transmissionDetails;
    @JsonProperty("Remarks")
    private Remarks remarks;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The basicInformation
     */
    @JsonProperty("BasicInformation")
    public BasicInformation getBasicInformation() {
        return basicInformation;
    }

    /**
     * 
     * @param basicInformation
     *     The BasicInformation
     */
    @JsonProperty("BasicInformation")
    public void setBasicInformation(BasicInformation basicInformation) {
        this.basicInformation = basicInformation;
    }

    /**
     * 
     * @return
     *     The msgCfg
     */
    @JsonProperty("MsgCfg")
    public List<MsgCfg> getMsgCfg() {
        return msgCfg;
    }

    /**
     * 
     * @param msgCfg
     *     The MsgCfg
     */
    @JsonProperty("MsgCfg")
    public void setMsgCfg(List<MsgCfg> msgCfg) {
        this.msgCfg = msgCfg;
    }

    /**
     * 
     * @return
     *     The transmissionDetails
     */
    @JsonProperty("TransmissionDetails")
    public TransmissionDetails getTransmissionDetails() {
        return transmissionDetails;
    }

    /**
     * 
     * @param transmissionDetails
     *     The TransmissionDetails
     */
    @JsonProperty("TransmissionDetails")
    public void setTransmissionDetails(TransmissionDetails transmissionDetails) {
        this.transmissionDetails = transmissionDetails;
    }

    /**
     * 
     * @return
     *     The remarks
     */
    @JsonProperty("Remarks")
    public Remarks getRemarks() {
        return remarks;
    }

    /**
     * 
     * @param remarks
     *     The Remarks
     */
    @JsonProperty("Remarks")
    public void setRemarks(Remarks remarks) {
        this.remarks = remarks;
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
