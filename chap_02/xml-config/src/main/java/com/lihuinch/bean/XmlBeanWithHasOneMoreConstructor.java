package com.lihuinch.bean;

/**
 * 含有多个构造函数
 *
 * @author lihuinch
 * @date 2019/1/25 15:57
 */
public class XmlBeanWithHasOneMoreConstructor {

    private String value;

    private XmlBean xmlBean1;

    private XmlBean xmlBean2;

    public XmlBeanWithHasOneMoreConstructor(String value, XmlBean xmlBean1) {
        System.out.println("call : XmlBeanWithHasOneMoreConstructor.XmlBeanWithHasOneMoreConstructor(String value, XmlBean xmlBean1)");

        this.value = value;
        this.xmlBean1 = xmlBean1;

        System.out.println();
    }

    public XmlBeanWithHasOneMoreConstructor(String value, XmlBean xmlBean1, XmlBean xmlBean2) {
        System.out.println("call : XmlBeanWithHasOneMoreConstructor.XmlBeanWithHasOneMoreConstructor(String value, XmlBean xmlBean1, XmlBean xmlBean2)");

        this.value = value;
        this.xmlBean1 = xmlBean1;
        this.xmlBean2 = xmlBean2;

        System.out.println();
    }

    @Override
    public String toString() {
        return "XmlBeanWithHasOneMoreConstructor{" +
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
}
