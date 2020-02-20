package com.ipzoe.tek.ws;

import com.intuit.developer.*;
import com.ipzoe.tek.ws.service.QBWebConnectorSvcSoap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * @author lihuinch
 * @date 2020/2/20 15:18
 */
@Endpoint
public class QBWebConnectorSvcSoapEndpoint {

    private static final String NAMESPACE_URI = "http://developer.intuit.com/";


    private QBWebConnectorSvcSoap services;

    @Autowired
    public QBWebConnectorSvcSoapEndpoint(QBWebConnectorSvcSoap services) {
        this.services = services;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "authenticate")
    @ResponsePayload
    public AuthenticateResponse authenticate(@RequestPayload Authenticate authenticate) {

        ArrayOfString result = services.authenticate(authenticate.getStrUserName(), authenticate.getStrPassword());

        AuthenticateResponse response = new AuthenticateResponse();
        response.setAuthenticateResult(result);

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "sendRequestXML")
    @ResponsePayload
    public SendRequestXMLResponse sendRequestXML(@RequestPayload SendRequestXML sendRequestXML) {
        String result = services.sendRequestXML(sendRequestXML.getTicket(), sendRequestXML.getStrHCPResponse(), sendRequestXML.getStrCompanyFileName()
                , sendRequestXML.getQbXMLCountry(), sendRequestXML.getQbXMLMajorVers(), sendRequestXML.getQbXMLMinorVers());


        SendRequestXMLResponse response = new SendRequestXMLResponse();
        response.setSendRequestXMLResult(result);

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "receiveResponseXML")
    @ResponsePayload
    public ReceiveResponseXMLResponse receiveResponseXML(@RequestPayload ReceiveResponseXML receiveResponseXML) {

        int result = services.receiveResponseXML(receiveResponseXML.getTicket(), receiveResponseXML.getResponse()
                , receiveResponseXML.getHresult(), receiveResponseXML.getMessage());

        ReceiveResponseXMLResponse response = new ReceiveResponseXMLResponse();
        response.setReceiveResponseXMLResult(result);

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "connectionError")
    @ResponsePayload
    public ConnectionErrorResponse connectionError(@RequestPayload ConnectionError connectionError) {

        String result = services.connectionError(connectionError.getTicket(), connectionError.getHresult(), connectionError.getMessage());

        ConnectionErrorResponse response = new ConnectionErrorResponse();
        response.setConnectionErrorResult(result);

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getLastError")
    @ResponsePayload
    public GetLastErrorResponse getLastError(@RequestPayload GetLastError getLastError) {

        String result = services.getLastError(getLastError.getTicket());

        GetLastErrorResponse response = new GetLastErrorResponse();
        response.setGetLastErrorResult(result);

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "closeConnection")
    @ResponsePayload
    public CloseConnectionResponse closeConnection(@RequestPayload CloseConnection closeConnection) {
        String result = services.closeConnection(closeConnection.getTicket());

        CloseConnectionResponse response = new CloseConnectionResponse();
        response.setCloseConnectionResult(result);

        return response;
    }
}
