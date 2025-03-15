package com.telusko.SpringJDBCDemo.repo;

import com.telusko.SpringJDBCDemo.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AlienRepo {

    private JdbcTemplate template;

    public JdbcTemplate getTemplate() {
        return template;
    }

    @Autowired
    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public void save(Alien alien) {
        String sql = "insert into alien (id, name, tech) values (?, ?, ?)";

        int row = template.update(sql, alien.getId(),alien.getName(),alien.getTech()); // Saving into database
        System.out.println(row + " rows affected");
    }

    public List<Alien> getAll() {
        return new ArrayList<Alien>();
    }
}
