package com.lihuinch.sia4.profile;

import com.lihuinch.sia4.profile.bean.ActiveOneBean;
import com.lihuinch.sia4.profile.bean.ActiveTwoBean;
import com.lihuinch.sia4.profile.bean.BaseBean;
import com.lihuinch.sia4.profile.config.ProfileAutoConfig;
import com.lihuinch.sia4.profile.config.ProfileJavaConfig;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Java配置test
 *
 * @author lihuinch
 * @date 2019/3/31 18:51
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ProfileJavaConfig.class)
@ActiveProfiles("one")
public class ProfileJavaConfigTest {

    @Autowired
    private BaseBean baseBean;

    @Before
    public void before() {
        System.out.println("使用了lombok，请勾选compile选择选项使得lombo可以工作");
        System.out.println("激活的环境是one");
    }

    @Test
    public void testForOnlyUseProfile() {
        System.out.println("spring上下文中注入的bean是BaseBeanActiveOneImpl");
        System.out.println(baseBean);
    }
}
