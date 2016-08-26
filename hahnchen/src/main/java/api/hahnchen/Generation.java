package api.hahnchen;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Created by YauB on 26/8/2016.
 */
public class Generation {
    public static String mci3_FTP_O_client (JSONObject inputJson){
        JSONObject Outbound = new JSONObject();
        JSONArray fromEndPoint_params = new JSONArray();

        JSONObject maxMessagesPerPoll = new JSONObject().put("maxMessagesPerPoll","3");
        JSONObject delay = new JSONObject().put("delay","1000");
        JSONObject delete = new JSONObject().put("delete","true");

        fromEndPoint_params.put(maxMessagesPerPoll);
        fromEndPoint_params.put(delay);
        fromEndPoint_params.put(delete);

        /*$fromEndPoint_params;
		$toEndPointList_params;
		$toEndPointList;
		$id;
		$TP_ID = $ob_str["BasicInformation"]["TPID"];
		$Direction = $ob_str["BasicInformation"]["Direction"];
		$MsgType = "";
		$EdiStandard = "";
		$productionPath = "";
		$uri = "";
		$toEndPointList = array();


		if(strcmp($ob_str["TransmissionDetails"]["CSType"],"Client")==0){
			$username = $ob_str["TransmissionDetails"]["Setupdetails"]["serverSetup"]["loginID"];
			$Password = $ob_str["TransmissionDetails"]["Setupdetails"]["serverSetup"]["Password"];
			$uri = $ob_str["TransmissionDetails"]["Setupdetails"]["serverSetup"]["URL"];
		}
		$params = array(
			"username"=>$username, "password"=>$Password,
			"binary"=>"true",
			"delete"=>"false",
			"disconnect"=>"true",
			"passiveMode"=>"true",
			"maximumReconnectAttempts"=>"3",
			"reconnectDelay"=>"1000",
			"connectTimeout"=>"10000",
			"soTimeout"=>"30000",
			"ftpClient.proxyUrl"=>"http://10.222.58.220:3128"
		);

		$ackEndPoint_params = array("exchangePattern"=> "InOnly");
		$ackEndPoint = array(
			"uri"=>"emsServer01:B2B-JMS-MCI3",
			"params"=>$ackEndPoint_params
		);

		for($x = 0 ; $x < count($ob_str["MsgCfg"]) ; $x++){
			$MsgType = $ob_str["MsgCfg"][$x]["MsgType"];
			$EdiStandard = $ob_str["MsgCfg"][$x]["EdiStandard"];
			$productionPath = $ob_str["MsgCfg"][$x]["ProductionInfo"]["FolderPath"];

			$id[$x] = $TP_ID."-".$MsgType."-".$EdiStandard."-".$Direction;
			$FolderPath_url = $uri.$productionPath;
			$pmt = array(
				"tpId"=>$TP_ID,
				"msgType"=>$MsgType,
				"msgFormat"=>$EdiStandard
			);

			$toEndPointList[$x] = array(
				"id"=>$id[$x], "uri"=>$FolderPath_url, "params"=>$params,
				"pmt"=>$pmt, "ackEndPoint"=>$ackEndPoint
			);
		}

		$Outbound = array(
			"direction"=>$direction,
			"pmtCfgId" =>"CS-MCI3-O",
			"fromEndPoint"=> array("params" => $fromEndPoint_params),
			"toEndPointList" =>$toEndPointList
		);*/
        return "";
    }
}
