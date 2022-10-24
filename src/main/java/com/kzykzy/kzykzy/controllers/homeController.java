package com.kzykzy.kzykzy.controllers;


import com.kzykzy.kzykzy.models.User;
import com.kzykzy.kzykzy.repository.userRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
@Service
@AllArgsConstructor
public class homeController {

    @Autowired
    userRepository userRepository;

    @GetMapping("/")
    String test() {
        return "Success";
    }

    @GetMapping("/new")
    void create() {
        User newUser = new User("tung", "tungchipsctn", "tungchipsctn@gmail.com", false);
        userRepository.save(new User("hehe", " shshs", "sjda", false));
        userRepository.insert(newUser);
    }

    @GetMapping("/get")
    public List<User> String() {
        return userRepository.findAll();
    }

}
