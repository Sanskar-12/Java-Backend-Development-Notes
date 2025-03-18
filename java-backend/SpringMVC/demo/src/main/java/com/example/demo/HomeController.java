package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Alien;

import jakarta.servlet.http.HttpSession;


@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("add") // here the request is mapped to add then it will call result.jsp
	public String add(@RequestParam("num1") int i,@RequestParam("num2") int j,Model m) {
		
		// Using ModelAndView
		
//		ModelAndView mv = new ModelAndView();
//		
//		mv.setViewName("result");
//		
//		int num3 = i+j;
//		mv.addObject("num3", num3);
//		
//		return mv;
		
		// Using Model
		int num3 = i+j;
		m.addAttribute("num3",num3);
		
		return "result";
		
		
	}
	
	@RequestMapping("addAlien")
	public String addAlien(@RequestParam("aid") int aid,@RequestParam("aname") String aname,Model m) {
		
		Alien a = new Alien();
		a.setAid(aid);
		a.setAname(aname);
		
		m.addAttribute("alien",a);
		
		return "result";
	}
}
