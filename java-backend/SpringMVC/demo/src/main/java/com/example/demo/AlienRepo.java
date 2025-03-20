package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer>{

	// With function
	//List<Alien> findByAname(String aname); // The name should start with find By and then the attribute name which is aname

	// With Query
	@Query("from Alien where aname= :name")
	List<Alien> find(@Param("name") String aname);
}
