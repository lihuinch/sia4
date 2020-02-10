package com.lihuinch.sia4.chap11.spring.data.redis.entity;

/**
 * @author lihuinch
 * @date 2020/1/13 19:21
 */
public class NbaPlayer {

    private Long id;

    private String teamName;

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

    @Override
    public String toString() {
        return "NbaPlayer{" +
                "id=" + id +
                ", teamName='" + teamName + '\'' +
                ", playerName='" + playerName + '\'' +
                '}';
    }
}
