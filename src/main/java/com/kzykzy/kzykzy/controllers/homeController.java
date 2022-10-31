package com.kzykzy.kzykzy.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@Controller
@RequestMapping("/")
public class homeController {
    @GetMapping("")
    public String homepage() {
        return "index.html";
    }
}
