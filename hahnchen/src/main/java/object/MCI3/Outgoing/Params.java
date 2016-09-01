
package object.MCI3.Outgoing;

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
    "disconnect",
    "passiveMode",
    "delete",
    "maximumReconnectAttempts",
    "reconnectDelay",
    "connectTimeout",
    "soTimeout",
    "consumer.delay",
    "maxMessagesPerPoll",
    "ftpClient.proxyUrl",
    "listFtpFile",
    "preGetPath",
    "postGetPath",
    "prePutPath",
    "postPutPath",
    "concurrentConsumers",
    "maxConcurrentConsumers",
    "maxMessagesPerTask",
    "replyTo",
    "preserveMessageQos",
    "exchangePattern",
    "deliveryPersistent",
    "testConnectionOnStartup",
    "delay"
})
public class Params {

    @JsonProperty("username")
    private String username;
    @JsonProperty("password")
    private String password;
    @JsonProperty("binary")
    private String binary;
    @JsonProperty("disconnect")
    private String disconnect;
    @JsonProperty("passiveMode")
    private String passiveMode;
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
    @JsonProperty("consumer.delay")
    private String consumerDelay;
    @JsonProperty("maxMessagesPerPoll")
    private String maxMessagesPerPoll;
    @JsonProperty("ftpClient.proxyUrl")
    private String ftpClientProxyUrl;
    @JsonProperty("listFtpFile")
    private String listFtpFile;
    @JsonProperty("preGetPath")
    private String preGetPath;
    @JsonProperty("postGetPath")
    private String postGetPath;
    @JsonProperty("prePutPath")
    private String prePutPath;
    @JsonProperty("postPutPath")
    private String postPutPath;
    @JsonProperty("concurrentConsumers")
    private String concurrentConsumers;
    @JsonProperty("maxConcurrentConsumers")
    private String maxConcurrentConsumers;
    @JsonProperty("maxMessagesPerTask")
    private String maxMessagesPerTask;
    @JsonProperty("replyTo")
    private String replyTo;
    @JsonProperty("preserveMessageQos")
    private String preserveMessageQos;
    @JsonProperty("exchangePattern")
    private String exchangePattern;
    @JsonProperty("deliveryPersistent")
    private String deliveryPersistent;
    @JsonProperty("testConnectionOnStartup")
    private String testConnectionOnStartup;
    @JsonProperty("delay")
    private String delay;
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
    @JsonProperty("consumer.delay")
    public String getConsumerDelay() {
        return consumerDelay;
    }

    /**
     * 
     * @param consumerDelay
     *     The consumer.delay
     */
    @JsonProperty("consumer.delay")
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
     *     The concurrentConsumers
     */
    @JsonProperty("concurrentConsumers")
    public String getConcurrentConsumers() {
        return concurrentConsumers;
    }

    /**
     * 
     * @param concurrentConsumers
     *     The concurrentConsumers
     */
    @JsonProperty("concurrentConsumers")
    public void setConcurrentConsumers(String concurrentConsumers) {
        this.concurrentConsumers = concurrentConsumers;
    }

    /**
     * 
     * @return
     *     The maxConcurrentConsumers
     */
    @JsonProperty("maxConcurrentConsumers")
    public String getMaxConcurrentConsumers() {
        return maxConcurrentConsumers;
    }

    /**
     * 
     * @param maxConcurrentConsumers
     *     The maxConcurrentConsumers
     */
    @JsonProperty("maxConcurrentConsumers")
    public void setMaxConcurrentConsumers(String maxConcurrentConsumers) {
        this.maxConcurrentConsumers = maxConcurrentConsumers;
    }

    /**
     * 
     * @return
     *     The maxMessagesPerTask
     */
    @JsonProperty("maxMessagesPerTask")
    public String getMaxMessagesPerTask() {
        return maxMessagesPerTask;
    }

    /**
     * 
     * @param maxMessagesPerTask
     *     The maxMessagesPerTask
     */
    @JsonProperty("maxMessagesPerTask")
    public void setMaxMessagesPerTask(String maxMessagesPerTask) {
        this.maxMessagesPerTask = maxMessagesPerTask;
    }

    /**
     * 
     * @return
     *     The replyTo
     */
    @JsonProperty("replyTo")
    public String getReplyTo() {
        return replyTo;
    }

    /**
     * 
     * @param replyTo
     *     The replyTo
     */
    @JsonProperty("replyTo")
    public void setReplyTo(String replyTo) {
        this.replyTo = replyTo;
    }

    /**
     * 
     * @return
     *     The preserveMessageQos
     */
    @JsonProperty("preserveMessageQos")
    public String getPreserveMessageQos() {
        return preserveMessageQos;
    }

    /**
     * 
     * @param preserveMessageQos
     *     The preserveMessageQos
     */
    @JsonProperty("preserveMessageQos")
    public void setPreserveMessageQos(String preserveMessageQos) {
        this.preserveMessageQos = preserveMessageQos;
    }

    /**
     * 
     * @return
     *     The exchangePattern
     */
    @JsonProperty("exchangePattern")
    public String getExchangePattern() {
        return exchangePattern;
    }

    /**
     * 
     * @param exchangePattern
     *     The exchangePattern
     */
    @JsonProperty("exchangePattern")
    public void setExchangePattern(String exchangePattern) {
        this.exchangePattern = exchangePattern;
    }

    /**
     * 
     * @return
     *     The deliveryPersistent
     */
    @JsonProperty("deliveryPersistent")
    public String getDeliveryPersistent() {
        return deliveryPersistent;
    }

    /**
     * 
     * @param deliveryPersistent
     *     The deliveryPersistent
     */
    @JsonProperty("deliveryPersistent")
    public void setDeliveryPersistent(String deliveryPersistent) {
        this.deliveryPersistent = deliveryPersistent;
    }

    /**
     * 
     * @return
     *     The testConnectionOnStartup
     */
    @JsonProperty("testConnectionOnStartup")
    public String getTestConnectionOnStartup() {
        return testConnectionOnStartup;
    }

    /**
     * 
     * @param testConnectionOnStartup
     *     The testConnectionOnStartup
     */
    @JsonProperty("testConnectionOnStartup")
    public void setTestConnectionOnStartup(String testConnectionOnStartup) {
        this.testConnectionOnStartup = testConnectionOnStartup;
    }

    /**
     * 
     * @return
     *     The delay
     */
    @JsonProperty("delay")
    public String getDelay() {
        return delay;
    }

    /**
     * 
     * @param delay
     *     The delay
     */
    @JsonProperty("delay")
    public void setDelay(String delay) {
        this.delay = delay;
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
