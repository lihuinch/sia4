package com.lihuinch.sia4.chap16.spring.rest.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lihuinch
 * @date 2020/2/23 12:44
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NotFound404Exception extends RuntimeException {

    private static final long serialVersionUID = 1L;

    String msg;
}