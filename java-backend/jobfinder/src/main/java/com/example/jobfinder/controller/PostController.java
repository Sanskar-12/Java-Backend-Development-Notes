package com.example.jobfinder.controller;

import com.example.jobfinder.PostRepository;
import com.example.jobfinder.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostRepository repo;

    @PostMapping("/post")
    public Post savePosts(@RequestBody Post p) {
        return repo.save(p);
    }

    @GetMapping("/posts")
    public List<Post> getAllPosts() {
        return repo.findAll();
    }
}
