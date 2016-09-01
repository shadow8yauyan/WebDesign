
package object.InputDTO;

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
    "basicInformation",
    "msgCfg",
    "transmissionDetails",
    "remarks"
})
public class ApiInterface {

    @JsonProperty("basicInformation")
    private BasicInformation basicInformation;
    @JsonProperty("msgCfg")
    private List<MsgCfg> msgCfg = new ArrayList<MsgCfg>();
    @JsonProperty("transmissionDetails")
    private TransmissionDetails transmissionDetails;
    @JsonProperty("remarks")
    private Remarks remarks;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The basicInformation
     */
    @JsonProperty("basicInformation")
    public BasicInformation getBasicInformation() {
        return basicInformation;
    }

    /**
     * 
     * @param basicInformation
     *     The basicInformation
     */
    @JsonProperty("basicInformation")
    public void setBasicInformation(BasicInformation basicInformation) {
        this.basicInformation = basicInformation;
    }

    /**
     * 
     * @return
     *     The msgCfg
     */
    @JsonProperty("msgCfg")
    public List<MsgCfg> getMsgCfg() {
        return msgCfg;
    }

    /**
     * 
     * @param msgCfg
     *     The msgCfg
     */
    @JsonProperty("msgCfg")
    public void setMsgCfg(List<MsgCfg> msgCfg) {
        this.msgCfg = msgCfg;
    }

    /**
     * 
     * @return
     *     The transmissionDetails
     */
    @JsonProperty("transmissionDetails")
    public TransmissionDetails getTransmissionDetails() {
        return transmissionDetails;
    }

    /**
     * 
     * @param transmissionDetails
     *     The transmissionDetails
     */
    @JsonProperty("transmissionDetails")
    public void setTransmissionDetails(TransmissionDetails transmissionDetails) {
        this.transmissionDetails = transmissionDetails;
    }

    /**
     * 
     * @return
     *     The remarks
     */
    @JsonProperty("remarks")
    public Remarks getRemarks() {
        return remarks;
    }

    /**
     * 
     * @param remarks
     *     The remarks
     */
    @JsonProperty("remarks")
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
