package service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SOWY on 8/29/2016.
 */
public class Variable {

    public static String getMaxMessagesPerPoll() {return "3";}
    public static String getDelay() {return "1000";}
    public static String getDelete() {return "true";}
    public static String getToEndPointList_delete() {return "false";}
    public static String getToEndPointList_disconnect() {return "true";}
    public static String getToEndPointList_passiveMode() {return "true";}
    public static String getToEndPointList_maximumReconnectAttempts() {return "3";}
    public static String getToEndPointList_reconnectDelay() {return "1000";}
    public static String getToEndPointList_connectTimeout() {return "10000";}
    public static String getToEndPointList_soTimeout() {return "30000";}
    public static String getToEndPointList_maxMessagesPerPoll() {return "800";}
    public static String getAckEndPointParams__exchangePattern() {return "InOnly";}
    public static String getAckEndPointParams__preserveMessageQos() {return "true";}
    public static String getToEndPointList_binary() {return "true";}


    //Environment Variable
    public static String getToEndPointList_proxyUrl(String env) {
        if (env.equals("QA") == true) {
            return "http://QA:proxyUrl";
        } else if (env.equals("INT") == true) {
            return "http://INT:proxyUrl";
        } else if (env.equals("PROD") == true) {
            return "http://PROD:proxyUrl";
        }
        //return "http://10.222.58.220:3128";
        return null;
    }

    //Platform variable
    public static String getPmtCfgIdOut() {return "CS-MCI3-O";}
    public static String getPmtCfgIdIn() {return "CS-MCI3-I";}
    //Just for MCI (now)
    public static String getPmtCfgId(String dir, String platform){
        String splitter = "-";
        String mci3 = "MCI3";
        if(platform.equals("CS-B2B") == true){
            return "CS"+splitter+mci3+splitter+dir;
        }else if(platform.equals("OB2B-CUS") == true){
            return "OB2BCUS"+splitter+mci3+splitter+dir;
        }else if(platform.equals("CS-CUS") == true){
            return "CSCUS"+splitter+mci3+splitter+dir;
        }else if(platform.equals("OLL") == true){
            return "OLL"+splitter+mci3+splitter+dir;
        }
        return null;
    }
    public static String getAckEndPointURL(String platform) {
        if(platform.equals("CS-B2B") == true){
            return "emsServer01:B2B-JMS-MCI3";
        }else if(platform.equals("OB2B-CUS") == true){
            return "emsServer01:OB2B-CUS-JMS-MCI3";
        }else if(platform.equals("CS-CUS") == true){
            return "emsServer01:B2B-CUS-JMS-MCI3";
        }else if(platform.equals("OLL") == true){
            return "emsServer01:OLL-JMS-MCI3";
        }
        return null;
        //return "emsServer01:B2B-JMS-MCI3";
    }
    public static String getAckEndPointParams__replyTo(String platform) {
        if(platform.equals("CS-B2B") == true){
            return "CS.MCI3.JOB_RPY.B2B.IN.QUE";
        }else if(platform.equals("OB2B-CUS") == true){
            return "B2B.Customs.JOB_RPY.MCI3.OUT.QUE";
        }else if(platform.equals("CS-CUS") == true){
            return "B2B.Customs.JOB_RPY.MCI3.OUT.QUE";
        }else if(platform.equals("OLL") == true){
            return "OOL.MCI3.JOB_RPY.B2B.IN.QUE";
        }
        return null;
        //return "CS.MCI3.JOB_RPY.B2B.IN.QUE";
    }
}
