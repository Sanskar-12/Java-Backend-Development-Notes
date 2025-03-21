package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.model.Alien;

@Controller
public class AlienController {
	
	@Autowired
	AlienRepo repo;
	
	@GetMapping("aliens")
	@ResponseBody // Converts into json
	public List<Alien> getAllALiens() {
		List<Alien> aliens = repo.findAll();
		
		return aliens;
	}
	
	// Params 
	@GetMapping("alien/{aid}") // aid is dynamic
	@ResponseBody
	public Alien getAlien(@PathVariable("aid") int aid) {
		Alien alien = repo.findById(aid).orElse(new Alien(0,""));
		
		return alien;
	}
	
}
