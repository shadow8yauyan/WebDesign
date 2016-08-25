package api.hahnchen;

/**
 * Created by YauB on 25/8/2016.
 */

import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.Null;
import java.io.IOException;

@RestController
public class ApiController {
    @RequestMapping(value = "/channels", method = RequestMethod.POST)
    public static ResponseEntity<String> postValue(HttpServletRequest request) throws IOException {
        String contentStr = Common.GetPostConetent(request);
        JSONObject contentJson = Common.getJsonObject(contentStr);
        if(contentJson.has("errorCde")){
            return new ResponseEntity<String>(HttpStatus.NOT_ACCEPTABLE);
        }else {
            //Valiadation
            if(Validation.inputJsonValid(contentJson) == null) {
                return new ResponseEntity<String>(HttpStatus.NOT_ACCEPTABLE);
            }else{
                return new ResponseEntity<String>(HttpStatus.ACCEPTED);
            }
        }
    }

    @RequestMapping(value = "/channels/disable/{id}", method = RequestMethod.PUT)
    public String disable(@PathVariable("id") String id){
        return id;
    }

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

}
