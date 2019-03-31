package com.lihuinch.bean;

/**
 * @author lihuinch
 * @date 2019/1/24 17:45
 */
public class JavaConfigBeanWithOtherBean {

    private String value;

    private JavaConfigBean javaConfigBean;

    public JavaConfigBeanWithOtherBean(JavaConfigBean javaConfigBean, String value) {
        System.out.println("JavaConfigBeanWithOtherBean. public JavaConfigBeanWithOtherBean(JavaConfigBean javaConfigBean, String value)");
        this.value = value;
        this.javaConfigBean = javaConfigBean;
    }

    @Override
    public String toString() {
        return "JavaConfigBeanWithOtherBean{" +
                "value='" + value + '\'' +
                ", javaConfigBean=" + javaConfigBean +
                '}';
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        System.out.println("JavaConfigBeanWithOtherBean.public void setValue(String value)");
        this.value = value;
    }
}
