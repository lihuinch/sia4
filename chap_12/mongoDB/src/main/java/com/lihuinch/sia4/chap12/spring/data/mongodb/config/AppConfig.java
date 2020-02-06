package com.lihuinch.sia4.chap12.spring.data.mongodb.config;

import com.mongodb.MongoClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.net.UnknownHostException;

/**
 * @author lihuinch
 * @date 2020/2/6 20:58
 */

@Configuration
@ComponentScan(basePackages = "com.lihuinch.sia4.chap12.spring.data.mongodb")
@EnableMongoRepositories(basePackages = "com.lihuinch.sia4.chap12.spring.data.mongodb.repository")
public class AppConfig extends AbstractMongoConfiguration {

    @Override
    protected String getDatabaseName() {
        return "nba";
    }

    @Override
    public MongoClient mongo() throws Exception {
        return new MongoClient();
    }
}