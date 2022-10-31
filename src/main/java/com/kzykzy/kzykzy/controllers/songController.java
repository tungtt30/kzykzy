package com.kzykzy.kzykzy.controllers;


import com.kzykzy.kzykzy.models.Song;
import com.kzykzy.kzykzy.repository.songRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/song")
@CrossOrigin(origins = "http://localhost:3000")
public class songController {
    @Autowired
    songRepository songRepository;

    @GetMapping("/get")
    public List<Song> getAll() {
        return songRepository.findAll();
    }

    @GetMapping("/get/{id}")
    public Optional<Song> getSongById(@PathVariable String id) {
        return songRepository.findById(id);
    }

    @PostMapping("/post")
    public List<Song> postSong(@RequestBody Song songForm) {
        songRepository.insert(songForm);
        return songRepository.findAll();
    }


    @PutMapping("/update/{id}")
    public Optional<Song> updateSong(@RequestBody Song songForm, @PathVariable String id) {
        Optional<Song> songData = songRepository.findById(id);
        Song songTemp = songData.get();
        songTemp.setName(songForm.getName());
        songTemp.setSinger(songForm.getSinger());
        songTemp.setImage(songForm.getImage());
        songTemp.setUrl(songForm.getUrl());
        songRepository.save(songTemp);
        return songRepository.findById(id);
    }

    @DeleteMapping("/delete")
    public List<Song> deleteSong(@RequestParam String id) {
        songRepository.deleteById(id);
        return songRepository.findAll();
    }
}
