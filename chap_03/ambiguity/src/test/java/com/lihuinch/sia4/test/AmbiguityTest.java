package com.lihuinch.sia4.test;

import com.lihuinch.sia4.bean.BaseInteface;
import com.lihuinch.sia4.config.Autoconfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author lihuinch
 * @date 2019/4/10 7:35
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Autoconfig.class)
public class AmbiguityTest {

    @Autowired
    private BaseInteface beanImplementsBaseInterfaceWithPrimary;

    @Autowired
    @Qualifier("beanImplementsBaseInterface")
    private BaseInteface beanImplementsBaseInterface;

    @Autowired
    @Qualifier("qualifier")
    private BaseInteface beanImplementsBaseInterfaceWithQualifier;

    @Test
    public void testForAmbiguity() {
        System.out.println("使用了primary注解的bean");
        System.out.println(beanImplementsBaseInterfaceWithPrimary);
        System.out.println(beanImplementsBaseInterfaceWithPrimary.getClass());

        System.out.println("借助默认qualifier的注解bean");
        System.out.println(beanImplementsBaseInterface);
        System.out.println(beanImplementsBaseInterface.getClass());

        System.out.println("使用@Qulalifier注解的bean");
        System.out.println(beanImplementsBaseInterfaceWithQualifier);
        System.out.println(beanImplementsBaseInterfaceWithQualifier.getClass());

    }
}
