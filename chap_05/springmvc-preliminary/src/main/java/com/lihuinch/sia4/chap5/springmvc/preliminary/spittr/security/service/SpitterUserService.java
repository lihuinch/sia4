package com.lihuinch.sia4.chap5.springmvc.preliminary.spittr.security.service;

import com.lihuinch.sia4.chap5.springmvc.preliminary.spittr.Spitter;
import com.lihuinch.sia4.chap5.springmvc.preliminary.spittr.data.SpitterRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lihuinch
 * @date 2019/12/7 16:09
 */
public class SpitterUserService implements UserDetailsService {

    private final SpitterRepository spitterRepository;

    public SpitterUserService(SpitterRepository spitterRepository) {
        this.spitterRepository = spitterRepository;
    }

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Spitter spitter = spitterRepository.findByUsername(username);
        if (spitter != null) {
            List<GrantedAuthority> authorities
                    = new ArrayList<GrantedAuthority>();
            authorities.add(new SimpleGrantedAuthority("ROLE_SPITTER"));

            return new User(
                    spitter.getUsername(),
                    spitter.getPassword(),
                    authorities
            );
        }

        throw new UsernameNotFoundException(username + " not found");
    }
}
