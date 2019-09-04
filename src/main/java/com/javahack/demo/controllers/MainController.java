package com.javahack.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/index")
    public String getIndex() {
        return "index";
    }
    @GetMapping("/hello")
    public String getHello() {
        return "hello";
    }
}
