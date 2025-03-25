package com.example.jobfinder.controller;

import com.example.jobfinder.model.Post;
import com.example.jobfinder.repository.PostRepository;
import com.example.jobfinder.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostRepository repo;

    @Autowired
    SearchRepository srepo;

    @PostMapping("/post")
    public Post savePosts(@RequestBody Post p) {
        return repo.save(p);
    }

    @GetMapping("/posts")
    public List<Post> getAllPosts() {
        return repo.findAll();
    }

    @GetMapping("/search/{text}")
    public List<Post> searchPosts(@PathVariable String text) {
        return srepo.findByText(text);
    }
}
