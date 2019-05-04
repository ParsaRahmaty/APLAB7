package com.flightManagementSystem;

public class Seat {
	private int number = 0;
	private boolean isReserved = false;
	private String type = "economic";
	
	public Seat(int number, boolean isReserved, String type) {
		this.number = number;
		this.isReserved = isReserved;
		this.type = type;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public boolean isReserved() {
		return this.isReserved;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void setReserved(boolean b) {
		this.isReserved = b;
	}
}