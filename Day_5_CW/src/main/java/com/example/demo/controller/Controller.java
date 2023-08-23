package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.BookEntity;
import com.example.demo.service.Service;

@RestController
public class Controller {
	@Autowired
	Service ser;
	@PostMapping("post")
	public BookEntity save(@RequestBody BookEntity data) {
		return ser.postData(data);
	}
	@GetMapping("get/{id}")
	public BookEntity getById(@PathVariable int id) {
		return ser.getById(id);
	}
	@GetMapping("get")
	public List<BookEntity> getem(){
		return ser.getAll();
	}
	@PutMapping("put/{id}")
	public BookEntity putmap(@PathVariable int id, @RequestBody BookEntity data) {
		return ser.saveAndFlush(new BookEntity(id,data.getBookName(),data.getPrice(),data.getQuantity(),data.getAuthorName()));
	}
	@DeleteMapping("delete/{id}")
	public String deletebyid(@PathVariable int id) {
		ser.deleteById(id);
		return "Deleted successfully!";
	}
}
