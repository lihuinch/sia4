package com.lihuinch.sia4.chap11.spring.data.repository;

import com.lihuinch.sia4.chap11.spring.data.entity.NbaPlayer;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * @author lihuinch
 * @date 2020/2/6 12:33
 */
public class SpringDataRepositoryImpl implements ComplexRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<NbaPlayer> listOneTeamPlayersComplex(String team) {
        String sql = "SELECT a FROM NbaPlayer a WHERE a.teamName = :team";
        return (List<NbaPlayer>) em.createQuery(sql).setParameter("team", team).getResultList();
    }
}
