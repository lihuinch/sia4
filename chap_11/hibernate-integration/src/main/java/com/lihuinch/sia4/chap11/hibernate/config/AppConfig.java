package com.lihuinch.sia4.chap11.hibernate.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.util.Properties;

/**
 * @author lihuinch
 * @date 2020/1/10 17:46
 */
@Configuration
public class AppConfig {


    @Bean
    public ComboPooledDataSource dataSource() throws PropertyVetoException {

        /*
            ————————————————
            版权声明：本文为CSDN博主「IT猿看视界」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
            原文链接：https://blog.csdn.net/qq_33356083/article/details/80300311


            DriverClass = com.mysql.jdbc.Driver
            JdbcUrl = jdbc:mysql://IP:3306/auto_smart_home_data?useUnicode=true&characterEncoding=UTF-8
            User = root
            Password = 123
            MaxPoolSize = 20
            MinPoolSize = 2
            InitialPoolSize = 5
            MaxStatements = 30
            MaxIdleTime =100
        */

        ComboPooledDataSource cpds = new ComboPooledDataSource();

        cpds.setDriverClass("com.mysql.jdbc.Driver");
        cpds.setJdbcUrl("jdbc:mysql://localhost:3306/hibernate-integration?useUnicode=true&characterEncoding=UTF-8");
        cpds.setUser("root");
        cpds.setPassword("123456");

        cpds.setMaxPoolSize(6);
        cpds.setMinPoolSize(1);
        cpds.setInitialPoolSize(1);
        cpds.setMaxStatements(20);
        cpds.setMaxIdleTime(100);

        return cpds;
    }

    @Bean
    public LocalSessionFactoryBean sessionFactory(DataSource dataSource) {
        LocalSessionFactoryBean sfb = new LocalSessionFactoryBean();
        sfb.setDataSource(dataSource);
        sfb.setPackagesToScan(new String[]{"com.habuma.spittr.domain"});
        Properties props = new Properties();
        props.setProperty("dialect", "org.hibernate.dialect.H2Dialect");
        sfb.setHibernateProperties(props);
        return sfb;
    }
}
