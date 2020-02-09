package com.lihuinch.sia4.chap12.spring.data.neo4j.config;

import org.neo4j.ogm.session.SessionFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.config.Neo4jConfiguration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.server.Neo4jServer;
import org.springframework.data.neo4j.server.RemoteServer;

/**
 * @author lihuinch
 * @date 2020/2/6 20:58
 */

@Configuration
@ComponentScan(basePackages = "com.lihuinch.sia4.chap12.spring.data.neo4j")
@EnableNeo4jRepositories(basePackages = "com.lihuinch.sia4.chap12.spring.data.neo4j.repository")
public class AppConfig extends Neo4jConfiguration {

    @Override
    public Neo4jServer neo4jServer() {
        return new RemoteServer("http://localhost:7474","neo4j","123456");
    }

    @Override
    public SessionFactory getSessionFactory() {
        return new SessionFactory("com.lihuinch.sia4.chap12.spring.data.neo4j.eneity");
    }
}