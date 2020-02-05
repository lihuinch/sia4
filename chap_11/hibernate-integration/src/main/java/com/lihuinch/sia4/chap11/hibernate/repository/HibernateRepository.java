package com.lihuinch.sia4.chap11.hibernate.repository;

import com.lihuinch.sia4.chap11.hibernate.entity.NbaPlayer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

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

    public long count() {
        return findAll().size();
    }

    public NbaPlayer save(NbaPlayer nbaPlayer) {
        Serializable id = currentSession().save(nbaPlayer);
        return new NbaPlayer(nbaPlayer.getTeamName(), nbaPlayer.getPlayerName());
    }

    public NbaPlayer findOne(long id) {
        return (NbaPlayer) currentSession().get(NbaPlayer.class, id);
    }

    public NbaPlayer findByPlayerName(String playerName) {
        return (NbaPlayer) currentSession()
                .createCriteria(NbaPlayer.class)
                // 这边要用java实体的字段名
                .add(Restrictions.eq("playerName", playerName))
                .list().get(0);
    }

    public List<NbaPlayer> findAll() {
        return (List<NbaPlayer>) currentSession().createCriteria(NbaPlayer.class).list();
    }
}
