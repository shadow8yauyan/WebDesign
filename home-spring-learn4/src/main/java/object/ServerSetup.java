
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
    "URL",
    "loginID",
    "Password"
})
public class ServerSetup {

    @JsonProperty("URL")
    private String uRL;
    @JsonProperty("loginID")
    private String loginID;
    @JsonProperty("Password")
    private String password;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The uRL
     */
    @JsonProperty("URL")
    public String getURL() {
        return uRL;
    }

    /**
     * 
     * @param uRL
     *     The URL
     */
    @JsonProperty("URL")
    public void setURL(String uRL) {
        this.uRL = uRL;
    }

    /**
     * 
     * @return
     *     The loginID
     */
    @JsonProperty("loginID")
    public String getLoginID() {
        return loginID;
    }

    /**
     * 
     * @param loginID
     *     The loginID
     */
    @JsonProperty("loginID")
    public void setLoginID(String loginID) {
        this.loginID = loginID;
    }

    /**
     * 
     * @return
     *     The password
     */
    @JsonProperty("Password")
    public String getPassword() {
        return password;
    }

    /**
     * 
     * @param password
     *     The Password
     */
    @JsonProperty("Password")
    public void setPassword(String password) {
        this.password = password;
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
