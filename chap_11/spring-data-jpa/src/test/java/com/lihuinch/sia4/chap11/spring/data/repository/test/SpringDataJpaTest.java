package com.lihuinch.sia4.chap11.spring.data.repository.test;

import com.lihuinch.sia4.chap11.spring.data.config.AppConfig;
import com.lihuinch.sia4.chap11.spring.data.entity.NbaPlayer;
import com.lihuinch.sia4.chap11.spring.data.repository.SpringDataRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;


/**
 * @author lihuinch
 * @date 2020/1/13 19:40
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
@Transactional(value = "transactionManager")
public class SpringDataJpaTest {

    @Autowired
    private SpringDataRepository repository;

    @Test
    public void test() {
        NbaPlayer nbaPlayer = new NbaPlayer();
        nbaPlayer.setPlayerName("科比");
        nbaPlayer.setTeamName("LA");
        NbaPlayer nbaPlayer1 = repository.saveAndFlush(nbaPlayer);
        nbaPlayer1.setPlayerName("kobe");

        System.out.println("countNbaPlayerBy ：" + repository.countNbaPlayerBy());
        System.out.println("findByPlayerName ：" + repository.findByPlayerName("科比"));
        System.out.println("listOneTeamPlayers ：" + repository.listOneTeamPlayers("LA"));
        System.out.println("listOneTeamPlayersComplex ：" + repository.listOneTeamPlayersComplex("LA"));

    }


}
