package com.lihuinch.bean;

/**
 * 属性含有String和其他bean，没有构造函数
 *
 * @author lihuinch
 * @date 2019/1/25 15:57
 */
public class XmlBeanPropertiesWithStringAndBeanWithoutConstructor {

    private String value;

    private XmlBean xmlBean1;

    private XmlBean xmlBean2;

    @Override
    public String toString() {
        return "XmlBeanPropertiesWithStringAndBeanWithoutConstructor{" +
                "value='" + value + '\'' +
                ", xmlBean1=" + xmlBean1 +
                ", xmlBean2=" + xmlBean2 +
                '}';
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    // 使用 property 需要提供对应的setter
    public void setXmlBean1(XmlBean xmlBean1) {
        this.xmlBean1 = xmlBean1;
    }

    // 使用 property 需要提供对应的setter
    public void setXmlBean2(XmlBean xmlBean2) {
        this.xmlBean2 = xmlBean2;
    }
}
