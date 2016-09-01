
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
    "interchangeID",
    "folderPath"
})
public class TestingInfo {

    @JsonProperty("interchangeID")
    private String interchangeID;
    @JsonProperty("folderPath")
    private String folderPath;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The interchangeID
     */
    @JsonProperty("interchangeID")
    public String getInterchangeID() {
        return interchangeID;
    }

    /**
     * 
     * @param interchangeID
     *     The interchangeID
     */
    @JsonProperty("interchangeID")
    public void setInterchangeID(String interchangeID) {
        this.interchangeID = interchangeID;
    }

    /**
     * 
     * @return
     *     The folderPath
     */
    @JsonProperty("folderPath")
    public String getFolderPath() {
        return folderPath;
    }

    /**
     * 
     * @param folderPath
     *     The folderPath
     */
    @JsonProperty("folderPath")
    public void setFolderPath(String folderPath) {
        this.folderPath = folderPath;
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
