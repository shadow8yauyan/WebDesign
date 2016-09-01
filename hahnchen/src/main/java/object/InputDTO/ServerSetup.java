
package object.InputDTO;

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

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "url",
    "ip",
    "port",
    "connectionMode",
    "transferringMode",
    "disconnect",
    "delete",
    "maximumReconnectAttempts",
    "reconnectDelay",
    "connectTimeout",
    "soTimeout",
    "consumerDelay",
    "maxMessagesPerPoll",
    "ftpClientProxyUrl",
    "preGetPath",
    "postGetPath",
    "prePutPath",
    "postPutPath",
    "listFtpFile",
    "loginID",
    "password"
})
public class ServerSetup {

    @JsonProperty("url")
    private String url;
    @JsonProperty("ip")
    private List<String> ip = new ArrayList<String>();
    @JsonProperty("port")
    private String port;
    @JsonProperty("connectionMode")
    private String connectionMode;
    @JsonProperty("transferringMode")
    private String transferringMode;
    @JsonProperty("disconnect")
    private String disconnect;
    @JsonProperty("delete")
    private String delete;
    @JsonProperty("maximumReconnectAttempts")
    private String maximumReconnectAttempts;
    @JsonProperty("reconnectDelay")
    private String reconnectDelay;
    @JsonProperty("connectTimeout")
    private String connectTimeout;
    @JsonProperty("soTimeout")
    private String soTimeout;
    @JsonProperty("consumerDelay")
    private String consumerDelay;
    @JsonProperty("maxMessagesPerPoll")
    private String maxMessagesPerPoll;
    @JsonProperty("ftpClientProxyUrl")
    private String ftpClientProxyUrl;
    @JsonProperty("preGetPath")
    private String preGetPath;
    @JsonProperty("postGetPath")
    private String postGetPath;
    @JsonProperty("prePutPath")
    private String prePutPath;
    @JsonProperty("postPutPath")
    private String postPutPath;
    @JsonProperty("listFtpFile")
    private String listFtpFile;
    @JsonProperty("loginID")
    private String loginID;
    @JsonProperty("password")
    private String password;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The url
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The ip
     */
    @JsonProperty("ip")
    public List<String> getIp() {
        return ip;
    }

    /**
     * 
     * @param ip
     *     The ip
     */
    @JsonProperty("ip")
    public void setIp(List<String> ip) {
        this.ip = ip;
    }

    /**
     * 
     * @return
     *     The port
     */
    @JsonProperty("port")
    public String getPort() {
        return port;
    }

    /**
     * 
     * @param port
     *     The port
     */
    @JsonProperty("port")
    public void setPort(String port) {
        this.port = port;
    }

    /**
     * 
     * @return
     *     The connectionMode
     */
    @JsonProperty("connectionMode")
    public String getConnectionMode() {
        return connectionMode;
    }

    /**
     * 
     * @param connectionMode
     *     The connectionMode
     */
    @JsonProperty("connectionMode")
    public void setConnectionMode(String connectionMode) {
        this.connectionMode = connectionMode;
    }

    /**
     * 
     * @return
     *     The transferringMode
     */
    @JsonProperty("transferringMode")
    public String getTransferringMode() {
        return transferringMode;
    }

    /**
     * 
     * @param transferringMode
     *     The transferringMode
     */
    @JsonProperty("transferringMode")
    public void setTransferringMode(String transferringMode) {
        this.transferringMode = transferringMode;
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
     *     The consumerDelay
     */
    @JsonProperty("consumerDelay")
    public String getConsumerDelay() {
        return consumerDelay;
    }

    /**
     * 
     * @param consumerDelay
     *     The consumerDelay
     */
    @JsonProperty("consumerDelay")
    public void setConsumerDelay(String consumerDelay) {
        this.consumerDelay = consumerDelay;
    }

    /**
     * 
     * @return
     *     The maxMessagesPerPoll
     */
    @JsonProperty("maxMessagesPerPoll")
    public String getMaxMessagesPerPoll() {
        return maxMessagesPerPoll;
    }

    /**
     * 
     * @param maxMessagesPerPoll
     *     The maxMessagesPerPoll
     */
    @JsonProperty("maxMessagesPerPoll")
    public void setMaxMessagesPerPoll(String maxMessagesPerPoll) {
        this.maxMessagesPerPoll = maxMessagesPerPoll;
    }

    /**
     * 
     * @return
     *     The ftpClientProxyUrl
     */
    @JsonProperty("ftpClientProxyUrl")
    public String getFtpClientProxyUrl() {
        return ftpClientProxyUrl;
    }

    /**
     * 
     * @param ftpClientProxyUrl
     *     The ftpClientProxyUrl
     */
    @JsonProperty("ftpClientProxyUrl")
    public void setFtpClientProxyUrl(String ftpClientProxyUrl) {
        this.ftpClientProxyUrl = ftpClientProxyUrl;
    }

    /**
     * 
     * @return
     *     The preGetPath
     */
    @JsonProperty("preGetPath")
    public String getPreGetPath() {
        return preGetPath;
    }

    /**
     * 
     * @param preGetPath
     *     The preGetPath
     */
    @JsonProperty("preGetPath")
    public void setPreGetPath(String preGetPath) {
        this.preGetPath = preGetPath;
    }

    /**
     * 
     * @return
     *     The postGetPath
     */
    @JsonProperty("postGetPath")
    public String getPostGetPath() {
        return postGetPath;
    }

    /**
     * 
     * @param postGetPath
     *     The postGetPath
     */
    @JsonProperty("postGetPath")
    public void setPostGetPath(String postGetPath) {
        this.postGetPath = postGetPath;
    }

    /**
     * 
     * @return
     *     The prePutPath
     */
    @JsonProperty("prePutPath")
    public String getPrePutPath() {
        return prePutPath;
    }

    /**
     * 
     * @param prePutPath
     *     The prePutPath
     */
    @JsonProperty("prePutPath")
    public void setPrePutPath(String prePutPath) {
        this.prePutPath = prePutPath;
    }

    /**
     * 
     * @return
     *     The postPutPath
     */
    @JsonProperty("postPutPath")
    public String getPostPutPath() {
        return postPutPath;
    }

    /**
     * 
     * @param postPutPath
     *     The postPutPath
     */
    @JsonProperty("postPutPath")
    public void setPostPutPath(String postPutPath) {
        this.postPutPath = postPutPath;
    }

    /**
     * 
     * @return
     *     The listFtpFile
     */
    @JsonProperty("listFtpFile")
    public String getListFtpFile() {
        return listFtpFile;
    }

    /**
     * 
     * @param listFtpFile
     *     The listFtpFile
     */
    @JsonProperty("listFtpFile")
    public void setListFtpFile(String listFtpFile) {
        this.listFtpFile = listFtpFile;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
