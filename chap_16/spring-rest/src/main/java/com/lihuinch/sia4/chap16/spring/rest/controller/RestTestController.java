package com.lihuinch.sia4.chap16.spring.rest.controller;

import com.lihuinch.sia4.chap16.spring.rest.entity.NbaPlayer;
import com.lihuinch.sia4.chap16.spring.rest.exception.NotFound404Exception;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

/**
 * @author lihuinch
 * @date 2020/2/22 18:33
 */
@RestController
@RequestMapping("/test/nbaplayer")
public class RestTestController {
    NbaPlayer kobe = new NbaPlayer(24, "Kobe Bryant", "Lakers");

    @RequestMapping("/kobe")
    public NbaPlayer kobe() {
        return kobe;
    }

    @RequestMapping("/{no}")
    public NbaPlayer findByNo(@PathVariable Integer no) {
        NbaPlayer nbaPlayer = new NbaPlayer(no, "name : " + no, "team : " + no);
        return nbaPlayer;
    }

    @RequestMapping("/entity")
    public NbaPlayer findByNo(@RequestBody NbaPlayer nbaPlayer) {
        return nbaPlayer;
    }

    @RequestMapping("/responseEntity")
    public ResponseEntity<NbaPlayer> responseEntity() {
        return new ResponseEntity<NbaPlayer>(kobe, HttpStatus.OK);
    }

    @RequestMapping("/error")
    public NbaPlayer error(@RequestParam(required = false) Boolean error) {
        if (error == null || error) {
            throw new NotFound404Exception("error with NotFound404Exception handler api test");
        }

        return kobe;
    }

    @RequestMapping("/header")
    public ResponseEntity<NbaPlayer> header(UriComponentsBuilder ucb) {
        URI uri = ucb.path("/no/")
                .path(kobe.getNo() + "")
                .build()
                .toUri();

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setLocation(uri);

        return new ResponseEntity<NbaPlayer>(kobe, httpHeaders, HttpStatus.CREATED);
    }


}
