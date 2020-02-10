package com.lihuinch.sia4.chap11.spring.data.redis.repository;

/**
 * @author lihuinch
 * @date 2020/2/6 11:35
 */
public interface RedisRepository {
    boolean set(final String key, String value);

    String get(final String key);

}
