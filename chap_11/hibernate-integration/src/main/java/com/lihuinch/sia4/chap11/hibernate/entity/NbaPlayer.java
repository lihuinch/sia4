package com.lihuinch.sia4.chap11.hibernate.entity;

import javax.persistence.*;

/**
 * @author lihuinch
 * @date 2020/1/13 19:21
 */
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

    public Long getId() {
        return id;
    }

    public NbaPlayer setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTeamName() {
        return teamName;
    }

    public NbaPlayer setTeamName(String teamName) {
        this.teamName = teamName;
        return this;
    }

    public String getPlayerName() {
        return playerName;
    }

    public NbaPlayer setPlayerName(String playerName) {
        this.playerName = playerName;
        return this;
    }
}
