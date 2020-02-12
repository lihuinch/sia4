package com.lihuinch.sia4.chap12.cache.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author lihuinch
 * @date 2020/1/13 19:21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "nba_team")
public class NbaTeam {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "team_name", unique = true, length = 128)
    private String teamName;

}
