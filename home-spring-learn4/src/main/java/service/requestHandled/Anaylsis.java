package service.requestHandled;

import object.ApiInterface;
import object.MCI3_FTP.Outgoing.MCI3_FTP_O_Interface;
import org.json.JSONObject;
import service.requestHandled.MCI3.MCI3_FTP_O;

import static service.requestHandled.MCI3.MCI3_FTP_O.new_MCI3_FTP_O;

/**
 * Created by YauB on 28/8/2016.
 */
public class Anaylsis {
    public static MCI3_FTP_O_Interface anaylsisPart(ApiInterface obj){
        //If VLT
        //If MCI3
        if(obj.getBasicInformation().getTransmissionMethod().equals("FTP") == true
                && obj.getBasicInformation().getTransmissionTools().equals("MCI3") == true ){
            if(obj.getBasicInformation().getDirection().equals("O") == true) {
                MCI3_FTP_O_Interface mci3_obj = new_MCI3_FTP_O(obj);
                return mci3_obj;
            }else{
                return null;
            }
        }
        return null;
    }
}
