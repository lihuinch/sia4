package com.lihuinch.sia4.chap11.jpa.repository;

import com.lihuinch.sia4.chap11.jpa.entity.NbaPlayer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 * @author lihuinch
 * @date 2020/1/13 19:45
 */
@Repository
@Transactional
public class JPARepository {

    @PersistenceContext
    private EntityManager em;

    public NbaPlayer save(NbaPlayer nbaPlayer) {
        em.persist(nbaPlayer);
        return new NbaPlayer(nbaPlayer.getTeamName(), nbaPlayer.getPlayerName());
    }

    public NbaPlayer findOne(long id) {
        return em.find(NbaPlayer.class, id);
    }

    public NbaPlayer findByPlayerName(String playerName) {
        // 这边要用java实体的字段名
        return (NbaPlayer) em.createQuery("SELECT a" +
                " FROM NbaPlayer a" +
                " WHERE a.playerName = :playerName ")
                .setParameter("playerName", playerName)
                .getSingleResult();
    }


}
