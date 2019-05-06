package com.lihuinch.sia4.scope;

import com.lihuinch.sia4.scope.bean.*;
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
public class ScopeOfSessionAndRequestTest {


    /**
     * 需要在web应用中才行
     */






    @Autowired
    private WithSessionBean withSessionBean;

    @Before
    public void before() {
        System.out.println("=================== 关于bean作用域【会话和请求】的测试 ===================");
        System.out.println("=================== 使用了lombok，请勾选compile选择选项使得lombo可以工作 ===================");
        System.out.println();
    }

    @After
    public void after() {
        System.out.println();
        System.out.println("=================== 增加了默认构造器，并在其中添加了打印语句，就能看出声明了几次对应的bean ===================");
    }


    @Test
    public void testWithSessionBean() {
        System.out.println(withSessionBean);
    }
}
