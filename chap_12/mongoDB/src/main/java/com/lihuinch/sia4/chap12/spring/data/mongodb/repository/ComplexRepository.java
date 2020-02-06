package com.lihuinch.sia4.chap12.spring.data.mongodb.repository;

import com.lihuinch.sia4.chap12.spring.data.mongodb.entity.NbaTeam;

/**
 * @author lihuinch
 * @date 2020/2/6 23:17
 */
public interface ComplexRepository {
    NbaTeam findByTeamNameLikeComplex(String teamName);

}
