package com.lihuinch.sia4.chap5.springmvc.preliminary.spittr.data;

import com.lihuinch.sia4.chap5.springmvc.preliminary.spittr.Spitter;

public interface SpitterRepository {

    Spitter save(Spitter spitter);

    Spitter findByUsername(String username);

}
