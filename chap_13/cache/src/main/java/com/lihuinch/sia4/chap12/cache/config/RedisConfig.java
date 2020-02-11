package com.lihuinch.sia4.chap12.cache.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @author lihuinch
 * @date 2020/2/11 10:16
 */
@Configuration
public class RedisConfig {

    @Bean
    public RedisConnectionFactory redisCF() {
        JedisConnectionFactory cf = new JedisConnectionFactory();
        cf.setHostName("114.115.137.250");
        cf.setPort(6379);
        cf.setPassword("Ipzoe#402yy");
        return cf;
    }

    @Bean(name = "redisTemplate")
    public StringRedisTemplate stringRedisTemplate(RedisConnectionFactory cf) {
        StringRedisTemplate redis = new StringRedisTemplate(cf);
        Jackson2JsonRedisSerializer<String> jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer<>(String.class);

        redis.setConnectionFactory(cf);
        redis.setKeySerializer(new StringRedisSerializer());
        redis.setValueSerializer(jackson2JsonRedisSerializer);

        return redis;
    }
}
