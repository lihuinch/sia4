package com.lihuinch.sia4.test;

import com.lihuinch.sia4.annotation.CustomAnnotation;
import com.lihuinch.sia4.bean.BaseInterface;
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
    private BaseInterface beanImplementsBaseInterfaceWithPrimary;

    @Autowired
    @Qualifier("beanImplementsBaseInterface")
    private BaseInterface beanImplementsBaseInterface;

    @Autowired
    @Qualifier("qualifier")
    private BaseInterface beanImplementsBaseInterfaceWithQualifier;

    @Autowired
    @CustomAnnotation
    private BaseInterface beanImplementsBaseInterfaceWithCustomQualifierAnnotations;

    @Test
    public void testForAmbiguity() {
        System.out.println("使用了@Primary注解的bean");
        System.out.println(beanImplementsBaseInterfaceWithPrimary);
        System.out.println(beanImplementsBaseInterfaceWithPrimary.getClass());
        System.out.println();

        System.out.println("借助默认@Qualifier的注解bean");
        System.out.println("默认qualifier就是bean的类名首字母小写");
        System.out.println(beanImplementsBaseInterface);
        System.out.println(beanImplementsBaseInterface.getClass());
        System.out.println();

        System.out.println("使用@Qulalifier注解的bean");
        System.out.println(beanImplementsBaseInterfaceWithQualifier);
        System.out.println(beanImplementsBaseInterfaceWithQualifier.getClass());
        System.out.println();


        System.out.println("使用自定义限定符注解@CustomAnnotation");
        System.out.println(beanImplementsBaseInterfaceWithCustomQualifierAnnotations);
        System.out.println(beanImplementsBaseInterfaceWithCustomQualifierAnnotations.getClass());
        System.out.println();
    }
}
