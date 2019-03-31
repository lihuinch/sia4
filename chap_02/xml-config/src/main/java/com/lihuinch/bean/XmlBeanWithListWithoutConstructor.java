package com.lihuinch.bean;

import java.util.List;

/**
 * 属性有list，但是没有构造器，有setter
 * @author lihuinch
 * @date 2019/3/21 8:53
 */
public class XmlBeanWithListWithoutConstructor {

    private List<String> stringList;

    @Override
    public String toString() {
        return "XmlBeanWithListWithoutConstructor{" +
                "stringList=" + stringList +
                '}';
    }

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }
}
