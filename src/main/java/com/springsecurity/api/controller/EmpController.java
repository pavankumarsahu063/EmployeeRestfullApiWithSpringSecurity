package com.springsecurity.api.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {
	
	
	@GetMapping("home")
	public String home() {
		return "home";
		
	}
	
	
	

}
