package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.BookEntity;
import com.example.demo.repository.Repository;

@org.springframework.stereotype.Service
public class Service {
	@Autowired
	Repository rep;
	public BookEntity postData(BookEntity data) {
		return rep.save(data);
	}
	public BookEntity getById(int id) {
		return rep.findById(id).orElse(null);
	}
	public List<BookEntity> getAll(){
		return rep.findAll();
	}
	public BookEntity saveAndFlush(BookEntity data) {
		return rep.saveAndFlush(data);
	}
	public void deleteById(int id) {
		rep.deleteById(id);
	}
}
