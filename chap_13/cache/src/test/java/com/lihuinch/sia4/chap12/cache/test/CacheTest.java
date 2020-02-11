package com.lihuinch.sia4.chap12.cache.test;

import com.lihuinch.sia4.chap12.cache.config.CachingConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * @author lihuinch
 * @date 2020/1/13 19:40
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CachingConfig.class)
public class CacheTest {

    @Autowired
    private CacheManager cacheManager;

    @Test
    public void test() {
        cacheManager.getCache("1");
    }


}
