package com.telusko.SpringJDBCDemo.repo;

import com.telusko.SpringJDBCDemo.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class AlienRepo {

    // This is template of JDBC by which we can perform database operations
    private JdbcTemplate template;

    public JdbcTemplate getTemplate() {
        return template;
    }

    @Autowired
    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    // Save the data into H2 Database
    public void save(Alien alien) {
        String sql = "insert into alien (id, name, tech) values (?, ?, ?)";

        int row = template.update(sql, alien.getId(),alien.getName(),alien.getTech()); // Saving into database
        System.out.println(row + " rows affected");
    }

    // Get the list of all aliens from the H2 Database
    public List<Alien> getAll() {

        String sql = "select * from alien";

        // RowMapper iterates the result set for every row, It is a Functional Interface
        RowMapper<Alien> mapper = new RowMapper<Alien>() {
            @Override
            public Alien mapRow(ResultSet rs, int rowNum) throws SQLException {
                Alien a = new Alien();
                a.setId(rs.getInt(1));
                a.setName(rs.getString(2));
                a.setTech(rs.getString(3));

                return a;
            }
        };

        List<Alien> aliens = template.query(sql, mapper);

        return aliens;
    }
}
