package com.example.jobfinder.repository;

import com.example.jobfinder.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {
}
