package com.lihuinch.sia4.chap3.spel;

import com.lihuinch.sia4.chap3.spel.bean.SpelBean2;
import com.lihuinch.sia4.chap3.spel.config.AutoConfig;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author lihuinch
 * @date 2019/6/30 18:06
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AutoConfig.class)
public class SpelTest {

    @Autowired
    private SpelBean2 spelBean2;

    @Before
    public void before() {
        System.out.println("使用spel");
    }

    @Test
    public void test() {
        System.out.println(spelBean2);
    }
}
