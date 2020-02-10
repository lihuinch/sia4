package com.lihuinch.sia4.chap11.spring.data.redis.entity;

/**
 * @author lihuinch
 * @date 2020/1/13 19:21
 */
public class NbaTeam {

    private Long id;

    private String teamName;

    public Long getId() {
        return id;
    }

    public NbaTeam setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTeamName() {
        return teamName;
    }

    public NbaTeam setTeamName(String teamName) {
        this.teamName = teamName;
        return this;
    }

    @Override
    public String toString() {
        return "NbaTeam{" +
                "id=" + id +
                ", teamName='" + teamName + '\'' +
                '}';
    }
}
