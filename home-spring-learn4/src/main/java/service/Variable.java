package service;

/**
 * Created by YauB on 28/8/2016.
 */
public class Variable {
    public String pmtCfgId;
    public String maxMessagesPerPoll;
    public String delay;
    public String delete;
    public String toEndPointList_binary;
    public String toEndPointList_delete;
    public String toEndPointList_disconnect;
    public String toEndPointList_passiveMode;
    public String toEndPointList_maximumReconnectAttempts;
    public String toEndPointList_reconnectDelay;
    public String toEndPointList_connectTimeout;
    public String toEndPointList_soTimeout;
    public String toEndPointList_proxyUrl;
    public String ackEndPointURL;
    public String ackEndPointParams__exchangePattern;

    public static String getPmtCfgId(){return "CS-MCI3-O"; }
    public static String getMaxMessagesPerPoll(){return "3"; }
    public static String getDelay(){return "1000"; }
    public static String getDelete(){return "true"; }
    public static String getToEndPointList_binary(){return "true"; }
    public static String getToEndPointList_delete(){return "false"; }
    public static String getToEndPointList_disconnect(){return "true"; }
    public static String getToEndPointList_passiveMode(){return "true"; }
    public static String getToEndPointList_maximumReconnectAttempts(){return "3"; }
    public static String getToEndPointList_reconnectDelay(){return "1000"; }
    public static String getToEndPointList_connectTimeout(){return "10000"; }
    public static String getToEndPointList_soTimeout(){return "30000"; }
    public static String getToEndPointList_proxyUrl(){return "http://10.222.58.220:3128"; }
    public static String getAckEndPointURL(){return "emsServer01:B2B-JMS-MCI3"; }
    public static String getAckEndPointParams__exchangePattern(){return "InOnly"; }

}
