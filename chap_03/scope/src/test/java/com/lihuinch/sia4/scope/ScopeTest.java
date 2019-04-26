package com.lihuinch.sia4.scope;

import com.lihuinch.sia4.scope.bean.SingletonBean;
import com.lihuinch.sia4.scope.config.ScopeAutoConfig;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * scope test
 *
 * @author lihuinch
 * @date 2019/4/26 12:53
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ScopeAutoConfig.class)
public class ScopeTest {

    @Autowired
    private SingletonBean singletonBean1;

    @Autowired
    private SingletonBean singletonBean2;

    @Before
    public void before() {
        System.out.println("关于bean作用域的测试");
        System.out.println("使用了lombok，请勾选compile选择选项使得lombo可以工作");
    }

    @Test
    public void testForSingletonBean() {
        System.out.println("单例（Singleton）：在整个应用中，只创建bean的一个实例。");
        System.out.println("SingletonBean注解加上 @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)表示为单例，有一个value的对象属性");
        System.out.println("此处生成两个SingletonBean的bean对象，尝试修改其中一个bean的value值，另一个value值如果也发生变化，则证明只创建bean的一个实例");

        System.out.println("singletonBean1.getValue = " + singletonBean1.getValue());
        System.out.println("singletonBean2.getValue = " + singletonBean2.getValue());

        singletonBean1.setValue(1111111);
        System.out.println("singletonBean1.setValue(111111)");

        System.out.println("Then singletonBean2.getValue = " + singletonBean2.getValue());
        System.out.println("也变成了singletonBean1的值");
    }
}
