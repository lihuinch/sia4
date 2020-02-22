package com.lihuinch.sia4.chap5.springmvc.preliminary.spittr.security.config;

import com.lihuinch.sia4.chap5.springmvc.preliminary.spittr.data.SpitterRepository;
import com.lihuinch.sia4.chap5.springmvc.preliminary.spittr.security.service.SpitterUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

import javax.sql.DataSource;

/**
 * @author lihuinch
 * @date 2019/12/2 21:07
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private SpitterRepository spitterRepository;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/spitters/me").authenticated()
                .antMatchers(HttpMethod.POST, "spittles").authenticated()
                .anyRequest().permitAll()
        ;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        /*  内存形式
        auth.inMemoryAuthentication()
                .withUser("user").password("password").roles("USER")
                .and()
                .withUser("admin").password("password").roles("USER", "ADMIN");
        */

        // DB
/*        auth.jdbcAuthentication()
                .dataSource(dataSource)
                .usersByUsernameQuery(
                        "select username, password, true " +
                                "from Spitter where username=?")
                .authoritiesByUsernameQuery(
                        "select username, 'ROLE_USER' " +
                                "from Spitter where username=?")
                // .passwordEncoder(new StandardPasswordEncoder("53cr3t"))
        ;*/

        // LDAP 未生效
/*        auth.ldapAuthentication()
                .userSearchBase("ou=people")
                .userSearchFilter("(uid={0})")
                .groupSearchBase("ou=groups")
                .groupSearchFilter("member={0}")
                .contextSource()
                .root("dc=habuma,dc=com")
                .ldif("classpath:users.ldif");
        ;*/

        // 自定义userdetail
        auth.userDetailsService(new SpitterUserService(spitterRepository));

    }


}
