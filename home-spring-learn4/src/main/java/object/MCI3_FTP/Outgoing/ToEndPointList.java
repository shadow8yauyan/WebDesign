
package object.MCI3_FTP.Outgoing;

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
    "id",
    "uri",
    "params",
    "pmt",
    "ackEndPoint"
})
public class ToEndPointList {

    @JsonProperty("id")
    private String id;
    @JsonProperty("uri")
    private String uri;
    @JsonProperty("params")
    private Params_ params;
    @JsonProperty("pmt")
    private Pmt pmt;
    @JsonProperty("ackEndPoint")
    private AckEndPoint ackEndPoint;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The uri
     */
    @JsonProperty("uri")
    public String getUri() {
        return uri;
    }

    /**
     * 
     * @param uri
     *     The uri
     */
    @JsonProperty("uri")
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * 
     * @return
     *     The params
     */
    @JsonProperty("params")
    public Params_ getParams() {
        return params;
    }

    /**
     * 
     * @param params
     *     The params
     */
    @JsonProperty("params")
    public void setParams(Params_ params) {
        this.params = params;
    }

    /**
     * 
     * @return
     *     The pmt
     */
    @JsonProperty("pmt")
    public Pmt getPmt() {
        return pmt;
    }

    /**
     * 
     * @param pmt
     *     The pmt
     */
    @JsonProperty("pmt")
    public void setPmt(Pmt pmt) {
        this.pmt = pmt;
    }

    /**
     * 
     * @return
     *     The ackEndPoint
     */
    @JsonProperty("ackEndPoint")
    public AckEndPoint getAckEndPoint() {
        return ackEndPoint;
    }

    /**
     * 
     * @param ackEndPoint
     *     The ackEndPoint
     */
    @JsonProperty("ackEndPoint")
    public void setAckEndPoint(AckEndPoint ackEndPoint) {
        this.ackEndPoint = ackEndPoint;
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
