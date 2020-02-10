package com.lihuinch.sia4.chap11.spring.data.redis.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

/**
 * @author lihuinch
 * @date 2020/2/6 12:33
 */
@Repository
public class RedisRepositoryImpl implements RedisRepository {

    @Autowired
    private StringRedisTemplate redis;

    /**
     * 写入缓存
     *
     * @param key
     * @param value
     * @return
     */
    @SuppressWarnings("unchecked")
    public boolean set(final String key, String value) {
        boolean result = false;
        try {
            ValueOperations<String, String> operations = redis.opsForValue();
            operations.set(key, value);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 读取缓存
     *
     * @param key
     * @return
     */
    @SuppressWarnings("unchecked")
    public String get(final String key) {
        String result = null;
        ValueOperations<String, String> operations = redis.opsForValue();
        result = operations.get(key);
        return result;
    }
}
