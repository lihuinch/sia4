package com.lihuinch.sia4.chap11.spring.data.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.support.PersistenceAnnotationBeanPostProcessor;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.inject.Inject;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * spring 配置事务管理器: https://www.cnblogs.com/ooo0/p/11029612.html
 *
 * @author lihuinch
 * @date 2020/1/10 17:46
 */
//使用事务驱动管理器
@EnableTransactionManagement
@Configuration
@ComponentScan(basePackages = "com.lihuinch.sia4.chap11.spring.data")
@EnableJpaRepositories(basePackages = "com.lihuinch.sia4.chap11.spring.data.repository")
public class AppConfig {

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

        cpds.setAutoCommitOnClose(true);

        return cpds;
    }

    @Configuration
    @EnableTransactionManagement
    public static class TransactionConfig {

        private final EntityManagerFactory emf;
        private final DataSource dataSource;

        @Inject
        public TransactionConfig(EntityManagerFactory emf, DataSource dataSource) {
            this.emf = emf;
            this.dataSource = dataSource;
        }

        @Bean
        public PlatformTransactionManager transactionManager() {
            JpaTransactionManager transactionManager = new JpaTransactionManager();
            transactionManager.setEntityManagerFactory(emf);
            transactionManager.setDataSource(dataSource);
            return transactionManager;
        }
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource, JpaVendorAdapter jpaVendorAdapter) {
        /*
         ————————————————
         版权声明：本文为CSDN博主「一朝风月S」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
         原文链接：https://blog.csdn.net/weixin_37624828/article/details/85234237

         */

        LocalContainerEntityManagerFactoryBean emfb = new LocalContainerEntityManagerFactoryBean();
        emfb.setDataSource(dataSource);
        emfb.setJpaVendorAdapter(jpaVendorAdapter);
        emfb.setPackagesToScan("com.lihuinch.sia4.chap11.spring.data.entity");
        return emfb;
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        /*
         ————————————————
         版权声明：本文为CSDN博主「一朝风月S」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
         原文链接：https://blog.csdn.net/weixin_37624828/article/details/85234237

         */
        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        adapter.setDatabase(Database.MYSQL);
        adapter.setShowSql(true);
        adapter.setGenerateDdl(false);
        adapter.setDatabasePlatform("org.hibernate.dialect.MySQLDialect");
        return adapter;
    }

    @Bean
    public PersistenceAnnotationBeanPostProcessor paPostProcessor() {
        return new PersistenceAnnotationBeanPostProcessor();
    }

    @Bean
    public BeanPostProcessor persistenceTranslation() {
        return new PersistenceExceptionTranslationPostProcessor();
    }
}
