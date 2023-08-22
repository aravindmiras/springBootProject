package com.example.demo.model;

//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="studenttable")
public class StudentEntity {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private String stream;
	private String mailid;
	
	//Generated using superclass
	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Generated using fields
	
	//Generated using getter setters
	public int getId() {
		return id;
	}
	public StudentEntity(int id, String name, String stream, String mailid) {
		super();
		this.id = id;
		this.name = name;
		this.stream = stream;
		this.mailid = mailid;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}

	public String getMailid() {
		return mailid;
	}

	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	
	
}
