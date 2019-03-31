package com.lihuinch;

import com.lihuinch.bean.XmlBeanWithoutId;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lihuinch
 * @date 2019/1/29 18:12
 */
public class XmlConfigWithMainTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");

        // xml中没有配bean的id，id果然是 包名.类名#数字
        System.out.println("get bean : com.lihuinch.bean.XmlBeanWithoutId#0");
        XmlBeanWithoutId xmlBeanWithoutId = (XmlBeanWithoutId) context.getBean("com.lihuinch.bean.XmlBeanWithoutId#0");

        System.out.println(xmlBeanWithoutId);
    }
}
