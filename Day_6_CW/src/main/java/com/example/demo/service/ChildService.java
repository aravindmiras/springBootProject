package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Child;
import com.example.demo.repository.ChildRepo;

@Service
public class ChildService {
	@Autowired
	ChildRepo cr;
	
	public Child save(Child data) {
		return cr.save(data);
	}
	public List<Child> findall(String s){
		return cr.findAll(Sort.by(Sort.DEFAULT_DIRECTION,s));
	}
	public List<Child> getbypage(int pgno, int pgsize){
		Page<Child>p=cr.findAll(PageRequest.of(pgno, pgsize));
		return p.getContent();
	}
	public List<Child> getit(int pgno, int pgsize, String s){
		PageRequest pageable= PageRequest.of(pgno, pgsize, Sort.by(Sort.Direction.ASC,s));
		Page<Child>childrenPage=cr.findAll(pageable);
		return childrenPage.getContent();
	}
}
