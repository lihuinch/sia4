package com.lihuinch.bean;

/**
 * 有属性和其他类对象，没有setter和构造器, javaconfig借助反射注入属性
 *
 * @author lihuinch
 * @date 2019/3/19 8:16
 */
public class JavaConfigWithoutSetterAndConstructorUseReflect {

    private String value;

    private JavaConfigBean javaConfigBean;

    @Override
    public String toString() {
        return "JavaConfigWithoutSetterAndConstructorUseReflect{" +
                "value='" + value + '\'' +
                ", javaConfigBean=" + javaConfigBean +
                '}';
    }
}
