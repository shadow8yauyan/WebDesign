package service.requestHandled.MCI3;

import object.ApiInterface;
import object.MCI3_FTP.Outgoing.*;
import org.json.JSONObject;
import service.Variable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YauB on 28/8/2016.
 */
public class MCI3_FTP_O {
    public static MCI3_FTP_O_Interface new_MCI3_FTP_O(ApiInterface obj){
        MCI3_FTP_O_Interface mci3_obj = new MCI3_FTP_O_Interface();
        mci3_obj.setDirection(obj.getBasicInformation().getDirection());
        mci3_obj.setPmtCfgId(Variable.getPmtCfgId());

        FromEndPoint mci3_obj_fromEndPoint = new FromEndPoint();
        Params mci3_obj_fromEndPoint_Params = new Params();
        mci3_obj_fromEndPoint_Params.setMaxMessagesPerPoll(Variable.getMaxMessagesPerPoll());
        mci3_obj_fromEndPoint_Params.setDelay(Variable.getDelay());
        mci3_obj_fromEndPoint_Params.setDelete(Variable.getDelete());
        mci3_obj_fromEndPoint.setParams(mci3_obj_fromEndPoint_Params);
        mci3_obj.setFromEndPoint(mci3_obj_fromEndPoint);

        List<ToEndPointList> mci3_obj_toEndList = new ArrayList<ToEndPointList>();

        for(int x = 0; x < obj.getMsgCfg().size(); x++){
            ToEndPointList mci3_obj_toEndElement = new ToEndPointList();
            mci3_obj_toEndElement.setId(obj.getBasicInformation().getTpid()+"-"+obj.getMsgCfg().get(x).getEdiStandard()+"-"+"O");
            mci3_obj_toEndElement.setUri(obj.getTransmissionDetails().getSetupdetails().getServerSetup().getURL());

            Params_ mci3_obj_toEndList_params = new Params_();
            mci3_obj_toEndList_params.setUsername(obj.getTransmissionDetails().getSetupdetails().getServerSetup().getLoginID());
            mci3_obj_toEndList_params.setPassword(obj.getTransmissionDetails().getSetupdetails().getServerSetup().getPassword());
            mci3_obj_toEndList_params.setBinary(Variable.getToEndPointList_binary());
            mci3_obj_toEndList_params.setDelete(Variable.getDelete());
            mci3_obj_toEndList_params.setDisconnect(Variable.getToEndPointList_disconnect());
            mci3_obj_toEndList_params.setPassiveMode(Variable.getToEndPointList_passiveMode());
            mci3_obj_toEndList_params.setMaximumReconnectAttempts(Variable.getToEndPointList_maximumReconnectAttempts());
            mci3_obj_toEndList_params.setReconnectDelay(Variable.getToEndPointList_reconnectDelay());
            mci3_obj_toEndList_params.setConnectTimeout(Variable.getToEndPointList_connectTimeout());
            mci3_obj_toEndList_params.setSoTimeout(Variable.getToEndPointList_soTimeout());
            mci3_obj_toEndList_params.setFtpClientProxyUrl(Variable.getToEndPointList_proxyUrl());
            mci3_obj_toEndElement.setParams(mci3_obj_toEndList_params);

            Pmt mci3_obj_toEndList_pmt = new Pmt();
            mci3_obj_toEndList_pmt.setTpId(obj.getBasicInformation().getTpid());
            mci3_obj_toEndList_pmt.setMsgType(obj.getMsgCfg().get(x).getMsgType());
            mci3_obj_toEndList_pmt.setMsgFormat(obj.getMsgCfg().get(x).getEdiStandard());
            mci3_obj_toEndElement.setPmt(mci3_obj_toEndList_pmt);

            AckEndPoint mci3_obj_ackEndPoint = new AckEndPoint();
            mci3_obj_ackEndPoint.setUri(Variable.getAckEndPointURL());
            Params__ mci3_obj_ackEndPoint_params = new Params__();
            mci3_obj_ackEndPoint_params.setExchangePattern(Variable.getAckEndPointParams__exchangePattern());
            mci3_obj_ackEndPoint.setParams(mci3_obj_ackEndPoint_params);
            mci3_obj_toEndElement.setAckEndPoint(mci3_obj_ackEndPoint);

            mci3_obj_toEndList.add(mci3_obj_toEndElement);
        }
        mci3_obj.setToEndPointList(mci3_obj_toEndList);
        return mci3_obj;
    }


}
