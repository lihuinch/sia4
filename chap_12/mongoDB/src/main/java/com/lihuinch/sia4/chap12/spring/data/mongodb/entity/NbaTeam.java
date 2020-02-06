package com.lihuinch.sia4.chap12.spring.data.mongodb.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Collection;


/**
 * @author lihuinch
 * @date 2020/1/13 19:21
 */
@Document
@Data
public class NbaTeam {

    @Id
    private Long id;

    private String teamName;

    private Collection<NbaPlayer> nbaPlayers = new ArrayList<>();

}
