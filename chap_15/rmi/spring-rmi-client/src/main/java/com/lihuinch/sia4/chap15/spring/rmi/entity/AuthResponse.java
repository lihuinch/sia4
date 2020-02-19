/**
 * AuthResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.lihuinch.sia4.chap15.spring.rmi.entity;

public class AuthResponse implements java.io.Serializable {
    private String sessionTicket;
    private String companyFile;
    private String authResult;

    public AuthResponse() {
    }

    public AuthResponse(
            String sessionTicket,
            String companyFile,
            String authResult) {
        this.sessionTicket = sessionTicket;
        this.companyFile = companyFile;
        this.authResult = authResult;
    }


    /**
     * Gets the sessionTicket value for this AuthResponse.
     *
     * @return sessionTicket
     */
    public String getSessionTicket() {
        return sessionTicket;
    }


    /**
     * Sets the sessionTicket value for this AuthResponse.
     *
     * @param sessionTicket
     */
    public void setSessionTicket(String sessionTicket) {
        this.sessionTicket = sessionTicket;
    }


    /**
     * Gets the companyFile value for this AuthResponse.
     *
     * @return companyFile
     */
    public String getCompanyFile() {
        return companyFile;
    }


    /**
     * Sets the companyFile value for this AuthResponse.
     *
     * @param companyFile
     */
    public void setCompanyFile(String companyFile) {
        this.companyFile = companyFile;
    }


    /**
     * Gets the authResult value for this AuthResponse.
     *
     * @return authResult
     */
    public String getAuthResult() {
        return authResult;
    }


    /**
     * Sets the authResult value for this AuthResponse.
     *
     * @param authResult
     */
    public void setAuthResult(String authResult) {
        this.authResult = authResult;
    }

    private Object __equalsCalc = null;

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AuthResponse)) return false;
        AuthResponse other = (AuthResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = ((this.sessionTicket == null && other.getSessionTicket() == null) ||
                (this.sessionTicket != null &&
                        this.sessionTicket.equals(other.getSessionTicket()))) &&
                ((this.companyFile == null && other.getCompanyFile() == null) ||
                        (this.companyFile != null &&
                                this.companyFile.equals(other.getCompanyFile()))) &&
                ((this.authResult == null && other.getAuthResult() == null) ||
                        (this.authResult != null &&
                                this.authResult.equals(other.getAuthResult())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;

    @Override
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getSessionTicket() != null) {
            _hashCode += getSessionTicket().hashCode();
        }
        if (getCompanyFile() != null) {
            _hashCode += getCompanyFile().hashCode();
        }
        if (getAuthResult() != null) {
            _hashCode += getAuthResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
