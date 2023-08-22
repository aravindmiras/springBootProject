package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	@Value("${name}")
	private String name;
	@GetMapping("getName")
	public String print() {
		return "Hey! "+name;
	}
}
