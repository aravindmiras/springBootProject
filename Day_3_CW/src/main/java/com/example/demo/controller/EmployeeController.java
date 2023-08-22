package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.EmployeeEntity;
import com.example.demo.service.EmployeeService;
@RestController
public class EmployeeController {
	@Autowired
	EmployeeService es;
	@PostMapping("addemployee")
	public EmployeeEntity insert(@RequestBody EmployeeEntity data) {
		return es.saveInfo(data);
	}
	@GetMapping("show/{id}")
	public EmployeeEntity getById(@PathVariable int id) {
		return es.getById(id);
	}
	@GetMapping("showdetails")
	public List<EmployeeEntity> output(){
		return es.showDat();
	}
	
}
