package com.lihuinch.sia4.chap12.cache.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.cache.support.CompositeCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * @author lihuinch
 * @date 2020/2/11 10:17
 */
@Configuration
@Import(value = {RedisConfig.class})
@ComponentScan(basePackages = "com.lihuinch.sia4.chap12.cache")
@EnableCaching
public class CachingConfig {

    /**
     * 混合缓存管理
     *
     * @param redisTemplate redis template
     * @return cacheManager
     */
    @Bean
    public CacheManager compositeCacheManager(@Autowired @Qualifier("redisTemplate") StringRedisTemplate redisTemplate) {
        CompositeCacheManager cacheManager =
                new CompositeCacheManager(
                        getRedisCacheManager(redisTemplate),
                        ehCacheCacheManager(ehCacheManagerFactoryBean()
                        )
                );
        cacheManager.setFallbackToNoOpCache(true);
        cacheManager.afterPropertiesSet();
        return cacheManager;
    }


    /**
     * @return
     */
    @Bean
    public EhCacheManagerFactoryBean ehCacheManagerFactoryBean() {
        EhCacheManagerFactoryBean cacheManagerFactoryBean = new EhCacheManagerFactoryBean();
        cacheManagerFactoryBean.setConfigLocation(new ClassPathResource("ehcache.xml"));
        cacheManagerFactoryBean.setShared(true);
        // 如果 Factory 自己手动实列化，需要 执行afterPropertiesSet()方法，因为这是方法是 初始化 类使用的
        // 如果Factory 由Spring 容器 创建 ，容器初始化完成后 spring 会去执行这个方法。
        // cacheManagerFactoryBean.afterPropertiesSet();//初始化 读取配置文件,

        return cacheManagerFactoryBean;
    }

    /**
     * 获取redisCacheManager
     *
     * @param redisTemplate redisTemplate
     * @return redisCacheManager
     */
    private RedisCacheManager getRedisCacheManager(@Autowired @Qualifier("redisTemplate") StringRedisTemplate redisTemplate) {
        return new RedisCacheManager(redisTemplate);
    }

    /**
     * EhCacheManager
     *
     * @return EhCacheManager
     */
    private EhCacheCacheManager ehCacheCacheManager(EhCacheManagerFactoryBean factoryBean) {
        EhCacheCacheManager ehCacheCacheManager = new EhCacheCacheManager(factoryBean.getObject());
        //由于自己实列化EhCacheManager 需要执行 手动初始化 方法。
        ehCacheCacheManager.initializeCaches();//初始化
        return ehCacheCacheManager;
    }
}
