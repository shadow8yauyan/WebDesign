package hello;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import object.ApiInterface;
import object.MCI3_FTP.Outgoing.MCI3_FTP_O_Interface;
import org.json.JSONObject;
import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.JSONHandling;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import static service.requestHandled.Anaylsis.anaylsisPart;


/**
 * Created by YauB on 28/8/2016.
 */
@RestController
public class GreetingController {
    @RequestMapping(value = "/postJson_Jackson", method = RequestMethod.POST)
    public static ResponseEntity<String> postJson(HttpServletRequest request) throws IOException {
        String str= service.JSONHandling.postReceived(request);
        System.out.println(str);
        ObjectMapper mapper = new ObjectMapper();
        ApiInterface map = mapper.readValue(str, ApiInterface.class);
        //System.out.println(map.getBasicInformation().getTpid());
        String inputJsonValidation = JSONHandling.inputJsonValidation(map);
        //null != ""
        if(inputJsonValidation.trim().equals("") != true){
            return new  ResponseEntity<String>(inputJsonValidation, HttpStatus.NOT_ACCEPTABLE);
        }else{
            //change to related file
            MCI3_FTP_O_Interface outputJson = anaylsisPart(map);
            ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
            String json = ow.writeValueAsString(outputJson);
            return new  ResponseEntity<String>(json,HttpStatus.ACCEPTED);
        }
    }

    @RequestMapping(value = "/postJson_edit", method = RequestMethod.POST)
    public static ResponseEntity<String> postJson_edit(HttpServletRequest request) throws IOException {

        return new  ResponseEntity<String>(HttpStatus.ACCEPTED);
    }
}
