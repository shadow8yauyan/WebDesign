package service.MCI3;

import object.InputDTO.ApiInterface;
import object.MCI3.Outgoing.*;
import service.Variable;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by SOWY on 8/29/2016.
 */
public class MCI3_FTP_O {
    public static MCI3_FTP_Interface new_MCI3_FTP_O(ApiInterface obj, String environment) {
        System.out.println("----new_MCI3_FTP_O");
        MCI3_FTP_Interface mci3_obj = new MCI3_FTP_Interface();
        mci3_obj.setDirection("OUT");
        mci3_obj.setPmtCfgId(Variable.getPmtCfgId(obj.getBasicInformation().getDirection(), obj.getBasicInformation().getEnvironment()));

        FromEndPoint mci3_obj_fromEndPoint = new FromEndPoint();
        Params mci3_obj_fromEndPoint_Params = new Params();
        mci3_obj_fromEndPoint_Params.setMaxMessagesPerPoll(Variable.getMaxMessagesPerPoll());
        mci3_obj_fromEndPoint_Params.setDelay(Variable.getDelay());
        mci3_obj_fromEndPoint_Params.setDelete(Variable.getDelete());
        mci3_obj_fromEndPoint.setParams(mci3_obj_fromEndPoint_Params);
        mci3_obj.setFromEndPoint(mci3_obj_fromEndPoint);

        List<ToEndPointList> mci3_obj_toEndList = new ArrayList<ToEndPointList>();

        for (int x = 0; x < obj.getMsgCfg().size(); x++) {
            ToEndPointList mci3_obj_toEndElement = new ToEndPointList();
            mci3_obj_toEndElement.setId(obj.getBasicInformation().getTpid() + "-" + obj.getMsgCfg().get(x).getEdiStandard() + "-" + "O");
            mci3_obj_toEndElement.setUri(obj.getTransmissionDetails().getSetupdetails().getServerSetup().getUrl());

            Params mci3_obj_toEndList_params = new Params();
            mci3_obj_toEndList_params.setUsername(obj.getTransmissionDetails().getSetupdetails().getServerSetup().getLoginID());
            mci3_obj_toEndList_params.setPassword(obj.getTransmissionDetails().getSetupdetails().getServerSetup().getPassword());
            mci3_obj_toEndList_params.setBinary(Variable.getToEndPointList_binary());
            mci3_obj_toEndList_params.setDelete(Variable.getToEndPointList_delete());
            mci3_obj_toEndList_params.setDisconnect(Variable.getToEndPointList_disconnect());
            mci3_obj_toEndList_params.setPassiveMode(Variable.getToEndPointList_passiveMode());
            mci3_obj_toEndList_params.setMaximumReconnectAttempts(Variable.getToEndPointList_maximumReconnectAttempts());
            mci3_obj_toEndList_params.setReconnectDelay(Variable.getToEndPointList_reconnectDelay());
            mci3_obj_toEndList_params.setConnectTimeout(Variable.getToEndPointList_connectTimeout());
            mci3_obj_toEndList_params.setSoTimeout(Variable.getToEndPointList_soTimeout());
            mci3_obj_toEndList_params.setFtpClientProxyUrl(Variable.getToEndPointList_proxyUrl(environment));
            mci3_obj_toEndElement.setParams(mci3_obj_toEndList_params);

            Pmt mci3_obj_toEndList_pmt = new Pmt();
            mci3_obj_toEndList_pmt.setTpId(obj.getBasicInformation().getTpid());
            mci3_obj_toEndList_pmt.setMsgType(obj.getMsgCfg().get(x).getMsgType());
            mci3_obj_toEndList_pmt.setMsgFormat(obj.getMsgCfg().get(x).getEdiStandard());
            mci3_obj_toEndElement.setPmt(mci3_obj_toEndList_pmt);

            AckEndPoint mci3_obj_ackEndPoint = new AckEndPoint();
            mci3_obj_ackEndPoint.setUri(Variable.getAckEndPointURL(obj.getBasicInformation().getEnvironment()));
            Params mci3_obj_ackEndPoint_params = new Params();
            mci3_obj_ackEndPoint_params.setExchangePattern(Variable.getAckEndPointParams__exchangePattern());
            mci3_obj_ackEndPoint.setParams(mci3_obj_ackEndPoint_params);
            mci3_obj_toEndElement.setAckEndPoint(mci3_obj_ackEndPoint);

            mci3_obj_toEndList.add(mci3_obj_toEndElement);
        }
        mci3_obj.setToEndPointList(mci3_obj_toEndList);
        return mci3_obj;
    }
}
