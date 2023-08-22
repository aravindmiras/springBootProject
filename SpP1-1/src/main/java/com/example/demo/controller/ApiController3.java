package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController3 {
	@Value("${favcolor}")
	private String favcolor;
		@GetMapping("day1c")
	public String getName() {
		return "My favorite color is "+favcolor;
	}
}
