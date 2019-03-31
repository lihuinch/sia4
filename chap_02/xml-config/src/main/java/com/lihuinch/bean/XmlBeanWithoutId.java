package com.lihuinch.bean;

/**
 * xml中没有写明id的bean
 *
 * @author lihuinch
 * @date 2019/1/25 15:57
 */
public class XmlBeanWithoutId {

    private String value;

    @Override
    public String toString() {
        return "XmlBeanWithoutId{" +
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
