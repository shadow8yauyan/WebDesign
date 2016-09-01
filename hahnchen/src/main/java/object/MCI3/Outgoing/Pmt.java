
package object.MCI3.Outgoing;

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
    "tpId",
    "msgType",
    "msgFormat"
})
public class Pmt {

    @JsonProperty("tpId")
    private String tpId;
    @JsonProperty("msgType")
    private String msgType;
    @JsonProperty("msgFormat")
    private String msgFormat;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The tpId
     */
    @JsonProperty("tpId")
    public String getTpId() {
        return tpId;
    }

    /**
     * 
     * @param tpId
     *     The tpId
     */
    @JsonProperty("tpId")
    public void setTpId(String tpId) {
        this.tpId = tpId;
    }

    /**
     * 
     * @return
     *     The msgType
     */
    @JsonProperty("msgType")
    public String getMsgType() {
        return msgType;
    }

    /**
     * 
     * @param msgType
     *     The msgType
     */
    @JsonProperty("msgType")
    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    /**
     * 
     * @return
     *     The msgFormat
     */
    @JsonProperty("msgFormat")
    public String getMsgFormat() {
        return msgFormat;
    }

    /**
     * 
     * @param msgFormat
     *     The msgFormat
     */
    @JsonProperty("msgFormat")
    public void setMsgFormat(String msgFormat) {
        this.msgFormat = msgFormat;
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
