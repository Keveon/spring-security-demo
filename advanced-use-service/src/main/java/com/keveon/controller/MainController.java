package com.keveon.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @PreAuthorize("authenticated and hasPermission('hello', 'user')")
    public String hello(Model model) {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        model.addAttribute("message", username);
        return "hello";
    }

    @RequestMapping(value = "/login")
    public String login() {
        return "login";
    }
}
