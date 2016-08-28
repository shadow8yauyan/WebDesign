
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
    "username",
    "password",
    "binary",
    "delete",
    "disconnect",
    "passiveMode",
    "maximumReconnectAttempts",
    "reconnectDelay",
    "connectTimeout",
    "soTimeout",
    "ftpClient.proxyUrl"
})
public class Params_ {

    @JsonProperty("username")
    private String username;
    @JsonProperty("password")
    private String password;
    @JsonProperty("binary")
    private String binary;
    @JsonProperty("delete")
    private String delete;
    @JsonProperty("disconnect")
    private String disconnect;
    @JsonProperty("passiveMode")
    private String passiveMode;
    @JsonProperty("maximumReconnectAttempts")
    private String maximumReconnectAttempts;
    @JsonProperty("reconnectDelay")
    private String reconnectDelay;
    @JsonProperty("connectTimeout")
    private String connectTimeout;
    @JsonProperty("soTimeout")
    private String soTimeout;
    @JsonProperty("ftpClient.proxyUrl")
    private String ftpClientProxyUrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The username
     */
    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    /**
     * 
     * @param username
     *     The username
     */
    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 
     * @return
     *     The password
     */
    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    /**
     * 
     * @param password
     *     The password
     */
    @JsonProperty("password")
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 
     * @return
     *     The binary
     */
    @JsonProperty("binary")
    public String getBinary() {
        return binary;
    }

    /**
     * 
     * @param binary
     *     The binary
     */
    @JsonProperty("binary")
    public void setBinary(String binary) {
        this.binary = binary;
    }

    /**
     * 
     * @return
     *     The delete
     */
    @JsonProperty("delete")
    public String getDelete() {
        return delete;
    }

    /**
     * 
     * @param delete
     *     The delete
     */
    @JsonProperty("delete")
    public void setDelete(String delete) {
        this.delete = delete;
    }

    /**
     * 
     * @return
     *     The disconnect
     */
    @JsonProperty("disconnect")
    public String getDisconnect() {
        return disconnect;
    }

    /**
     * 
     * @param disconnect
     *     The disconnect
     */
    @JsonProperty("disconnect")
    public void setDisconnect(String disconnect) {
        this.disconnect = disconnect;
    }

    /**
     * 
     * @return
     *     The passiveMode
     */
    @JsonProperty("passiveMode")
    public String getPassiveMode() {
        return passiveMode;
    }

    /**
     * 
     * @param passiveMode
     *     The passiveMode
     */
    @JsonProperty("passiveMode")
    public void setPassiveMode(String passiveMode) {
        this.passiveMode = passiveMode;
    }

    /**
     * 
     * @return
     *     The maximumReconnectAttempts
     */
    @JsonProperty("maximumReconnectAttempts")
    public String getMaximumReconnectAttempts() {
        return maximumReconnectAttempts;
    }

    /**
     * 
     * @param maximumReconnectAttempts
     *     The maximumReconnectAttempts
     */
    @JsonProperty("maximumReconnectAttempts")
    public void setMaximumReconnectAttempts(String maximumReconnectAttempts) {
        this.maximumReconnectAttempts = maximumReconnectAttempts;
    }

    /**
     * 
     * @return
     *     The reconnectDelay
     */
    @JsonProperty("reconnectDelay")
    public String getReconnectDelay() {
        return reconnectDelay;
    }

    /**
     * 
     * @param reconnectDelay
     *     The reconnectDelay
     */
    @JsonProperty("reconnectDelay")
    public void setReconnectDelay(String reconnectDelay) {
        this.reconnectDelay = reconnectDelay;
    }

    /**
     * 
     * @return
     *     The connectTimeout
     */
    @JsonProperty("connectTimeout")
    public String getConnectTimeout() {
        return connectTimeout;
    }

    /**
     * 
     * @param connectTimeout
     *     The connectTimeout
     */
    @JsonProperty("connectTimeout")
    public void setConnectTimeout(String connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    /**
     * 
     * @return
     *     The soTimeout
     */
    @JsonProperty("soTimeout")
    public String getSoTimeout() {
        return soTimeout;
    }

    /**
     * 
     * @param soTimeout
     *     The soTimeout
     */
    @JsonProperty("soTimeout")
    public void setSoTimeout(String soTimeout) {
        this.soTimeout = soTimeout;
    }

    /**
     * 
     * @return
     *     The ftpClientProxyUrl
     */
    @JsonProperty("ftpClient.proxyUrl")
    public String getFtpClientProxyUrl() {
        return ftpClientProxyUrl;
    }

    /**
     * 
     * @param ftpClientProxyUrl
     *     The ftpClient.proxyUrl
     */
    @JsonProperty("ftpClient.proxyUrl")
    public void setFtpClientProxyUrl(String ftpClientProxyUrl) {
        this.ftpClientProxyUrl = ftpClientProxyUrl;
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
