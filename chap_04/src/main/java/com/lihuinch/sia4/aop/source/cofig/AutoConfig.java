package com.lihuinch.sia4.aop.source.cofig;

import com.lihuinch.sia4.aop.source.aspect.Audience1;
import com.lihuinch.sia4.aop.source.bean.BlankDisc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lihuinch
 * @date 2019/7/3 20:34
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.lihuinch.sia4.aop.source")
public class AutoConfig {
    // 必须有！！！！！！！！！！！
    // 必须将这个纳为bean管理
    // 或者使用 @Component
    @Bean
    public Audience1 audience1() {
        return new Audience1();
    }

    @Bean
    public BlankDisc blankDisc() {
        BlankDisc blankDisc = new BlankDisc();
        blankDisc.setArtist("lh");
        blankDisc.setTitle("kb");

        List<String> songs = new ArrayList<String>();
        songs.add("1");
        songs.add("2");
        songs.add("3");

        blankDisc.setTracks(songs);

        return blankDisc;
    }
}
