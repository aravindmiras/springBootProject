package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
		@GetMapping("day1a")
	public String welcome() {
		return "Welcome Spring Boot!";
	}
}
