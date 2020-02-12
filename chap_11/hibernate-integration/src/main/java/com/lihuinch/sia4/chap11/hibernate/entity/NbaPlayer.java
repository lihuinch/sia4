package com.lihuinch.sia4.chap11.hibernate.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author lihuinch
 * @date 2020/1/13 19:21
 */
@Data
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

    public NbaPlayer() {
    }

    public NbaPlayer(String teamName, String playerName) {
        this.teamName = teamName;
        this.playerName = playerName;
    }
}
