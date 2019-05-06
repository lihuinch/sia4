package com.lihuinch.sia4.scope;

import com.lihuinch.sia4.scope.bean.DefaultScopeBean;
import com.lihuinch.sia4.scope.bean.DefaultScopeWithScopeAnnotationBean;
import com.lihuinch.sia4.scope.bean.PrototypeBean;
import com.lihuinch.sia4.scope.bean.SingletonBean;
import com.lihuinch.sia4.scope.config.ScopeAutoConfig;
import org.junit.After;
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
public class ScopeOfSingleAndPrototypeTest {

    @Autowired
    private SingletonBean singletonBean1;

    @Autowired
    private SingletonBean singletonBean2;

    @Autowired
    private PrototypeBean prototypeBean1;

    @Autowired
    private PrototypeBean prototypeBean2;

    @Autowired
    private DefaultScopeBean defaultScopeBean1;

    @Autowired
    private DefaultScopeBean defaultScopeBean2;

    @Autowired
    private DefaultScopeWithScopeAnnotationBean defaultScopeWithScopeAnnotationBean1;

    @Autowired
    private DefaultScopeWithScopeAnnotationBean defaultScopeWithScopeAnnotationBean2;

    @Before
    public void before() {
        System.out.println("=================== 关于bean作用域[单例和原型]的测试 ===================");
        System.out.println("=================== 使用了lombok，请勾选compile选择选项使得lombo可以工作 ===================");
        System.out.println();
    }

    @After
    public void after() {
        System.out.println();
        System.out.println("=================== 增加了默认构造器，并在其中添加了打印语句，就能看出声明了几次对应的bean ===================");
    }


    @Test
    public void testForSingletonBean() {
        System.out.println("单例（Singleton）：在整个应用中，只创建bean的一个实例。");
        System.out.println("SingletonBean注解加上 @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)表示为单例，有一个value的对象属性");
        System.out.println("此处生成两个bean对象，尝试修改其中一个bean的value值，另一个value值如果也发生变化，则证明只创建bean的一个实例");

        System.out.println("singletonBean1.getValue = " + singletonBean1.getValue());
        System.out.println("singletonBean2.getValue = " + singletonBean2.getValue());

        singletonBean1.setValue(1111111);
        System.out.println("singletonBean1.setValue(111111)");

        System.out.println("Then singletonBean2.getValue = " + singletonBean2.getValue());
        System.out.println("也变成了 singletonBean1 的值");
    }

    @Test
    public void testForDefaultScopeBean() {
        System.out.println("没标注@Scope标签的默认作用域是单例的");
        System.out.println("此处生成两个bean对象，尝试修改其中一个bean的value值，另一个value值如果也发生变化，则证明只创建bean的一个实例");

        defaultScopeBean1.setValue(1111111);
        System.out.println("defaultScopeBean1.setValue(111111)");

        System.out.println("Then defaultScopeBean2.getValue = " + defaultScopeBean2.getValue());
        System.out.println("也变成了 defaultScopeBean1 的值");
    }

    @Test
    public void testForDefaultScopeWithScopeAnnotationBean() {
        System.out.println("加了标注@Scope标签但是没有设定作用域值的默认作用域是单例的");
        System.out.println("此处生成两个bean对象，尝试修改其中一个bean的value值，另一个value值如果也发生变化，则证明只创建bean的一个实例");

        defaultScopeWithScopeAnnotationBean1.setValue(1111111);
        System.out.println("defaultScopeWithScopeAnnotationBean1.setValue(111111)");

        System.out.println("Then defaultScopeWithScopeAnnotationBean2.getValue = " + defaultScopeWithScopeAnnotationBean2.getValue());
        System.out.println("也变成了 defaultScopeWithScopeAnnotationBean1 的值");
    }

    @Test
    public void testForPrototypeBean() {
        System.out.println("加上注解@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)声明为 原型（Prototype）");
        System.out.println("原型（Prototype）：每次注入或者通过Spring应用上下文获取的时候，都会创建一个新的bean实例。");
        System.out.println("此处生成两个bean对象，尝试修改其中一个bean的value值，另一个value值美誉哦也发生变化，则证明每次声明都会创建bean的一个实例");

        prototypeBean1.setValue(1111111);
        System.out.println("prototypeBean1.setValue(111111)");

        System.out.println("Then prototypeBean2.getValue = " + prototypeBean2.getValue());
        System.out.println("也变成了 prototypeBean1 的值");
    }
}
