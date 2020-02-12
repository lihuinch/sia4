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
@Entity
@Table(name = "nba_player")
public class NbaPlayer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "team_name", length = 128)
    private String teamName;

    @Column(name = "player_name")
    private String playerName;
}
