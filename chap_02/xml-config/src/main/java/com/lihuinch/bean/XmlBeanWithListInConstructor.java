package com.lihuinch.bean;

import java.util.Arrays;
import java.util.List;

/**
 * @author lihuinch
 * @date 2019/1/25 15:57
 */
public class XmlBeanWithListInConstructor {

    private String value;

    private List<String> stringList;

    public XmlBeanWithListInConstructor(String value, List<String> stringList) {
        System.out.println("call :  public XmlBeanWithListInConstructor");
        System.out.println("只能用constructor-arg装配");
        this.value = value;
        this.stringList = stringList;
    }

    @Override
    public String toString() {
        return "XmlBeanWithListInConstructor{" +
                "value='" + value + '\'' +
                ", stringList=" + stringList +
                '}';
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
