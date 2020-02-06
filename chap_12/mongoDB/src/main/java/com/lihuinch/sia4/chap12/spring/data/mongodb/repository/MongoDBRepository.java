package com.lihuinch.sia4.chap12.spring.data.mongodb.repository;

import com.lihuinch.sia4.chap12.spring.data.mongodb.entity.NbaTeam;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 * @author lihuinch
 * @date 2020/2/6 23:16
 */
public interface MongoDBRepository extends MongoRepository<NbaTeam, Long>, ComplexRepository {

    NbaTeam findByTeamNameLike(String teamName);

    @Query("{'teamName': ?0}")
    NbaTeam findByTeamNameLikeQuery(String teamName);
}
