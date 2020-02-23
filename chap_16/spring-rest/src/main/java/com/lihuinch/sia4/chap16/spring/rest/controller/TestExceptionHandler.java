package com.lihuinch.sia4.chap16.spring.rest.controller;

import com.lihuinch.sia4.chap16.spring.rest.exception.NotFound404Exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lihuinch
 * @date 2020/2/23 12:43
 */
@ControllerAdvice
@RestController
public class TestExceptionHandler {

    @ExceptionHandler(NotFound404Exception.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Error spittleNotFound(NotFound404Exception e) {
        String mag = e.getMsg();
        return new Error(404, mag);
    }

}
