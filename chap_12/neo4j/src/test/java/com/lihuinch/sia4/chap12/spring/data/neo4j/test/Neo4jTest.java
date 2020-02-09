package com.lihuinch.sia4.chap12.spring.data.neo4j.test;

import com.lihuinch.sia4.chap12.spring.data.neo4j.config.AppConfig;
import com.lihuinch.sia4.chap12.spring.data.neo4j.entity.NbaPlayer;
import com.lihuinch.sia4.chap12.spring.data.neo4j.entity.NbaTeam;
import com.lihuinch.sia4.chap12.spring.data.neo4j.repository.Neo4jRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author lihuinch
 * @date 2020/2/6 23:29
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class Neo4jTest {

    @Autowired
    private Neo4jRepository repository;

    @Test
    @Transactional
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

        System.out.println(repository.findByTeamName("LA"));
        System.out.println(repository.findByTeamNameQuery("LA"));
        System.out.println(repository.findByTeamNameComplex("LA"));

    }

}
