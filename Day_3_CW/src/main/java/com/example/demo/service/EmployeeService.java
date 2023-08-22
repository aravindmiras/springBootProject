package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.EmployeeEntity;
import com.example.demo.repository.EmployeeRepo;
@Service
public class EmployeeService {
	@Autowired
	EmployeeRepo er;
	public EmployeeEntity saveInfo(EmployeeEntity data) {
		return er.save(data);
	}
	public List<EmployeeEntity> showDat(){
		return er.findAll();
	}
	public EmployeeEntity getById(int id) {
		return er.findById(id).orElse(null);
	}
	
}
