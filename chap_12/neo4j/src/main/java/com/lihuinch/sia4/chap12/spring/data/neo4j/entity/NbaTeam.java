package com.lihuinch.sia4.chap12.spring.data.neo4j.entity;

import lombok.Data;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;


/**
 * @author lihuinch
 * @date 2020/1/13 19:21
 */
@NodeEntity
@Data
public class NbaTeam {

    @GraphId
    private Long id;

    private String teamName;

    @Relationship(type="HAS_PLAYERS")
    private Set<NbaPlayer> nbaPlayers = new HashSet<>();

}
