package com.lihuinch.bean;

/**
 * 有属性和其他类对象，没有setter和构造器
 *
 * @author lihuinch
 * @date 2019/3/19 8:16
 */
public class JavaConfigWithoutSetterAndConstructor {

    private String value;

    private JavaConfigBean javaConfigBean;

    @Override
    public String toString() {
        return "JavaConfigWithoutSetterAndConstructor{" +
                "value='" + value + '\'' +
                ", javaConfigBean=" + javaConfigBean +
                '}';
    }
}
