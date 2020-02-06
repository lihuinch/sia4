package com.lihuinch.sia4.chap12.spring.data.mongodb.test;

import com.lihuinch.sia4.chap12.spring.data.mongodb.config.AppConfig;
import com.lihuinch.sia4.chap12.spring.data.mongodb.entity.NbaPlayer;
import com.lihuinch.sia4.chap12.spring.data.mongodb.entity.NbaTeam;
import com.lihuinch.sia4.chap12.spring.data.mongodb.repository.MongoDBRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author lihuinch
 * @date 2020/2/6 23:29
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class MongoDBTest {

    @Autowired
    private MongoDBRepository repository;

    @Test
    public void test() {

        NbaTeam nbaTeam = new NbaTeam();
        nbaTeam.setId(1L);
        nbaTeam.setTeamName("LA");


        NbaPlayer kobe = new NbaPlayer();
        kobe.setId(24L);
        kobe.setPlayerName("科比");
        kobe.setTeamName("LA");

        nbaTeam.getNbaPlayers().add(kobe);

        repository.save(nbaTeam);

        System.out.println(repository.findByTeamNameLike("LA"));
        System.out.println(repository.findByTeamNameLikeQuery("LA"));
        System.out.println(repository.findByTeamNameLikeComplex("LA"));

    }

}
