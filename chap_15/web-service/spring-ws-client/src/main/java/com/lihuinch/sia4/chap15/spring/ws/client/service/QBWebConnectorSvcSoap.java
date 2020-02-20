/**
 * QBWebConnectorSvcSoap.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.lihuinch.sia4.chap15.spring.ws.client.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(
        targetNamespace = "http://developer.intuit.com/",
        serviceName = "QBWebConnectorSvc",
        portName = "QBWebConnectorSvcSoap"
)
public interface QBWebConnectorSvcSoap {

    @WebResult(targetNamespace = "http://developer.intuit.com/", name = "authenticateResult")
    com.lihuinch.sia4.chap15.spring.ws.entity.ArrayOfString authenticate(
            @WebParam(name = "strUserName", targetNamespace = "http://developer.intuit.com/") String strUserName,
            @WebParam(name = "strPassword", targetNamespace = "http://developer.intuit.com/") String strPassword);


    @WebMethod
    String sendRequestXML(String ticket,
                          String strHCPResponse,
                          String strCompanyFileName,
                          String qbXMLCountry,
                          int qbXMLMajorVers,
                          int qbXMLMinorVers);

    @WebMethod
    int receiveResponseXML(String ticket, String response, String hresult, String message);

    @WebMethod
    String connectionError(String ticket, String hresult, String message);

    @WebMethod
    String getLastError(String ticket);

    @WebMethod
    String closeConnection(String ticket);
}
