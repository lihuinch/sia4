package com.lihuinch.sia4.profile.config;

import com.lihuinch.sia4.profile.bean.ActiveOneBean;
import com.lihuinch.sia4.profile.bean.BaseBean;
import com.lihuinch.sia4.profile.bean.BaseBeanActiveOneImpl;
import com.lihuinch.sia4.profile.bean.BaseBeanActiveTwoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * 关于profile实验的Java配置扫描config
 *
 * @author lihuinch
 * @date 2019/4/1 20:19
 */
@Configuration
public class ProfileJavaConfig {

    @Profile("one")
    @Bean
    public BaseBean baseBeanActiveOneImpl() {
        return new BaseBeanActiveOneImpl();
    }

    @Profile("two")
    @Bean
    public BaseBean baseBeanActiveTwoImpl() {
        return new BaseBeanActiveTwoImpl();
    }
}
