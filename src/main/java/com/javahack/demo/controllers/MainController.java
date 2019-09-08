package com.javahack.demo.controllers;

import com.javahack.demo.models.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
    @Autowired
    private AuthenticationManager authenticationManager;
    private static final Logger LOGGER = LoggerFactory.getLogger(MainController.class);
    @GetMapping({"/index", "/"})
    public String getIndex(Model model, String error, String logout, @AuthenticationPrincipal User user) {
        LOGGER.debug("GET INDEX [START]");
        model.addAttribute("title", "JAVA HACK IS CREATING HERE");
        LOGGER.info(model.toString());
        LOGGER.debug("GET INDEX [FINISH]");
        return "index";
    }
    @GetMapping("/hello")
    public String getHello() {
        LOGGER.debug("GET HELLO [START]");
        LOGGER.debug("GET HELLO [FINISH]");return "hello";
    }

    @GetMapping(value = "/login")
    public String login(Model model, String error, String logout) {
        LOGGER.debug("GET LOGIN [START]");
        if (error != null) {
            model.addAttribute("loginError", "Your username and password is invalid.");
        }
        if (logout != null)
            model.addAttribute("loginError", "You have been logged out successfully.");
        model.addAttribute("user", new User());
        LOGGER.debug("GET LOGIN [FINISH]");
        return "login";
    }

    @PostMapping(value = "/login")
    public String login(Model model,
                        @ModelAttribute("user") User user) {
        LOGGER.debug("POST LOGIN [START]");
        UsernamePasswordAuthenticationToken authReq
                = new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword(), null);

        Authentication auth = authenticationManager.authenticate(authReq);
        SecurityContext sc = SecurityContextHolder.getContext();
        sc.setAuthentication(auth);
        LOGGER.debug("POST LOGIN [FINISH]");
        return "index";
    }

    @GetMapping(value = "/admin")
    public String getAdmin() {
        return "admin";
    }
}
