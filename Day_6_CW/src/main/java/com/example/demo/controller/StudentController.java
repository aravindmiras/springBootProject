package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Child;
import com.example.demo.service.ChildService;

@RestController
public class StudentController {
	@Autowired
	ChildService cs;
	@PostMapping("post")
	public Child save(@RequestBody Child data) {
		return cs.save(data);
	}
	@GetMapping("get/{field}")
	public List<Child> getfield(@PathVariable String field){
		return cs.findall(field);
	}
	@GetMapping("{pgno}/{pgsize}")
	public List<Child> getbypage(@PathVariable int pgno, @PathVariable int pgsize){
		return cs.getbypage(pgno, pgsize);
	}
	@GetMapping("{pgno}/{pgsize}/{field}")
	public List<Child> sortbyfield(@PathVariable int pgno, @PathVariable int pgsize, @PathVariable String field){
		return cs.getit(pgno, pgsize, field);
	}
}
