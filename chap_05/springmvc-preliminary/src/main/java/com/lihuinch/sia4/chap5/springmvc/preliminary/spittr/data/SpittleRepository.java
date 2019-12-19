package com.lihuinch.sia4.chap5.springmvc.preliminary.spittr.data;

import com.lihuinch.sia4.chap5.springmvc.preliminary.spittr.Spittle;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface SpittleRepository {

    List<Spittle> findRecentSpittles();

    List<Spittle> findSpittles(long max, int count);

    Spittle findOne(long id);

    void save(Spittle spittle);

}
