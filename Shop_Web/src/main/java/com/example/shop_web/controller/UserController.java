package com.example.shop_web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping(value = "/home")
public class UserController {
    @GetMapping
    public String show(){
        return "layoutHome";
    }
}
