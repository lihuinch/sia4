package com.lihuinch.bean;

/**
 * @author lihuinch
 * @date 2019/1/25 15:57
 */
public class XmlBean {

    private String value;

    @Override
    public String toString() {
        return "XmlBean{" +
                "value='" + value + '\'' +
                '}';
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
