package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpSession;


@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "index.jsp";
	}
	
	@RequestMapping("add") // here the request is mapped to add then it will call result.jsp
	public ModelAndView add(@RequestParam("num1") int i,@RequestParam("num2") int j) {
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("result.jsp");
		
		int num3 = i+j;
		mv.addObject("num3", num3);
		
		return mv;
	}
}
