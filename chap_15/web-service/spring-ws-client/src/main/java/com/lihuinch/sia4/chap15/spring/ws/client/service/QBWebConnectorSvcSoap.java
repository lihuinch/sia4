/**
 * QBWebConnectorSvcSoap.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.lihuinch.sia4.chap15.spring.ws.client.service;

import javax.jws.WebService;

@WebService(targetNamespace = "http://developer.intuit.com/", serviceName = "QBWebConnectorSvcSoap")

public interface QBWebConnectorSvcSoap {

    com.lihuinch.sia4.chap15.spring.ws.entity.ArrayOfString authenticate(String strUserName, String strPassword);

    String sendRequestXML(String ticket,
                          String strHCPResponse,
                          String strCompanyFileName,
                          String qbXMLCountry,
                          int qbXMLMajorVers,
                          int qbXMLMinorVers);

    int receiveResponseXML(String ticket, String response, String hresult, String message);

    String connectionError(String ticket, String hresult, String message);

    String getLastError(String ticket);

    String closeConnection(String ticket);
}
