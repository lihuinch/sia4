package com.lihuinch.sia4.chap12.spring.data.neo4j.repository;

import com.lihuinch.sia4.chap12.spring.data.neo4j.entity.NbaTeam;

/**
 * @author lihuinch
 * @date 2020/2/6 23:17
 */
public interface ComplexRepository {
    NbaTeam findByTeamNameComplex(String teamName);
}
