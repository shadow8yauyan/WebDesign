
package object.MCI3.Outgoing;

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
import object.InputDTO.BasicInformation;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "direction",
    "pmtCfgId",
    "srcEncoding",
    "destEncoding",
    "fromEndPoint",
    "toEndPointList"
})
public class MCI3_FTP_Interface {

    @JsonProperty("direction")
    private String direction;
    @JsonProperty("pmtCfgId")
    private String pmtCfgId;
    @JsonProperty("srcEncoding")
    private String srcEncoding;
    @JsonProperty("destEncoding")
    private String destEncoding;
    @JsonProperty("fromEndPoint")
    private FromEndPoint fromEndPoint;
    @JsonProperty("toEndPointList")
    private List<ToEndPointList> toEndPointList = new ArrayList<ToEndPointList>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
     *     The pmtCfgId
     */
    @JsonProperty("pmtCfgId")
    public String getPmtCfgId() {
        return pmtCfgId;
    }

    /**
     * 
     * @param pmtCfgId
     *     The pmtCfgId
     */
    @JsonProperty("pmtCfgId")
    public void setPmtCfgId(String pmtCfgId) {
        this.pmtCfgId = pmtCfgId;
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
     *     The fromEndPoint
     */
    @JsonProperty("fromEndPoint")
    public FromEndPoint getFromEndPoint() {
        return fromEndPoint;
    }

    /**
     * 
     * @param fromEndPoint
     *     The fromEndPoint
     */
    @JsonProperty("fromEndPoint")
    public void setFromEndPoint(FromEndPoint fromEndPoint) {
        this.fromEndPoint = fromEndPoint;
    }

    /**
     * 
     * @return
     *     The toEndPointList
     */
    @JsonProperty("toEndPointList")
    public List<ToEndPointList> getToEndPointList() {
        return toEndPointList;
    }

    /**
     * 
     * @param toEndPointList
     *     The toEndPointList
     */
    @JsonProperty("toEndPointList")
    public void setToEndPointList(List<ToEndPointList> toEndPointList) {
        this.toEndPointList = toEndPointList;
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
