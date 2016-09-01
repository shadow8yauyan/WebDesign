package service;

import com.fasterxml.jackson.core.JsonProcessingException;
import model.Testing;
import object.InputDTO.ApiInterface;
import object.MCI3.Outgoing.MCI3_FTP_Interface;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.beans.factory.annotation.Autowired;
import repository.TestingRepository;

import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import static jdk.nashorn.internal.objects.NativeString.toUpperCase;
import static service.MCI3.MCI3_FTP_I.new_MCI3_FTP_I;
import static service.MCI3.MCI3_FTP_O.new_MCI3_FTP_O;

/**
 * Created by SOWY on 8/29/2016.
 */
public class ServiceMain {

    public static String request_id;
    public static String serviceAnaylsis(ApiInterface obj){

        System.out.println("----UUID generate : yyMMddHHmmss + 5 random characters");
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMddHHmmss");
        UUID uuid = UUID.randomUUID();
        String suffix_id = uuid.toString().substring(0, 5);
        request_id =  toUpperCase(sdf.format(new Date()).toString()+suffix_id);
        System.out.println(request_id);

        System.out.println("----serviceAnaylsis");
        if(obj.getBasicInformation().getTransmissionTools().equals("MCI3") == true){
            //MCI3
            System.out.println("----serviceAnaylsis/MCI3");
            if(obj.getBasicInformation().getTransmissionMethod().equals("FTP") == true){
                //MCI3 - FTP
                System.out.println("----serviceAnaylsis/FTP");
                if(obj.getBasicInformation().getDirection().equals("O") == true){
                    //MCI3 - FTP - O
                    System.out.println("----serviceAnaylsis/FTP/O");

                    MCI3_FTP_Interface mci3_obj_qa = new_MCI3_FTP_O(obj, "QA");
                    String returnStr_qa = sendJsonToDirectory(mci3_obj_qa,  "QA");
                    MCI3_FTP_Interface mci3_obj_int = new_MCI3_FTP_O(obj, "INT");
                    String returnStr_int = sendJsonToDirectory(mci3_obj_int, "INT");
                    MCI3_FTP_Interface mci3_obj_prod = new_MCI3_FTP_O(obj, "PROD");
                    String returnStr_prod = sendJsonToDirectory(mci3_obj_prod, "PROD");
                    if(returnStr_qa.equals("Success") == true && returnStr_int.equals("Success") == true && mci3_obj_prod.equals("Success") == true){
                        return "Request id = "+request_id+"\nSuccess";
                    }else{
                        return "QA File send to directory status: " + returnStr_qa +"\nINT File send to directory status: "+ returnStr_int + "\nProd File send to directory status: " + returnStr_prod;
                    }
                }else{
                    //MCI3 - FTP - I
                    System.out.println("----serviceAnaylsis/FTP/I");
                    MCI3_FTP_Interface mci3_obj = new_MCI3_FTP_I(obj, "PROD");
                    MCI3_FTP_Interface mci3_obj_qa = new_MCI3_FTP_I(obj, "QA");
                    String returnStr_qa = sendJsonToDirectory(mci3_obj_qa,  "QA");
                    MCI3_FTP_Interface mci3_obj_int = new_MCI3_FTP_I(obj, "INT");
                    String returnStr_int = sendJsonToDirectory(mci3_obj_int, "INT");
                    MCI3_FTP_Interface mci3_obj_prod = new_MCI3_FTP_I(obj, "PROD");
                    String returnStr_prod = sendJsonToDirectory(mci3_obj_prod, "PROD");
                    if(returnStr_qa.equals("Success") == true && returnStr_int.equals("Success") == true && mci3_obj_prod.equals("Success") == true){
                        return "Request id = "+request_id+"\nSuccess";
                    }else{
                        return "Request id = " + request_id + "\nQA File send to directory status: " + returnStr_qa +"\nINT File send to directory status: "+ returnStr_int + "\nProd File send to directory status: " + returnStr_prod;
                    }
                }
            }else{
                //MCI3 - other transmission type
                return null;
            }
        }else{
            //VLT
            return null;
        }
    }

    public static String sendJsonToDirectory(MCI3_FTP_Interface outputJson , String environment) {
        ObjectWriter outputJ = new ObjectMapper().writer().withDefaultPrettyPrinter();
        try {
            String jsonStr = outputJ.writeValueAsString(outputJson);
            if(jsonStr.equals("null") == false) {
                try (PrintWriter out = new PrintWriter("D:/git/MeinProjekt/hahnOutputBackup/MCI3/" +request_id+ "_" + environment + ".txt")) {
                    out.println(jsonStr);
                    return "Success";
                } catch (Exception e) {
                    return e.toString();
                }
            }
        } catch (JsonProcessingException e) {
            return e.getMessage();
        }

        return "";
    }

}
