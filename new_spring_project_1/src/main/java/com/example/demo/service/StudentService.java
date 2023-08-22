package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.StudentEntity;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentService {
	@Autowired
	StudentRepo sr;
	
	public StudentEntity saveInfo(StudentEntity ss) {
		return sr.save(ss);
	}
	public List<StudentEntity> showInfo(){
		return sr.findAll();
	}
	public StudentEntity changeinfo(StudentEntity ss) {
		return sr.saveAndFlush(ss);
	}
	public void deleteinfo(int ss) {
		sr.deleteById(ss);
	}
	public List<StudentEntity> savegrp(List<StudentEntity> ss){
		return sr.saveAll(ss);
	}
	public Optional <StudentEntity> findbyid(int id) {
		return sr.findById(id);
	}
}
