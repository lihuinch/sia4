package com.lihuinch;

import com.lihuinch.bean.XmlBeanWithHasOneMoreConstructor;
import com.lihuinch.bean.XmlBeanPropertiesWithStringAndBean;
import com.lihuinch.bean.XmlBeanWithListWithoutConstructor;
import com.lihuinch.bean.XmlBeanWithoutId;
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
@ContextConfiguration(locations = {"classpath:/spring-beans-use-c-and-p.xml"})
public class XmlConfigUseCAndPTest {

    @Autowired
    private XmlBeanWithoutId xmlBeanWithoutId;

    @Autowired
    private XmlBeanPropertiesWithStringAndBean xmlBeanPropertiesWithStringAndBean;

    @Autowired
    private XmlBeanWithHasOneMoreConstructor xmlBeanWithHasOneMoreConstructor;

    @Autowired
    private XmlBeanWithListWithoutConstructor xmlBeanWithListWithoutConstructor;

    @Before
    public void before() {
        System.out.println("使用c和p命名空间的xml配置：");
        System.out.println();
    }

    @Test
    public void testForXmlBeanWithoutIdAutowired() {
        System.out.println("xml中没有id的bean，使用@Autowired也能注入成功：");
        xmlBeanWithoutId.setValue("XmlBeanWithoutId的value");

        System.out.println(xmlBeanWithoutId);
    }

    @Test
    public void testForXmlBeanPropertiesWithStringAndBean() {
        System.out.println("xmlBeanPropertiesWithStringAndBean使用@Autowired注入成功：");

        System.out.println(xmlBeanPropertiesWithStringAndBean);
    }

    @Test
    public void testForXmlBeanWithHasOneMoreConstructor() {
        System.out.println("有多个构造器，xml中只使用其中一个，使用@Autowired注入成功：");

        System.out.println(xmlBeanWithHasOneMoreConstructor);
    }

    @Test
    public void testForXmlBeanWithListWithoutConstructor() {
        System.out.println("属性含有属性有list，但是没有构造器，有setter,使用p和util：list设置list：");
        System.out.println(xmlBeanWithListWithoutConstructor);
    }
}
