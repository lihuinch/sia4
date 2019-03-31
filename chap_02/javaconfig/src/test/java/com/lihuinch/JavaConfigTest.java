package com.lihuinch;

import com.lihuinch.bean.JavaConfigBean;
import com.lihuinch.bean.JavaConfigBeanWithOtherBean;
import com.lihuinch.bean.JavaConfigWithoutSetterAndConstructor;
import com.lihuinch.bean.JavaConfigWithoutSetterAndConstructorUseReflect;
import com.lihuinch.config.JavaConfig;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author lihuinch
 * @date 2019/1/25 15:20
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JavaConfig.class)
public class JavaConfigTest {

    @Autowired
    private JavaConfigBean javaConfigBean;

    @Autowired
    private JavaConfigBeanWithOtherBean javaConfigBeanWithOtherBean;

    @Autowired
    private JavaConfigWithoutSetterAndConstructor javaConfigWithoutSetterAndConstructor;

    @Autowired
    private JavaConfigWithoutSetterAndConstructorUseReflect javaConfigWithoutSetterAndConstructorUseReflect;

    @Before
    public void before() {
        System.out.println("=============Java 配置==============");
    }

    @Test
    public void testForJavaConfig() {
        System.out.println(javaConfigBean);
    }

    @Test
    public void testFoJavaConfigBeanWithOtherBean() {
        System.out.println(javaConfigBeanWithOtherBean);
    }


    @Test
    public void testFoJavaConfigWithoutSetterAndConstructor() {
        System.out.println("当java bean中没有构造器和setter函数");

        System.out.println("不借助反射无法设置属性，属性为null");
        System.out.println(javaConfigWithoutSetterAndConstructor);

        System.out.println("借助反射设置属性，属性不为null");
        System.out.println(javaConfigWithoutSetterAndConstructorUseReflect);
    }
}
