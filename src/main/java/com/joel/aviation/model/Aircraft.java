package com.joel.aviation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Aircraft {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String description;
	private int serial_number;
	

	public Aircraft(String name, String description, int serial_number) {
		super();
		this.name = name;
		this.description = description;
		this.serial_number = serial_number;
	}
	public Aircraft(long id, String name, String description, int serial_number) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.serial_number = serial_number;
	}
	public Aircraft() {
	}
	public long getId() {
		return id;
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
	public int getSerial_number() {
		return serial_number;
	}
	public void setSerial_number(int serial_number) {
		this.serial_number = serial_number;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
 