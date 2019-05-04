package com.flightManagementSystem;

public class Flight {
	private int id;
	private DateAndTime dateAndTime;
	private String destination;
	private String city;
	private Plane plane;
	
	public Flight(int id, DateAndTime dateAndTime, String destination, String city, Plane plane) {
		this.id = id;
		this.dateAndTime = dateAndTime;
		this.destination = destination;
		this.city = city;
		this.plane = plane;
	}
	
	public int getId() {
		return this.id;
	}
	
	public DateAndTime getDateAndTime() {
		return this.dateAndTime;
	}
	
	public String getDest() {
		return this.destination;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public Plane getPlane() {
		return this.plane;
	}
}