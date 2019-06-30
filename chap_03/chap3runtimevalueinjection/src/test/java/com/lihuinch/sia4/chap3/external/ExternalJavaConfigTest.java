package com.lihuinch.sia4.chap3.external;

import com.lihuinch.sia4.chap3.external.bean.ExternalBean;
import com.lihuinch.sia4.chap3.external.config.ExternalJavaConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author lihuinch
 * @date 2019/5/7 12:56
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ExternalJavaConfig.class)
public class ExternalJavaConfigTest {

    @Autowired
    private ExternalBean externalBean;

    @Autowired
    @Qualifier("externalBeanWithValue")
    private ExternalBean externalBeanWithValue;

/*
    @Autowired
    @Qualifier("externalBeanWithGetPropertyAsClass")
    private ExternalBean externalBeanWithGetPropertyAsClass;

*/
    public void before() {
        System.out.println("");
    }

    @Test
    public void testForExternalBean() {
        System.out.println("使用environment.getProperty赋值");
        System.out.println(externalBean);

        System.out.println("使用@Value赋值");
        System.out.println(externalBeanWithValue);
    }
}
