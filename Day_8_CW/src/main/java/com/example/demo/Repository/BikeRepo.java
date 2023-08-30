package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Bike;
@Repository
public interface BikeRepo extends JpaRepository<Bike, Integer>{
	@Query(value="select * from biketable where year=:yr", nativeQuery = true)
	public List<Bike> yearRet(@Param("yr") int yr);
	@Query(value="select * from biketable where year=:yr and bikename=:bknam", nativeQuery = true)
	public List<Bike> yearandnameRet(@Param("yr") int yr, @Param("bknam") String name);
	@Query(value="select * from biketable where bikename=:bknam", nativeQuery = true)
	public List<Bike> nameRet(@Param("bknam") String name);
	
}
