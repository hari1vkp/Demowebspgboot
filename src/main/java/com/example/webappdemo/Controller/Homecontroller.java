package com.example.webappdemo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {
    @RequestMapping("/")
    public String home(){
        return ("welcome to home page");
    }
}
