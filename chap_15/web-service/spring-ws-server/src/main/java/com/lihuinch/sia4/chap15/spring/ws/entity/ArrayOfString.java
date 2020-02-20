/**
 * ArrayOfString.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.lihuinch.sia4.chap15.spring.ws.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfString", propOrder = {
        "string"
})
public class ArrayOfString implements java.io.Serializable {
    private java.lang.String[] string;

    public ArrayOfString() {
    }

    public ArrayOfString(java.lang.String[] string) {
        this.string = string;
    }


    /**
     * Gets the string value for this ArrayOfString.
     *
     * @return string
     */
    public java.lang.String[] getString() {
        return string;
    }


    /**
     * Sets the string value for this ArrayOfString.
     *
     * @param string
     */
    public void setString(java.lang.String[] string) {
        this.string = string;
    }

    public java.lang.String getString(int i) {
        return this.string[i];
    }

    public void setString(int i, java.lang.String _value) {
        this.string[i] = _value;
    }

}
