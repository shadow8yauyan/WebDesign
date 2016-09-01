package api.hahnchen;

/**
 * Created by YauB on 25/8/2016.
 */

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import model.Testing;
import object.InputDTO.ApiInterface;
import object.MCI3.Outgoing.MCI3_FTP_Interface;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import repository.TestingRepository;
import service.ServiceMain;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.List;

import static service.ServiceMain.serviceAnaylsis;

@RestController
public class ApiController {

    @RequestMapping(value = "/channels", method = RequestMethod.POST)
    public static ResponseEntity<String> postValue(HttpServletRequest request) throws IOException {
        String contentStr = Common.GetPostConetent(request);
        System.out.println("----contentJson");
        JSONObject contentJson = Common.getJsonObject(contentStr);
        //System.out.println(contentStr);
        if(contentJson.has("errorCde")){
            return new ResponseEntity<String>(HttpStatus.NOT_ACCEPTABLE);
        }else {
            //Valiadation - Validation/inputJsonValidation
            ObjectMapper mapper = new ObjectMapper();
            System.out.println("----ObjectMapper");
            ApiInterface map = mapper.readValue(contentStr, ApiInterface.class);
            System.out.println("----ApiInterface");
            String inputJsonValidation = Validation.inputJsonValidation(map);
            System.out.println("----Validation");
            map = Validation.inputJsonAssignValue(map);
            if(inputJsonValidation.trim().equals("") != true){
                return new  ResponseEntity<String>(inputJsonValidation, HttpStatus.NOT_ACCEPTABLE);
            }else{
                //change to related file
               String returnStr = serviceAnaylsis(map);
               return new  ResponseEntity<String>(returnStr,HttpStatus.ACCEPTED);
           }
        }
    }

    @RequestMapping(value = "/channels/disable/{id}", method = RequestMethod.PUT)
    public String disable(@PathVariable("id") String id){ return id; }

    @RequestMapping(value = "/channels/enable/{id}", method = RequestMethod.PUT)
    public String enable(@PathVariable("id") String id){
        return id;
    }

    @RequestMapping(value = "/channels/edit", method = RequestMethod.POST)
    public static ResponseEntity<String> edit(HttpServletRequest request) throws IOException {
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    @RequestMapping(value = "/channels/{id}", method = RequestMethod.GET)
    public static ResponseEntity<String> search(HttpServletRequest request) throws IOException {
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    @RequestMapping(value = "/debug", method = RequestMethod.GET)
    public String debug(HttpServletRequest request) throws IOException {
//        List<Testing> testing = testingRepository.findAllBy();
//        System.out.println(testing.size());
//        for ( Testing tt :testing) {
//            System.out.println(tt);
//        }
//        Testing t = new Testing();
//        t.setId("123");
//        t.setData("123");
//
//        testingRepository.save(t);
        return "OK";
    }

}
