package com.example.webappdemo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Logincontroller {
    @RequestMapping("/login")
    public String login(){

        return ("login page");
    }
}
