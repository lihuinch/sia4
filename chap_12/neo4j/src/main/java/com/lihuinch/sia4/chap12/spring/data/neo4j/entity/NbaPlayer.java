package com.lihuinch.sia4.chap12.spring.data.neo4j.entity;

import lombok.Data;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * @author lihuinch
 * @date 2020/1/13 19:21
 */
@NodeEntity
@Data
public class NbaPlayer {

    @GraphId
    private Long id;

    private String teamName;

    private String playerName;

}
