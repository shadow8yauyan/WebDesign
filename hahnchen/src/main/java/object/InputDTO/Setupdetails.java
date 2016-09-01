
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
    "environment",
    "serverSetup",
    "clientSteup",
    "incomingDetails"
})
public class Setupdetails {

    @JsonProperty("environment")
    private String environment;
    @JsonProperty("serverSetup")
    private ServerSetup serverSetup;
    @JsonProperty("clientSteup")
    private ClientSteup clientSteup;
    @JsonProperty("incomingDetails")
    private IncomingDetails incomingDetails;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The environment
     */
    @JsonProperty("environment")
    public String getEnvironment() {
        return environment;
    }

    /**
     * 
     * @param environment
     *     The environment
     */
    @JsonProperty("environment")
    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    /**
     * 
     * @return
     *     The serverSetup
     */
    @JsonProperty("serverSetup")
    public ServerSetup getServerSetup() {
        return serverSetup;
    }

    /**
     * 
     * @param serverSetup
     *     The serverSetup
     */
    @JsonProperty("serverSetup")
    public void setServerSetup(ServerSetup serverSetup) {
        this.serverSetup = serverSetup;
    }

    /**
     * 
     * @return
     *     The clientSteup
     */
    @JsonProperty("clientSteup")
    public ClientSteup getClientSteup() {
        return clientSteup;
    }

    /**
     * 
     * @param clientSteup
     *     The clientSteup
     */
    @JsonProperty("clientSteup")
    public void setClientSteup(ClientSteup clientSteup) {
        this.clientSteup = clientSteup;
    }

    /**
     * 
     * @return
     *     The incomingDetails
     */
    @JsonProperty("incomingDetails")
    public IncomingDetails getIncomingDetails() {
        return incomingDetails;
    }

    /**
     * 
     * @param incomingDetails
     *     The incomingDetails
     */
    @JsonProperty("incomingDetails")
    public void setIncomingDetails(IncomingDetails incomingDetails) {
        this.incomingDetails = incomingDetails;
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
