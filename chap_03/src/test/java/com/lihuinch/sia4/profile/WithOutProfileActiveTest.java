package com.lihuinch.sia4.profile;

import com.lihuinch.sia4.profile.bean.ActiveOneBean;
import com.lihuinch.sia4.profile.bean.ActiveTwoBean;
import com.lihuinch.sia4.profile.bean.BaseBean;
import com.lihuinch.sia4.profile.bean.WithoutProfileBean;
import com.lihuinch.sia4.profile.config.ProfileAutoConfig;
import com.lihuinch.sia4.profile.config.ProfileJavaConfig;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 没有激活环境时候注解了@Profile的情Bean情况
 *
 * @author lihuinch
 * @date 2019/3/31 18:51
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ProfileAutoConfig.class)
public class WithOutProfileActiveTest {

    /* 以下写了@profile的bean将不会加载到Pringle上下文中

    @Autowired
    private ActiveOneBean activeOneBean;

    @Autowired
    private ActiveTwoBean activeTwoBean;

     */

    @Autowired
    private WithoutProfileBean withoutProfileBean;


    @Before
    public void before() {
        System.out.println("使用了lombok，请勾选compile选择选项使得lombo可以工作");
        System.out.println("没有激活环境时候注解了@Profile的情Bean情况");
        System.out.println("请debug查看@Profile的判别类ProfileCondition返回情况");
        System.out.println("会发现有一个default环境");
        System.out.println("如果内有激活的环境，那么所有bean将会被创建");
    }

    @Test
    public void testUseProfileBean() {
        System.out.println("以下写了@profile的bean将不会加载到Pringle上下文中");
        // System.out.println(activeOneBean);
        // System.out.println(activeTwoBean);
    }

    @Test
    public void testWithoutProfile() {
        System.out.println("没有加profile的bean将被正常加载");
        System.out.println(withoutProfileBean);
    }
}
