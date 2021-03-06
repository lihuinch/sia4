package com.lihuinch.sia4.chap15.spring.ws.server.endpoint;

import com.lihuinch.sia4.chap15.spring.ws.server.service.QBWebConnectorSvcSoap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * @author lihuinch
 * @date 2020/2/20 0:29
 */
@Component
@WebService(
        targetNamespace = "http://developer.intuit.com/",
        serviceName = "QBWebConnectorSvc",
        portName = "QBWebConnectorSvcSoap"
)
public class QBWebConnectorSvcSoapEndpoint {

    @Autowired
    private QBWebConnectorSvcSoap services;

    @WebMethod(action = "http://developer.intuit.com/authenticate", operationName = "authenticate")
    public
    @WebResult(targetNamespace = "http://developer.intuit.com/", name = "authenticateResult")
    com.lihuinch.sia4.chap15.spring.ws.entity.ArrayOfString authenticate(
            @WebParam(name = "strUserName", targetNamespace = "http://developer.intuit.com/") String strUserName,
            @WebParam(name = "strPassword", targetNamespace = "http://developer.intuit.com/") String strPassword) {

        return services.authenticate(strUserName, strPassword);
    }


    @WebMethod
    public String sendRequestXML(String ticket,
                                 String strHCPResponse,
                                 String strCompanyFileName,
                                 String qbXMLCountry,
                                 int qbXMLMajorVers,
                                 int qbXMLMinorVers) {
        return services.sendRequestXML(ticket, strHCPResponse, strCompanyFileName, qbXMLCountry, qbXMLMajorVers, qbXMLMinorVers);
    }

    @WebMethod
    public int receiveResponseXML(String ticket, String response, String hresult, String message) {
        return services.receiveResponseXML(ticket, response, hresult, message);
    }

    @WebMethod
    public String connectionError(String ticket, String hresult, String message) {
        return services.connectionError(ticket, hresult, message);
    }

    @WebMethod
    public String getLastError(String ticket) {
        return services.getLastError(ticket);
    }

    @WebMethod
    public String closeConnection(String ticket) {
        return services.closeConnection(ticket);
    }
}