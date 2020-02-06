package com.lihuinch.sia4.chap12.spring.data.mongodb.repository;

import com.lihuinch.sia4.chap12.spring.data.mongodb.entity.NbaTeam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

/**
 * @author lihuinch
 * @date 2020/2/6 23:21
 */
public class MongoDBRepositoryImpl implements ComplexRepository {

    @Autowired
    private MongoOperations mongo;

    @Override
    public NbaTeam findByTeamNameLikeComplex(String teamName) {

        Criteria where = Criteria.where("teamName").regex(teamName);
        Query query = Query.query(where);

        return mongo.findOne(query, NbaTeam.class);
    }
}
