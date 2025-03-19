package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer>{

}
