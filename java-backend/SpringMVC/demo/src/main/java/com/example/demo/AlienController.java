package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.model.Alien;

@Controller
public class AlienController {
	
	@Autowired
	AlienRepo repo;
	
	@GetMapping(path="aliens",produces = "application/xml") // It will only give response in xml
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
	
	 // post
	@PostMapping(path="alien",consumes = "application/json") // only take request in json
	@ResponseBody
	public Alien saveAlien(@RequestBody Alien a) { // Takes value in raw json format
		repo.save(a);
		
		return a;
	}
	
}
