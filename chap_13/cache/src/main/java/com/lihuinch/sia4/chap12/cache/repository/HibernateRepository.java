package com.lihuinch.sia4.chap12.cache.repository;

import com.lihuinch.sia4.chap12.cache.entity.NbaPlayer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

/**
 * @author lihuinch
 * @date 2020/1/13 19:45
 */
@Repository
@Transactional
public class HibernateRepository {

    @Autowired
    private SessionFactory sessionFactory;

    private Session currentSession() {
        return sessionFactory.getCurrentSession();
    }

    @CachePut(value = "nba", key = "#result.id")
    public NbaPlayer save(NbaPlayer nbaPlayer) {
        Serializable id = currentSession().save(nbaPlayer);
        return nbaPlayer;
    }

    @Cacheable(value = "nba", key = "#id")
    public NbaPlayer findOne(long id) {
        return (NbaPlayer) currentSession().get(NbaPlayer.class, id);
    }

    @Cacheable(value = "nba", key = "#playerName")
    public NbaPlayer findByPlayerName(String playerName) {
        return (NbaPlayer) currentSession()
                .createCriteria(NbaPlayer.class)
                // 这边要用java实体的字段名
                .add(Restrictions.eq("playerName", playerName))
                .list().get(0);
    }

    @CacheEvict(value = "nba", key = "#nbaPlayer.id", beforeInvocation = false)
    public void delete(NbaPlayer nbaPlayer) {
        currentSession().delete(nbaPlayer);
    }
}
