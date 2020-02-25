package com.lihuinch.sia4.chap17.jms.activemq.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author lihuinch
 * @date 2020/1/13 19:21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NbaPlayer implements Serializable{
    private Integer id;

    private String teamName;

    private String playerName;

}
