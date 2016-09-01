
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
    "type",
    "tpId",
    "msgTypeId"
})
public class Recognize {

    @JsonProperty("type")
    private String type;
    @JsonProperty("tpId")
    private TpId tpId;
    @JsonProperty("msgTypeId")
    private MsgTypeId msgTypeId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The tpId
     */
    @JsonProperty("tpId")
    public TpId getTpId() {
        return tpId;
    }

    /**
     * 
     * @param tpId
     *     The tpId
     */
    @JsonProperty("tpId")
    public void setTpId(TpId tpId) {
        this.tpId = tpId;
    }

    /**
     * 
     * @return
     *     The msgTypeId
     */
    @JsonProperty("msgTypeId")
    public MsgTypeId getMsgTypeId() {
        return msgTypeId;
    }

    /**
     * 
     * @param msgTypeId
     *     The msgTypeId
     */
    @JsonProperty("msgTypeId")
    public void setMsgTypeId(MsgTypeId msgTypeId) {
        this.msgTypeId = msgTypeId;
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
