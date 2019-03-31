package com.lihuinch.bean;

/**
 * 属性含有string 和 其他 bean
 *
 * @author lihuinch
 * @date 2019/1/25 15:57
 */
public class XmlBeanPropertiesWithStringAndBean {

    private String value;

    private XmlBean xmlBean1;

    private XmlBean xmlBean2;

    public XmlBeanPropertiesWithStringAndBean(String value, XmlBean xmlBean1, XmlBean xmlBean2) {
        System.out.println("call : XmlBeanPropertiesWithStringAndBean.XmlBeanPropertiesWithStringAndBean(String value, XmlBean xmlBean1, XmlBean xmlBean2)");

        this.value = value;
        this.xmlBean1 = xmlBean1;
        this.xmlBean2 = xmlBean2;

        System.out.println();
    }

    @Override
    public String toString() {
        return "XmlBeanPropertiesWithStringAndBean{" +
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
