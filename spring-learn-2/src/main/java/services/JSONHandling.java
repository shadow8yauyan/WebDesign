package services;

import org.json.JSONObject;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;

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

    public static String getValue(String jsonstr){

        return "";
    }
}

