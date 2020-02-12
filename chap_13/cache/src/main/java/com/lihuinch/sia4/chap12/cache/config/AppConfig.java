package com.lihuinch.sia4.chap12.cache.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.support.CompositeCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lihuinch
 * @date 2020/2/11 10:17
 */
@Configuration
@Import(value = {EhcacheConfig.class, RedisConfig.class, HibernateConfig.class})
@ComponentScan(basePackages = "com.lihuinch.sia4.chap12.cache")
@EnableCaching
public class AppConfig {

    @Bean
    public CacheManager cacheManager(@Autowired @Qualifier("ehCacheManagerFactoryBean") net.sf.ehcache.CacheManager cm,
                                     @Autowired @Qualifier("redisTemplate") StringRedisTemplate redisTemplate) {

        // https://www.jianshu.com/p/a98796caf536
        CompositeCacheManager cacheManager = new CompositeCacheManager();
        List<CacheManager> managers = new ArrayList<>();
        managers.add(new EhCacheCacheManager(cm));
        managers.add(new RedisCacheManager(redisTemplate));
        cacheManager.setCacheManagers(managers);

        cacheManager.setFallbackToNoOpCache(true);
        cacheManager.afterPropertiesSet();
        return cacheManager;
    }
}
