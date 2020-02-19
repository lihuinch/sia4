/**
 * ArrayOfString.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.lihuinch.sia4.chap15.spring.rmi.entity;

public class ArrayOfString implements java.io.Serializable {

    private String[] string;

    public ArrayOfString() {
    }

    public ArrayOfString(String[] string) {
        this.string = string;
    }


    /**
     * Gets the string value for this ArrayOfString.
     *
     * @return string
     */
    public String[] getString() {
        return string;
    }


    /**
     * Sets the string value for this ArrayOfString.
     *
     * @param string
     */
    public void setString(String[] string) {
        this.string = string;
    }

    public String getString(int i) {
        return this.string[i];
    }

    public void setString(int i, String _value) {
        this.string[i] = _value;
    }

    private Object __equalsCalc = null;

    private boolean __hashCodeCalc = false;

    @Override
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfString)) return false;
        ArrayOfString other = (ArrayOfString) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = ((this.string == null && other.getString() == null)
                || (this.string != null && java.util.Arrays.equals(this.string, other.getString())));
        __equalsCalc = null;
        return _equals;
    }


    @Override
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int hashcodeTemp = 1;
        if (getString() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getString());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getString(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    hashcodeTemp += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return hashcodeTemp;
    }


}
