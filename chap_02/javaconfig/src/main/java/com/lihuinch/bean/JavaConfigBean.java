package com.lihuinch.bean;

/**
 * @author lihuinch
 * @date 2019/1/24 17:45
 */
public class JavaConfigBean {

    private String value;

    @Override
    public String toString() {
        return "JavaConfigBean{" +
                "value='" + value + '\'' +
                '}';
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        System.out.println("JavaConfigBean.public void setValue(String value)");
        this.value = value;
    }
}
