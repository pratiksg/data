package com.capgemini.spring_test_example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorld {
	
	@GetMapping
	public String Hello() {
		return "HelloWorld";
		
		
	}

	public void build() {
		// TODO Auto-generated method stub
		
	}
	
	
}
