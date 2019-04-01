package com.lihuinch.sia4.conditional;

import com.lihuinch.sia4.conditional.bean.ConditionalBean;
import com.lihuinch.sia4.conditional.config.ConditionalAutoConfig;
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
@ContextConfiguration(classes = ConditionalAutoConfig.class)
@ActiveProfiles("active")
public class ConditionalTest {

    @Autowired
    private ConditionalBean conditionalBean;

    @Before
    public void before() {
        System.out.println("使用了lombok，请勾选compile选择选项使得lombo可以工作");
        System.out.println("激活的环境是active");
    }

    @Test
    public void testForOnlyUseProfile() {
        System.out.println("BeanCreateConditional奏效");
        System.out.println(conditionalBean);
    }
}
