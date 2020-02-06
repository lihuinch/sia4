package com.lihuinch.sia4.chap12.spring.data.mongodb.entity;

import lombok.Data;

/**
 * @author lihuinch
 * @date 2020/1/13 19:21
 */
@Data
public class NbaPlayer {
    private Long id;

    private String teamName;

    private String playerName;

}
