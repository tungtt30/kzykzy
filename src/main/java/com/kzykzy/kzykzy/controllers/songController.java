package com.kzykzy.kzykzy.controllers;


import com.kzykzy.kzykzy.models.Song;
import com.kzykzy.kzykzy.repository.songRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/song")
public class songController {
    @Autowired
    songRepository songRepository;

    @GetMapping("/get")
    public List<Song> get(){
        return songRepository.findAll();
    }

    @GetMapping("/mi")
    void mi(){
        songRepository.save(new Song("sd","sad","asd","s"));
    }
}
