package com.example.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello there! I am built and deploy using CI/CD pipeline";
	}
}
