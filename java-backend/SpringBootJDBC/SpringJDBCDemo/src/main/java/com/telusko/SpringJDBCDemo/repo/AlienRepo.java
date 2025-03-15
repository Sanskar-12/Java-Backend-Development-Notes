package com.telusko.SpringJDBCDemo.repo;

import com.telusko.SpringJDBCDemo.model.Alien;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AlienRepo {
    public void save(Alien alien) {
        System.out.println("Added Alien object");
    }

    public List<Alien> getAll() {
        return new ArrayList<Alien>();
    }
}
