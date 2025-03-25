package com.example.jobfinder.repository;

import com.example.jobfinder.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);

}
