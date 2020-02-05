package com.lihuinch.sia4.chap11.jpa.entity;

import javax.persistence.*;

/**
 * @author lihuinch
 * @date 2020/1/13 19:21
 */
@Entity(name = "nba_team")
public class NbaTeam {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "team_name", unique = true, length = 128)
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
