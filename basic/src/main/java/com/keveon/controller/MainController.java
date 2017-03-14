package com.keveon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Keveon on 2017/2/19.
 * Main controller
 */
@Controller
public class MainController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping(value = "/login")
    public String login() {
        return "login";
    }
}
