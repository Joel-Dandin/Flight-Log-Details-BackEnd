package com.joel.aviation.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class FlightLog {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
//	@ManyToOne
//	@JoinColumn(name="aircraft_id")
	private long aircraftid;
	private String date__;
//	private Date date__;
	private String departure;
	private String destination;
	
	public FlightLog() {
	}
	public FlightLog(long id, long aircraftid, String date__, String departure, String destination) {
		this.id = id;
		this.aircraftid = aircraftid;
		this.date__ = date__;
		this.departure = departure;
		this.destination = destination;
	}
	public FlightLog( long aircraftid, String date__, String departure, String destination) {
		this.aircraftid = aircraftid;
		this.date__ = date__;
		this.departure = departure;
		this.destination = destination;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getIntdate() {
		return date__;
	}
	public void setIntdate(String date__) {
		this.date__ = date__;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public long getAircraft_id() {
		return aircraftid;
	}
	public void setAircraft_id(long aircraft_id) {
		this.aircraftid = aircraft_id;
	}
	@Override
	public String toString() {
		return "FlightLog [id=" + id + ", aircraft_id=" + aircraftid + ", logdate=" + date__ + ", departure="
				+ departure + ", destination=" + destination + "]";
	}
	
	
}
