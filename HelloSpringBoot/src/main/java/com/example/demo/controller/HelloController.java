package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String say(){
		System.out.println("this is "+ this.getClass());
		return "Hello SpringBoot !";
	}
}
