package com.lihuinch.sia4.chap12.cache.config;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @author lihuinch
 * @date 2020/2/11 10:16
 */
@Configuration
public class RedisConfig extends CachingConfigurerSupport {

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
        Jackson2JsonRedisSerializer<Object> jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer<>(Object.class);

        ObjectMapper om = new ObjectMapper();
        om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
        om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        jackson2JsonRedisSerializer.setObjectMapper(om);

        redis.setConnectionFactory(cf);
        redis.setKeySerializer(new JdkSerializationRedisSerializer());
        redis.setValueSerializer(jackson2JsonRedisSerializer);

        return redis;
    }

}
