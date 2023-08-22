package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.StudentEntity;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService sser;
	@PostMapping("post")
	public StudentEntity add(@RequestBody StudentEntity ss) {
		return sser.saveInfo(ss);
	}
	@GetMapping("get")
	public List<StudentEntity> show(){
		return sser.showInfo();
	}
	@GetMapping("get/{id}")
	public Optional <StudentEntity> getbyid(@PathVariable int id) {
		return sser.findbyid(id);
	}
	@PutMapping("put/{id}")
	public StudentEntity change(@PathVariable int id,@RequestBody StudentEntity data) {
		return sser.changeinfo(new StudentEntity(id, data.getName(),data.getStream(),data.getMailid()));
	}
	@DeleteMapping("delete/{id}")
	public String delete(@PathVariable int id) {
		sser.deleteinfo(id);
		return "Deleted Successfully";
	}
	
}
