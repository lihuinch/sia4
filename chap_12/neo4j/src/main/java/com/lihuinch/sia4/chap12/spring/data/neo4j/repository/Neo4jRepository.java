package com.lihuinch.sia4.chap12.spring.data.neo4j.repository;

import com.lihuinch.sia4.chap12.spring.data.neo4j.entity.NbaTeam;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.repository.query.Param;

/**
 * @author lihuinch
 * @date 2020/2/6 23:16
 */
public interface Neo4jRepository extends GraphRepository<NbaTeam>, ComplexRepository {

    NbaTeam findByTeamName(String teamName);

    @Query("match (a:NbaTeam)-[:HAS_PLAYERS]->(b:NbaPlayer) " +
            "where b.teamName={teamName}  return o")
    NbaTeam findByTeamNameQuery(@Param("teamName") String teamName);
}
