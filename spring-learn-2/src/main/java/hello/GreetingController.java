package hello;

/**
 * Created by SOWY on 8/22/2016.
 */

import org.json.JSONObject;
import org.springframework.expression.ParseException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import services.JSONHandling;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

//@Controller For MVC - return greeting.html
@RestController //For restful - do the logic in the below java class.
//JSONP: cross domain
public class GreetingController {

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

//http://localhost:8080/getPathValue/Tester/12
    @RequestMapping("/getPathValue/{name}/{age}")
    public String getPathValue(@PathVariable("name") String name,
                               @PathVariable("age") String age){
        return "Name = " + name + ", Age = " + age;
    }

//http://localhost:8080/getParaValue?name=Tester33&age=13
    @RequestMapping("/getParaValue")
    public String getParaValue(@RequestParam("name") String name,
                               @RequestParam("age") String age){
        return "Name = " + name + ", Age = " + age;
    }

//http://localhost:8080/postValue
    @RequestMapping(value = "/postValue", method = RequestMethod.POST)
    public static String postValue(HttpServletRequest request) throws IOException {
        String str= JSONHandling.postReceived(request);
        return "Receive: " + str;

    }

    @RequestMapping(value = "/postJson", method = RequestMethod.POST)
    public static ResponseEntity<String> postJson(HttpServletRequest request) throws IOException {
        String str= JSONHandling.postReceived(request);
        JSONObject inputJson = JSONHandling.getValue(str);

        //get Array value = car => [{"color":"Blue","vin":"1234","miles":100},{"color":"Red","vin":"125","miles":400}]
        //System.out.println(inputJson.getJSONArray("car"));
        //get object value[1] => {"color":"Red","vin":"125","miles":400}
        //System.out.println(inputJson.getJSONArray("car").getJSONObject(1));
        //get Json value[1] => Red
        //System.out.println(inputJson.getJSONArray("car").getJSONObject(1).get("color"));
        //return inputJson.getJSONArray("car").getJSONObject(1).get("color").toString();

        // 400
        //return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
        // 200
        return new ResponseEntity<String>(HttpStatus.OK);
    }

}

/*Json testing file
{
  "car":[
    {
      "color":"Blue",
      "miles":100,
      "vin":"1234"
    },
    {
      "color":"Red",
      "miles":400,
      "vin":"125"
    }
  ]
}*/