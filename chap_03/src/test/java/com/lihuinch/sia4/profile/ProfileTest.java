package com.lihuinch.sia4.profile;

import com.lihuinch.sia4.profile.bean.ActiveOneBean;
import com.lihuinch.sia4.profile.bean.ActiveTwoBean;
import com.lihuinch.sia4.profile.config.ProfileConfig;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author lihuinch
 * @date 2019/3/31 18:51
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ProfileConfig.class)
@ActiveProfiles("one")
public class ProfileTest {

    @Autowired
    private ActiveOneBean activeOneBean;

    @Autowired
    private ActiveTwoBean activeTwoBean;

    @Before
    public void before() {
        System.out.println("激活的bean是");
    }
}
