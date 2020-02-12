package com.lihuinch.sia4.chap12.cache.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.util.Properties;

/**
 * @author lihuinch
 * @date 2020/2/12 21:50
 */
@Configuration
@EnableTransactionManagement
public class HibernateConfig implements TransactionManagementConfigurer {

    @Bean
    public ComboPooledDataSource dataSource() {

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

        try {
            cpds.setDriverClass("com.mysql.jdbc.Driver");
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }
        cpds.setJdbcUrl("jdbc:mysql://localhost:3306/chap11?useUnicode=true&characterEncoding=UTF-8");
        cpds.setUser("root");
        cpds.setPassword("123456");

        cpds.setMaxPoolSize(20);
        cpds.setMinPoolSize(5);
        cpds.setInitialPoolSize(5);
        cpds.setMaxStatements(20);
        cpds.setMaxIdleTime(100);

        return cpds;
    }

    @Bean
    public LocalSessionFactoryBean sessionFactory(DataSource dataSource) {
        LocalSessionFactoryBean sfb = new LocalSessionFactoryBean();

        sfb.setDataSource(dataSource);
        String[] pacages = {"com.lihuinch.sia4.chap12.cache.entity"};
        sfb.setPackagesToScan(pacages);
        Properties props = new Properties();
        props.setProperty("dialect", "org.hibernate.dialect.mysqldialect");
        sfb.setHibernateProperties(props);

        return sfb;
    }

    /**
     * 实现接口方法，使得返回数据库事务管理器
     * https://www.cnblogs.com/ooo0/p/11029612.html
     */
    @Override
    @Bean(name = "transactionManager")
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        //设置事务管理器管理的数据源
        transactionManager.setDataSource(dataSource());
        return transactionManager;
    }
}
