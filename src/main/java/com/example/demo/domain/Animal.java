package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;



import javax.persistence.Id;




@Entity
@Table(name = "Animal")
public class Animal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "color")
	private String color;
	
	public Animal() {
		
	}
	public Animal(String name, String color) {
		
		this.name = name;
		this.color = color;
	}

	public long getId() {
		return Id;
	}
	
	public void setId(long Id) {
		this.Id = Id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
