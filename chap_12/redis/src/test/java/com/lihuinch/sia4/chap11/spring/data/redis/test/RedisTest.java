package com.lihuinch.sia4.chap11.spring.data.redis.test;

import com.lihuinch.sia4.chap11.spring.data.redis.config.AppConfig;
import com.lihuinch.sia4.chap11.spring.data.redis.entity.NbaPlayer;
import com.lihuinch.sia4.chap11.spring.data.redis.repository.RedisRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * @author lihuinch
 * @date 2020/1/13 19:40
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class RedisTest {

    @Autowired
    private RedisRepository repository;

    @Test
    public void test() {
        NbaPlayer nbaPlayer = new NbaPlayer();
        nbaPlayer.setPlayerName("科比");
        nbaPlayer.setTeamName("LA");

        repository.set(nbaPlayer.getPlayerName(), nbaPlayer.toString());

        System.out.println(repository.get(nbaPlayer.getPlayerName()));
    }


}
