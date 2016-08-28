
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
    "MsgType",
    "EdiStandard",
    "ProductionInfo",
    "TestingInfo"
})
public class MsgCfg {

    @JsonProperty("MsgType")
    private String msgType;
    @JsonProperty("EdiStandard")
    private String ediStandard;
    @JsonProperty("ProductionInfo")
    private ProductionInfo productionInfo;
    @JsonProperty("TestingInfo")
    private TestingInfo testingInfo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The msgType
     */
    @JsonProperty("MsgType")
    public String getMsgType() {
        return msgType;
    }

    /**
     * 
     * @param msgType
     *     The MsgType
     */
    @JsonProperty("MsgType")
    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    /**
     * 
     * @return
     *     The ediStandard
     */
    @JsonProperty("EdiStandard")
    public String getEdiStandard() {
        return ediStandard;
    }

    /**
     * 
     * @param ediStandard
     *     The EdiStandard
     */
    @JsonProperty("EdiStandard")
    public void setEdiStandard(String ediStandard) {
        this.ediStandard = ediStandard;
    }

    /**
     * 
     * @return
     *     The productionInfo
     */
    @JsonProperty("ProductionInfo")
    public ProductionInfo getProductionInfo() {
        return productionInfo;
    }

    /**
     * 
     * @param productionInfo
     *     The ProductionInfo
     */
    @JsonProperty("ProductionInfo")
    public void setProductionInfo(ProductionInfo productionInfo) {
        this.productionInfo = productionInfo;
    }

    /**
     * 
     * @return
     *     The testingInfo
     */
    @JsonProperty("TestingInfo")
    public TestingInfo getTestingInfo() {
        return testingInfo;
    }

    /**
     * 
     * @param testingInfo
     *     The TestingInfo
     */
    @JsonProperty("TestingInfo")
    public void setTestingInfo(TestingInfo testingInfo) {
        this.testingInfo = testingInfo;
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
