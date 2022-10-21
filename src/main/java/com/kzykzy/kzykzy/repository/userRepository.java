package com.kzykzy.kzykzy.repository;


import com.kzykzy.kzykzy.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface userRepository extends MongoRepository<User,String> {

}
