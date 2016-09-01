package api.hahnchen;

//import api.hahnchen.object.ApiInterface;
import object.InputDTO.ApiInterface;
import org.json.JSONObject;
import java.io.IOException;

/**
 * Created by YauB on 25/8/2016.
 */
public class Validation {
    public static String inputJsonValidation(ApiInterface map){
        System.out.println("----inputJsonValidation");
        String error = "";
        if(map.getBasicInformation().getTpid() == null || map.getBasicInformation().getTpid() == ""){
            error = error + "Input Json Error: Please input BasicInformation/tpid \n";
        }
        if(map.getBasicInformation().getDirection() == null || map.getBasicInformation().getDirection() == ""){
            error = error + "Input Json Error: Please input BasicInformation/Direction \n";
        }

        if(map.getMsgCfg().size() == 0){
            error = error + "Input Json Error: Please input at least one MsgCfg \n";
        }

        for(int x = 0; x < map.getMsgCfg().size(); x++){
            if(map.getMsgCfg().get(x).getMsgType() == null || map.getMsgCfg().get(x).getMsgType() == ""){
                error = error + "Input Json Error: MsgCfg - " + x + "; Please input the MsgType \n";
            }
            if(map.getMsgCfg().get(x).getEdiStandard() == null || map.getMsgCfg().get(x).getEdiStandard() == ""){
                error = error + "Input Json Error: MsgCfg - " + x + "; Please input the EdiStandard \n";
            }
        }

        if(map.getTransmissionDetails() == null){
            error = error + "Input Json Error: Please input TransmissionDetails\n";
        }
        if(map.getTransmissionDetails().getTranmissionType() == null || map.getTransmissionDetails().getTranmissionType() == ""){
            error = error + "Input Json Error: Please input TransmissionDetails/TranmissionType \n";
        }
        if(map.getTransmissionDetails().getCsType() == null || map.getTransmissionDetails().getCsType() == ""){
            error = error + "Input Json Error: Please input TransmissionDetails/CSType \n";
        }

        if(map.getTransmissionDetails().getCsType().equals("Client") == true) {
            if (map.getTransmissionDetails().getSetupdetails() == null) {
                error = error + "Input Json Error: CS as a Client. Please input TransmissionDetails/Setupdetails \n";
            } else {
                if(map.getTransmissionDetails().getSetupdetails().getServerSetup() == null){
                    error = error + "Input Json Error: CS as a Client. Please input TransmissionDetails/Setupdetails/ServerSetup \n";
                }else {
                    if (map.getTransmissionDetails().getSetupdetails().getServerSetup().getLoginID() == null || map.getTransmissionDetails().getSetupdetails().getServerSetup().getLoginID() == "") {
                        error = error + "Input Json Error: Please input TransmissionDetails/Setupdetails/loginID \n";
                    }
                    if (map.getTransmissionDetails().getSetupdetails().getServerSetup().getPassword() == null || map.getTransmissionDetails().getSetupdetails().getServerSetup().getPassword() == "") {
                        error = error + "Input Json Error: Please input TransmissionDetails/Setupdetails/Password \n";
                    }
                }
            }
        }
        return error;
    }

    public static ApiInterface inputJsonAssignValue(ApiInterface map){
        if(map.getBasicInformation().getEnvironment() == null || map.getBasicInformation().getEnvironment() == ""){
            map.getBasicInformation().setEnvironment("CS-B2B");
        }
        if(map.getBasicInformation().getTransmissionTools() == null || map.getBasicInformation().getTransmissionTools() == ""){
            map.getBasicInformation().setTransmissionTools("MCI3");
        }
        for(int x = 0; x < map.getMsgCfg().size(); x++){
           if(map.getMsgCfg().get(x).getStatus() == null || map.getMsgCfg().get(x).getStatus() == ""){
               map.getMsgCfg().get(x).setStatus("Active");
           }
        }
        return map;
    }

}
