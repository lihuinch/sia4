package com.lihuinch;

import com.lihuinch.bean.*;
import com.lihuinch.config.AutoConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author lihuinch
 * @date 2019/1/24 9:01
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AutoConfig.class)
public class AutoConfigTest {

    @Autowired
    private AutoBean autoBean;

    @Autowired
    private FieldAutowired fieldAutowired;

    @Autowired
    private ConstructorAutoWiredWithoutDefault constructorAutoWiredWithoutDefault;

    @Autowired
    private ConstructorAutoWiredWithDefault constructorAutoWiredWithDefault;

    @Autowired
    private ConstructorAutoWiredWithoutDefaultHasOther constructorAutoWiredWithoutDefaultHasOther;

    @Autowired
    private SetterAutoWiredWithoutAutoWired setterAutoWiredWithoutAutoWired;

    @Test
    public void testForFieldWired() {
        System.out.println("=============属性注入 Test================");
        autoBean.show();
        fieldAutowired.show();
    }

    @Test
    public void testForConstructorAutoWiredWithDefault() {
        System.out.println("============= 构造器注入，没有默认构造器 Test================");
        constructorAutoWiredWithoutDefault.show();
    }

    @Test
    public void testForConstructorAutoWiredWithoutDefault() {
        System.out.println("============= 构造器注入，有默认构造方法 Test================");
        constructorAutoWiredWithDefault.show();
    }

    @Test
    public void testForConstructorAutoWiredWithoutDefaultHasOther() {
        System.out.println("============= 构造器注入，没有默认构造函数，有其他不加@Autowired的构造函数 Test================");
        constructorAutoWiredWithoutDefaultHasOther.show();
    }

    @Test
    public void testForSetterAutoWiredWithoutAutoWired() {
        System.out.println("============= setter注入不加@Autowired，将不会被注入，null异常 ================");
        setterAutoWiredWithoutAutoWired.show();
    }
}
