package com.javahack.demo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    private static final Logger LOGGER = LoggerFactory.getLogger(MainController.class);
    @GetMapping("/index")
    public String getIndex() {
        return "index";
    }
    @GetMapping("/hello")
    public String getHello() {
        return "hello";
    }
    @GetMapping("/login")
    public String getLogin () {
        return "login";
    }
}
