package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Bike;
import com.example.demo.Service.BikeService;

@RestController
public class BikeController {
	@Autowired
	BikeService bs;
	
	@PostMapping("post")
	public Bike postit(@RequestBody Bike data) {
		return bs.post(data);
	}
	@GetMapping("year/{year}")
	public List<Bike> getYear(@PathVariable int year){
		return bs.retYear(year);
	}
	@GetMapping("year/{year}/bikename/{bikename}")
	public List<Bike> getyearname(@PathVariable int year, @PathVariable String bikename){
		return bs.retYearBikename(year, bikename);
	}
	@GetMapping("bikename/{bikename}")
	public List<Bike> getname(@PathVariable String bikename){
		return bs.retBikeName(bikename);
	}
}
