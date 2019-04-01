package com.lihuinch.sia4.profile;

import com.lihuinch.sia4.profile.bean.ActiveOneBean;
import com.lihuinch.sia4.profile.bean.ActiveTwoBean;
import com.lihuinch.sia4.profile.bean.BaseBean;
import com.lihuinch.sia4.profile.config.ProfileAutoConfig;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 自动扫描test
 *
 * @author lihuinch
 * @date 2019/3/31 18:51
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ProfileAutoConfig.class)
@ActiveProfiles("one")
public class ProfileAutoConfigTest {

    @Autowired
    private ActiveOneBean activeOneBean;

    @Autowired(required = false)
    private ActiveTwoBean activeTwoBean;

    //    不可以声明两个bean
    //    @Autowired
    //    private BaseBean baseBean;


    @Before
    public void before() {
        System.out.println("使用了lombok，请勾选compile选择选项使得lombo可以工作");
        System.out.println("激活的环境是one");
    }

    @Test
    public void testForOnlyUseProfile() {
        System.out.println("仅在bean上增加 @Profile 注解：");
        System.out.println("加上@Profile(\"one\")的 bean 在one环境的 spring上下文中");
        System.out.println(activeOneBean);

        System.out.println();

        System.out.println("加上@Profile(\"two\")的 bean 不在one环境的spring上下文中");
        System.out.println(activeTwoBean);



    }
}
