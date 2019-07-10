package com.lihuinch.sia4.chap5.springmvc.preliminary.spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author lihuinch
 * @date 2019/7/10 21:45
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home() {
        System.out.println("HomeController - home");
        return "home";
    }
}
