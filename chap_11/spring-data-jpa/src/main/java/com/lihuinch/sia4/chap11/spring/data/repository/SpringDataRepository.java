package com.lihuinch.sia4.chap11.spring.data.repository;

import com.lihuinch.sia4.chap11.spring.data.entity.NbaPlayer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author lihuinch
 * @date 2020/2/6 11:35
 */
public interface SpringDataRepository extends JpaRepository<NbaPlayer, Long>, ComplexRepository {

    NbaPlayer findByPlayerName(String playerName);

    int countNbaPlayerBy();

    @Query("SELECT a FROM NbaPlayer a WHERE a.teamName = :team")
    List<NbaPlayer> listOneTeamPlayers(@Param("team") String team);
}
