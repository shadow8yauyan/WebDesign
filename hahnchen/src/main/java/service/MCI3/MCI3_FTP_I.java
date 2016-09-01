package service.MCI3;

import object.InputDTO.ApiInterface;
import object.MCI3.Outgoing.*;
import service.Variable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SOWY on 8/30/2016.
 */
public class MCI3_FTP_I {
    public static MCI3_FTP_Interface new_MCI3_FTP_I(ApiInterface obj, String environment) {
        System.out.println("----MCI3_FTP_IN");
        MCI3_FTP_Interface mci3_obj = new MCI3_FTP_Interface();

        mci3_obj.setDirection("IN");
        mci3_obj.setPmtCfgId(Variable.getPmtCfgId(obj.getBasicInformation().getDirection(), obj.getBasicInformation().getEnvironment()));

        if(obj.getBasicInformation().getSrcEncoding() != "") {
            mci3_obj.setSrcEncoding(obj.getBasicInformation().getSrcEncoding());
        }
        if(obj.getBasicInformation().getDestEncoding() != "") {
            mci3_obj.setSrcEncoding(obj.getBasicInformation().getDestEncoding());
        }

        FromEndPoint mci3_obj_fromEndPoint = new FromEndPoint();
        mci3_obj_fromEndPoint.setUri(obj.getTransmissionDetails().getSetupdetails().getServerSetup().getUrl());

        Params mci3_obj_toEndList_params = new Params();
        mci3_obj_toEndList_params.setUsername(obj.getTransmissionDetails().getSetupdetails().getServerSetup().getLoginID());
        mci3_obj_toEndList_params.setPassword(obj.getTransmissionDetails().getSetupdetails().getServerSetup().getPassword());
        if(obj.getTransmissionDetails().getSetupdetails().getServerSetup().getConnectionMode() != "" &&obj.getTransmissionDetails().getSetupdetails().getServerSetup().getDelete() != null) {
            mci3_obj_toEndList_params.setBinary(Variable.getToEndPointList_binary());
        }else{
            mci3_obj_toEndList_params.setBinary("false");
        }
        if(obj.getTransmissionDetails().getSetupdetails().getServerSetup().getDelete() != "" && obj.getTransmissionDetails().getSetupdetails().getServerSetup().getDelete() != null){
            mci3_obj_toEndList_params.setDelete(obj.getTransmissionDetails().getSetupdetails().getServerSetup().getDelete());
        }else{
            mci3_obj_toEndList_params.setDelete(Variable.getDelete());
        }
        if(obj.getTransmissionDetails().getSetupdetails().getServerSetup().getDisconnect() != "" && obj.getTransmissionDetails().getSetupdetails().getServerSetup().getDisconnect() != null){
            mci3_obj_toEndList_params.setDisconnect(obj.getTransmissionDetails().getSetupdetails().getServerSetup().getDisconnect());
        }else{
            mci3_obj_toEndList_params.setDisconnect(Variable.getToEndPointList_disconnect());
        }
        if(obj.getTransmissionDetails().getSetupdetails().getServerSetup().getConnectionMode() != "" && obj.getTransmissionDetails().getSetupdetails().getServerSetup().getConnectionMode() != null){
            mci3_obj_toEndList_params.setPassiveMode(obj.getTransmissionDetails().getSetupdetails().getServerSetup().getConnectionMode());
        }else{
            mci3_obj_toEndList_params.setPassiveMode(Variable.getToEndPointList_passiveMode());
        }
        if(obj.getTransmissionDetails().getSetupdetails().getServerSetup().getMaximumReconnectAttempts() != "" && obj.getTransmissionDetails().getSetupdetails().getServerSetup().getMaximumReconnectAttempts() != null){
            mci3_obj_toEndList_params.setMaximumReconnectAttempts(obj.getTransmissionDetails().getSetupdetails().getServerSetup().getMaximumReconnectAttempts());
        }else{
            mci3_obj_toEndList_params.setMaximumReconnectAttempts(Variable.getToEndPointList_maximumReconnectAttempts());
        }
        if(obj.getTransmissionDetails().getSetupdetails().getServerSetup().getReconnectDelay() != "" && obj.getTransmissionDetails().getSetupdetails().getServerSetup().getReconnectDelay() != null){
            mci3_obj_toEndList_params.setReconnectDelay(obj.getTransmissionDetails().getSetupdetails().getServerSetup().getReconnectDelay());
        }else{
            mci3_obj_toEndList_params.setReconnectDelay(Variable.getToEndPointList_reconnectDelay());
        }
        if(obj.getTransmissionDetails().getSetupdetails().getServerSetup().getConnectTimeout() != "" && obj.getTransmissionDetails().getSetupdetails().getServerSetup().getConnectTimeout() != null){
            mci3_obj_toEndList_params.setConnectTimeout(obj.getTransmissionDetails().getSetupdetails().getServerSetup().getConnectTimeout());
        }else{
            mci3_obj_toEndList_params.setConnectTimeout(Variable.getToEndPointList_connectTimeout());
        }
        if(obj.getTransmissionDetails().getSetupdetails().getServerSetup().getSoTimeout() != "" && obj.getTransmissionDetails().getSetupdetails().getServerSetup().getSoTimeout() != null){
            mci3_obj_toEndList_params.setSoTimeout(obj.getTransmissionDetails().getSetupdetails().getServerSetup().getSoTimeout());
        }else{
            mci3_obj_toEndList_params.setSoTimeout(Variable.getToEndPointList_soTimeout());
        }
        if(obj.getTransmissionDetails().getSetupdetails().getServerSetup().getConsumerDelay() != "" && obj.getTransmissionDetails().getSetupdetails().getServerSetup().getConsumerDelay() != null){
            mci3_obj_toEndList_params.setSoTimeout(obj.getTransmissionDetails().getSetupdetails().getServerSetup().getConsumerDelay());
        }else{
            mci3_obj_toEndList_params.setSoTimeout(Variable.getToEndPointList_soTimeout());
        }
        if(obj.getTransmissionDetails().getSetupdetails().getServerSetup().getMaxMessagesPerPoll() != "" && obj.getTransmissionDetails().getSetupdetails().getServerSetup().getMaxMessagesPerPoll() != null){
            mci3_obj_toEndList_params.setMaxMessagesPerPoll(obj.getTransmissionDetails().getSetupdetails().getServerSetup().getMaxMessagesPerPoll());
        }else{
            mci3_obj_toEndList_params.setMaxMessagesPerPoll(Variable.getToEndPointList_maxMessagesPerPoll());
        }
        if(obj.getTransmissionDetails().getSetupdetails().getServerSetup().getFtpClientProxyUrl() != "" && obj.getTransmissionDetails().getSetupdetails().getServerSetup().getFtpClientProxyUrl() != null){
            mci3_obj_toEndList_params.setMaxMessagesPerPoll(obj.getTransmissionDetails().getSetupdetails().getServerSetup().getFtpClientProxyUrl());
        }else{
            mci3_obj_toEndList_params.setMaxMessagesPerPoll(Variable.getToEndPointList_proxyUrl(environment));

        }

        mci3_obj_fromEndPoint.setParams(mci3_obj_toEndList_params);
        mci3_obj.setFromEndPoint(mci3_obj_fromEndPoint);

        List<ToEndPointList> mci3_obj_toEndList = new ArrayList<ToEndPointList>();

        for(int x = 0 ; x < obj.getMsgCfg().size() ; x++){
            ToEndPointList mci3_obj_toEndElement = new ToEndPointList();
            mci3_obj_toEndElement.setId(obj.getTransmissionDetails().getSetupdetails().getIncomingDetails().getId());
            mci3_obj_toEndElement.setUri(obj.getTransmissionDetails().getSetupdetails().getIncomingDetails().getQueue());

            Params mci3_obj_toEndElementParams = new Params();
            if(obj.getTransmissionDetails().getSetupdetails().getIncomingDetails().getReplyTo() != null && obj.getTransmissionDetails().getSetupdetails().getIncomingDetails().getReplyTo() != "") {
                mci3_obj_toEndElementParams.setReplyTo(obj.getTransmissionDetails().getSetupdetails().getIncomingDetails().getReplyTo());
            }else{
                mci3_obj_toEndElementParams.setReplyTo(Variable.getAckEndPointParams__replyTo(obj.getBasicInformation().getEnvironment()));
            }
            if(obj.getTransmissionDetails().getSetupdetails().getIncomingDetails().getPreserveMessageQos() != null && obj.getTransmissionDetails().getSetupdetails().getIncomingDetails().getPreserveMessageQos() != ""){
                mci3_obj_toEndElementParams.setPreserveMessageQos(obj.getTransmissionDetails().getSetupdetails().getIncomingDetails().getPreserveMessageQos());
            }else{
                mci3_obj_toEndElementParams.setPreserveMessageQos(Variable.getAckEndPointParams__preserveMessageQos());
            }
            if(obj.getTransmissionDetails().getSetupdetails().getIncomingDetails().getExchangePattern() != null && obj.getTransmissionDetails().getSetupdetails().getIncomingDetails().getExchangePattern() != ""){
                mci3_obj_toEndElementParams.setPreserveMessageQos(obj.getTransmissionDetails().getSetupdetails().getIncomingDetails().getExchangePattern());
            }else{
                mci3_obj_toEndElementParams.setPreserveMessageQos(Variable.getAckEndPointParams__exchangePattern());
            }
            mci3_obj_toEndElement.setParams(mci3_obj_toEndElementParams);
            Pmt mci3_obj_toEndList_pmt = new Pmt();
            mci3_obj_toEndList_pmt.setTpId(obj.getBasicInformation().getTpid());
            mci3_obj_toEndList_pmt.setMsgType(obj.getMsgCfg().get(x).getMsgType());
            mci3_obj_toEndList_pmt.setMsgFormat(obj.getMsgCfg().get(x).getEdiStandard());
            mci3_obj_toEndElement.setPmt(mci3_obj_toEndList_pmt);
            mci3_obj_toEndList.add(mci3_obj_toEndElement);
        }
        mci3_obj.setToEndPointList(mci3_obj_toEndList);
        return mci3_obj;
    }
}
