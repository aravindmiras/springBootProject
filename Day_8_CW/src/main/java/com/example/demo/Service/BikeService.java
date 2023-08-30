package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Bike;
import com.example.demo.Repository.BikeRepo;

@Service
public class BikeService {
	@Autowired
	BikeRepo br;
	
	public Bike post(Bike data){
		return br.save(data);
	}
	public List<Bike> retYear(int year){
		return br.yearRet(year);
	}
	public List<Bike> retYearBikename(int year, String bikename){
		return br.yearandnameRet(year, bikename);
	}
	public List<Bike> retBikeName(String bikename){
		return br.nameRet(bikename);
	}
}
