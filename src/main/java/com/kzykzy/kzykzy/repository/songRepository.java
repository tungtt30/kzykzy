package com.kzykzy.kzykzy.repository;

import com.kzykzy.kzykzy.models.Song;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface songRepository extends MongoRepository<Song,String> {
}
