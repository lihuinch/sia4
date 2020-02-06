package com.lihuinch.sia4.chap11.spring.data.repository;

import com.lihuinch.sia4.chap11.spring.data.entity.NbaPlayer;

import java.util.List;

/**
 * @author lihuinch
 * @date 2020/2/6 11:44
 */
public interface ComplexRepository {

    List<NbaPlayer> listOneTeamPlayersComplex(String team);
}
