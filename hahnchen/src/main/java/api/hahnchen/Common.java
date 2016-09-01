package api.hahnchen;

import org.json.JSONObject;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;

/**
 * Created by YauB on 25/8/2016.
 */
public class Common {
    public static String GetPostConetent (HttpServletRequest request){
        StringBuffer jb = new StringBuffer();
        String line = null;
        try {
            BufferedReader reader = request.getReader();
            while ((line = reader.readLine()) != null)
                jb.append(line);
        } catch (Exception e) { /*report an error*/ }
        return jb.toString();
    }

    public static JSONObject getJsonObject(String jsonstr){
        JSONObject jsonObj;
        try{
            jsonObj = new JSONObject(jsonstr);
        }catch (Exception e) {
            //System.out.println("INCORRECT JSON FILE FORMAT");
            jsonObj = new JSONObject("{\"errorCde\":\"1\"}");
        }
        return jsonObj;
    }

}
