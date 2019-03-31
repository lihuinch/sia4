package com.lihuinch.config;

import com.lihuinch.bean.JavaConfigBean;
import com.lihuinch.bean.JavaConfigBeanWithOtherBean;
import com.lihuinch.bean.JavaConfigWithoutSetterAndConstructor;
import com.lihuinch.bean.JavaConfigWithoutSetterAndConstructorUseReflect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Field;

/**
 * @author lihuinch
 * @date 2019/1/25 15:15
 */
@Configuration
public class JavaConfig {

    @Bean
    public JavaConfigBean javaConfigBean() {
        JavaConfigBean javaConfigBean = new JavaConfigBean();
        javaConfigBean.setValue("JavaConfigBean.value");
        return javaConfigBean;
    }

    @Bean
    public JavaConfigBeanWithOtherBean javaConfigBeanWithOtherBean() {
        String value = "JavaConfigBeanWithOtherBean.value";
        return new JavaConfigBeanWithOtherBean(javaConfigBean(), value);
    }

    @Bean
    public JavaConfigWithoutSetterAndConstructor javaConfigWithoutSetterAndConstrotor() {
        JavaConfigWithoutSetterAndConstructor javaConfigWithoutSetterAndConstructor = new JavaConfigWithoutSetterAndConstructor();

        System.out.println("有属性和其他类对象，没有setter和构造器, 无法设置属性");

        return javaConfigWithoutSetterAndConstructor;
    }
    @Bean
    public JavaConfigWithoutSetterAndConstructorUseReflect javaConfigWithoutSetterAndConstrotorUseReflect() {
        System.out.println("有属性和其他类对象，没有setter和构造器, 无法设置属性,javaconfig借助反射注入属性");

        Class<JavaConfigWithoutSetterAndConstructorUseReflect> javaConfigWithoutSetterAndConstrotorUseReflectClass = JavaConfigWithoutSetterAndConstructorUseReflect.class;
        JavaConfigWithoutSetterAndConstructorUseReflect javaConfigWithoutSetterAndConstructorUseReflect = null;
        try {
            javaConfigWithoutSetterAndConstructorUseReflect = javaConfigWithoutSetterAndConstrotorUseReflectClass.newInstance();
            Field value = javaConfigWithoutSetterAndConstrotorUseReflectClass.getDeclaredField("value");
            Field javaConfigBean = javaConfigWithoutSetterAndConstrotorUseReflectClass.getDeclaredField("javaConfigBean");
            value.setAccessible(true);
            javaConfigBean.setAccessible(true);

            value.set(javaConfigWithoutSetterAndConstructorUseReflect, "javaConfigWithoutSetterAndConstrotorUseReflect.value");
            javaConfigBean.set(javaConfigWithoutSetterAndConstructorUseReflect, javaConfigBean());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        return javaConfigWithoutSetterAndConstructorUseReflect;
    }
}
