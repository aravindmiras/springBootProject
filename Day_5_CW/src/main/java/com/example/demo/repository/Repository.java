package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.BookEntity;

public interface Repository extends JpaRepository<BookEntity, Integer>{

}
