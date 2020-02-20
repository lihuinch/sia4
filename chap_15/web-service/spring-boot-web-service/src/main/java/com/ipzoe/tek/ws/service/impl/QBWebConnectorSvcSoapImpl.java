/**
 * QBWebConnectorSvcSoapImpl.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.ipzoe.tek.ws.service.impl;

import com.intuit.developer.ArrayOfString;
import com.ipzoe.tek.ws.service.QBWebConnectorSvcSoap;
import org.springframework.stereotype.Component;

@Component
public class QBWebConnectorSvcSoapImpl implements QBWebConnectorSvcSoap {

    public int requestCount = 0;

    @Override
    public ArrayOfString authenticate(String strUserName, String strPassword) {

        System.out.println("\n============== function authenticate ==============\n");

        String[] asRtn = new String[2];
        asRtn[0] = "{F5FCCBC3-AA13-4d28-9DBF-3E571823F2BB}"; //myGUID.toString();
        if ("username".equals(strUserName) && "password".equals(strPassword)) {

            asRtn[1] = "";
        } else {
            asRtn[1] = "nvu";
        }


        System.out.println("In authenticate new two");
        ArrayOfString asRtn2 = new ArrayOfString();
        asRtn2.getString().add(asRtn[0]);
        asRtn2.getString().add(asRtn[1]);

        System.out.println("In authenticate step2");
        System.out.println("In authenticate as[0] = " + asRtn2.getString().get(0));
        System.out.println("In authenticate as[1] = " + asRtn2.getString().get(1));

        System.out.println("\n-------------- function authenticate --------------\n");

        return asRtn2;
    }

    @Override
    public String sendRequestXML(String ticket,
                                 String strHCPResponse,
                                 String strCompanyFileName,
                                 String qbXMLCountry,
                                 int qbXMLMajorVers,
                                 int qbXMLMinorVers) {

        System.out.println("\n============== function sendRequestXML ==============\n");

        String request = "<?xml version=\"1.0\"?><?qbxml version=\"4.0\"?>"
                + "<QBXML><QBXMLMsgsRq onError=\"stopOnError\">"
                + "<ItemInventoryQueryRq requestID=\"1\" />"
                + "</QBXMLMsgsRq></QBXML>";

        System.out.println("request is : " + request);
        if (requestCount < 1) {
            requestCount++;
        } else {
            request = "";
        }

        System.out.println("Return request is : " + request);

        System.out.println("\n-------------- function sendRequestXML --------------\n");

        return request;

    }

    @Override
    public int receiveResponseXML(String ticket,
                                  String response,
                                  String hresult,
                                  String message) {

        System.out.println("\n============== function receiveResponseXML ==============\n");

        System.out.println("ticket : \n    " + ticket);
        System.out.println("response : \n   " + response);
        System.out.println("hresult : \n    " + hresult);
        System.out.println("message : \n    " + message);

        if (!"".equals(hresult)) {
            return -101;
        }

        System.out.println("\n-------------- function receiveResponseXML --------------\n");
        return 100;
    }

    @Override
    public String connectionError(String ticket,
                                  String hresult,
                                  String message) {

        System.out.println("\n============== function connectionError ==============\n");

        System.out.println("ticket : \n    " + ticket);
        System.out.println("hresult : \n    " + hresult);
        System.out.println("message : \n    " + message);

        System.out.println("\n-------------- function connectionError --------------\n");
        return "DONE";
    }

    @Override
    public String getLastError(String ticket) {

        System.out.println("\n============== function getLastError ==============\n");

        System.out.println("ticket : \n    " + ticket);

        System.out.println("\n-------------- function getLastError --------------\n");
        return "Error";
    }

    @Override
    public String closeConnection(String ticket) {

        System.out.println("\n============== function closeConnection ==============\n");

        System.out.println("In closeConnection");
        System.out.println("ticket : \n    " + ticket);

        System.out.println("\n-------------- function closeConnection --------------\n");
        return ("close with this message");
    }

}
