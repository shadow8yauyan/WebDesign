package api.hahnchen;

import org.json.JSONObject;

/**
 * Created by YauB on 25/8/2016.
 */
public class Validation {
    public static String inputJsonValid (JSONObject inputJson){
        String error = "";
        //System.out.println(inputJson.getJSONObject("BasicInformation").toString());
        //{"TPID":"","Environment":"CS-B2B","TransmissionTools":"VLTrader","Recognize":{...
        //System.out.println(inputJson.getJSONObject("BasicInformation").get("TPID").toString());
        if(inputJson.getJSONObject("BasicInformation").get("TPID").toString() == null){
            error = error + "Missing BasicInformation/TPID.";
        }
        if(inputJson.getJSONObject("BasicInformation").get("Direction").toString() == null){
            error = error + "Missing BasicInformation/Direction.";
        }
        if(inputJson.getJSONObject("BasicInformation").get("TransmissionTools").toString().equals("VLTrader") && inputJson.getJSONObject("BasicInformation").get("TransmissionMethod").toString() != null){
            error = error + "Please provide BasicInformation/TransmissionMethod in VLTrader setting.";
        }else{
            String TransmissionTools = inputJson.getJSONObject("BasicInformation").get("TransmissionTools").toString();
            String TransmissionMethod = inputJson.getJSONObject("BasicInformation").get("TransmissionMethod").toString();
        }
        if(inputJson.getJSONArray("MsgCfg").getJSONObject(0).get("MsgType").toString() == null){
            error = error + "Please provide Message type for channel cfg.";
        }
        if(inputJson.getJSONObject("TransmissionDetails").get("CSType").toString() == null){
            error = error + "Please provide the information of CS as a Client or Server.";
        }
        return error;
    }
}
