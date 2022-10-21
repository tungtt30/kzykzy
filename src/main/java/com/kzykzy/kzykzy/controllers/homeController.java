package com.kzykzy.kzykzy.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class homeController {

    @GetMapping("/")
    String test(){
        return "Success";
    }
}
