package com.example.demo.dao;

import com.example.demo.model.Meme;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MemeDao extends MongoRepository<Meme, String> {
}
