package com.lihuinch.sia4.chap11.jpa.test;

import com.lihuinch.sia4.chap11.jpa.config.AppConfig;
import com.lihuinch.sia4.chap11.jpa.entity.NbaPlayer;
import com.lihuinch.sia4.chap11.jpa.repository.JPARepository;
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
public class JPATest {

    @Autowired
    private JPARepository repository;

    @Test
    public void test() {

        NbaPlayer nbaPlayer = new NbaPlayer();
        nbaPlayer.setPlayerName("科比");
        nbaPlayer.setTeamName("LA");
        repository.save(nbaPlayer);

        System.out.println(repository.findByPlayerName("科比"));
    }


}
