package com.lihuinch.sia4.chap12.spring.data.neo4j.repository;

import com.lihuinch.sia4.chap12.spring.data.neo4j.entity.NbaTeam;
import org.neo4j.ogm.session.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.template.Neo4jOperations;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author lihuinch
 * @date 2020/2/6 23:21
 */
public class Neo4jRepositoryImpl implements ComplexRepository {

    @Autowired
    private Neo4jOperations neo4j;

    @Override
    public NbaTeam findByTeamNameComplex(String teamName) {
        Map<String, Object> queryParam = new HashMap<String, Object>(2) {{
            put("teamName", teamName);
        }};

        Result result = neo4j.query(
                "match (a:NbaTeam)-[:HAS_PLAYERS]->(b:NbaPlayer) where b.teamName={teamName}  return o", queryParam
        );

        Iterable<Map<String, Object>> maps = result.queryResults();
        for (Iterator<Map<String, Object>> it = maps.iterator(); it.hasNext(); it.next()) {
            Map<String, Object> next = it.next();

            System.out.println(next);
        }

        return null;
    }
}
