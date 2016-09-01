
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
    "msgType",
    "MsgTypeB2B",
    "ediStandard",
    "productionInfo",
    "testingInfo",
    "status"
})
public class MsgCfg {

    @JsonProperty("msgType")
    private String msgType;
    @JsonProperty("MsgTypeB2B")
    private String msgTypeB2B;
    @JsonProperty("ediStandard")
    private String ediStandard;
    @JsonProperty("productionInfo")
    private ProductionInfo productionInfo;
    @JsonProperty("testingInfo")
    private TestingInfo testingInfo;
    @JsonProperty("status")
    private String status;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
     *     The msgTypeB2B
     */
    @JsonProperty("MsgTypeB2B")
    public String getMsgTypeB2B() {
        return msgTypeB2B;
    }

    /**
     * 
     * @param msgTypeB2B
     *     The MsgTypeB2B
     */
    @JsonProperty("MsgTypeB2B")
    public void setMsgTypeB2B(String msgTypeB2B) {
        this.msgTypeB2B = msgTypeB2B;
    }

    /**
     * 
     * @return
     *     The ediStandard
     */
    @JsonProperty("ediStandard")
    public String getEdiStandard() {
        return ediStandard;
    }

    /**
     * 
     * @param ediStandard
     *     The ediStandard
     */
    @JsonProperty("ediStandard")
    public void setEdiStandard(String ediStandard) {
        this.ediStandard = ediStandard;
    }

    /**
     * 
     * @return
     *     The productionInfo
     */
    @JsonProperty("productionInfo")
    public ProductionInfo getProductionInfo() {
        return productionInfo;
    }

    /**
     * 
     * @param productionInfo
     *     The productionInfo
     */
    @JsonProperty("productionInfo")
    public void setProductionInfo(ProductionInfo productionInfo) {
        this.productionInfo = productionInfo;
    }

    /**
     * 
     * @return
     *     The testingInfo
     */
    @JsonProperty("testingInfo")
    public TestingInfo getTestingInfo() {
        return testingInfo;
    }

    /**
     * 
     * @param testingInfo
     *     The testingInfo
     */
    @JsonProperty("testingInfo")
    public void setTestingInfo(TestingInfo testingInfo) {
        this.testingInfo = testingInfo;
    }

    /**
     * 
     * @return
     *     The status
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
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
