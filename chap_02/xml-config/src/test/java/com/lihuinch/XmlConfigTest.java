package com.lihuinch;

import com.lihuinch.bean.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author lihuinch
 * @date 2019/1/29 17:26
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring-beans.xml"})
public class XmlConfigTest {

    @Autowired
    private XmlBeanWithoutId xmlBeanWithoutId;

    @Autowired
    private XmlBeanPropertiesWithStringAndBean xmlBeanPropertiesWithStringAndBean;

    @Autowired
    private XmlBeanWithHasOneMoreConstructor xmlBeanWithHasOneMoreConstructor;

    @Autowired
    private XmlBeanPropertiesWithStringAndBeanWithoutConstructor xmlBeanPropertiesWithStringAndBeanWithoutConstructor;

    @Autowired
    private XmlBeanWithListInConstructor xmlBeanWithListInConstructor;

    @Autowired
    private XmlBeanWithListWithoutConstructor xmlBeanWithListWithoutConstructor;

    @Before
    public void before() {
        System.out.println("用普通xml（不包含c、p命名空间）来配置bean");
        System.out.println();
    }

    @Test
    public void testForXmlBeanWithoutIdAutowired() {
        System.out.println("xml配置中没有id的bean，使用@Autowired也能注入成功：");
        System.out.println(xmlBeanWithoutId);
    }

    @Test
    public void testForXmlBeanPropertiesWithStringAndBean() {
        System.out.println("属性含有String和其他bean，有构造函数，xml配置使用构造函数配置属性，使用@Autowired注入成功：");
        System.out.println(xmlBeanPropertiesWithStringAndBean);
    }

    @Test
    public void testForXmlBeanWithHasOneMoreConstructor() {
        System.out.println("有多个构造器，xml中只使用其中一个，使用@Autowired注入成功：");
        System.out.println(xmlBeanWithHasOneMoreConstructor);
    }

    @Test
    public void testForXmlBeanPropertiesWithStringAndBeanWithoutConstructor() {
        System.out.println("属性含有String和其他bean，没有构造函数，xml配置使用properties配置属性，使用@Autowired注入成功：");
        System.out.println("使用properties配置属性需要提供对应的setter");
        System.out.println(xmlBeanPropertiesWithStringAndBeanWithoutConstructor);
    }

    @Test
    public void testForXmlBeanWithListInConstructor() {
        System.out.println("属性含有String和构造函数中有list，只能使用constructor-arg方式，使用c/p空间无效，使用@Autowired注入成功：");
        System.out.println(xmlBeanWithListInConstructor);
    }

    @Test
    public void testForXmlBeanWithListWithoutConstructor() {
        System.out.println("属性含有属性有list，但是没有构造器，有setter,使用property设置list：");
        System.out.println(xmlBeanWithListWithoutConstructor);
    }
}
