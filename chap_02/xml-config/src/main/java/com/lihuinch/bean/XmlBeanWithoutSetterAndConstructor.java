package com.lihuinch.bean;

/**
 * 没有构造器和setter
 * xml方式不能配置其中的属性
 *
 * @author lihuinch
 * @date 2019/3/19 8:49
 */
public class XmlBeanWithoutSetterAndConstructor {

    private String value;

    private XmlBean xmlBean;

    @Override
    public String toString() {
        return "XmlBeanWithoutSetterAndConstructor{" +
                "value='" + value + '\'' +
                ", xmlBean=" + xmlBean +
                '}';
    }
}
