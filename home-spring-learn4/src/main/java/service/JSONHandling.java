package service;

import object.ApiInterface;
import org.json.JSONObject;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by SOWY on 8/23/2016.
 */
public class JSONHandling {
    public static String postReceived(HttpServletRequest request){
        StringBuffer jb = new StringBuffer();
        String line = null;
        try {
            BufferedReader reader = request.getReader();
            while ((line = reader.readLine()) != null)
                jb.append(line);
        } catch (Exception e) { /*report an error*/ }
        return jb.toString();
    }

    public static JSONObject getValue(String jsonstr){
        JSONObject jsonObj;
        try{
            jsonObj = new JSONObject(jsonstr);
        }catch (Exception e) {
            //System.out.println("INCORRECT JSON FILE FORMAT");
            jsonObj = new JSONObject("{\"errorCde\":\"INCORRECT JSON FILE FORMAT\"}");
        }
        return jsonObj;
    }
    public static String inputJsonValidation(ApiInterface map){
        String error = "";
        if(map.getBasicInformation().getTpid() == null){
            error = error + "Input Json Error: Please input BasicInformation/tpid \n";
        }
        if(map.getBasicInformation().getDirection() == null){
            error = error + "Input Json Error: Please input BasicInformation/Direction \n";
        }

        if(map.getMsgCfg().get(0) == null){
            error = error + "Input Json Error: Please input at least one MsgCfg \n";
        }
        if(map.getBasicInformation().getEnvironment() == null){
            map.getBasicInformation().setEnvironment("CS-B2B");
        }
        if(map.getBasicInformation().getTransmissionMethod() == null){
            map.getBasicInformation().setTransmissionMethod("FTP");
        }
        if(map.getBasicInformation().getTransmissionTools() == null){
            map.getBasicInformation().setTransmissionTools("MCI3");
        }
        return error;
    }

}



