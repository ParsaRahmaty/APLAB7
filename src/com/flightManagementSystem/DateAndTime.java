package com.flightManagementSystem;

public class DateAndTime {
	private int year;
	private int month;
	private int day;
	private int hour;
	private int minute;
	
	public DateAndTime(int year, int month, int day, int hour, int minute) {
		this.year = year;
		this.month = month;
		this.day = day;
		this.hour = hour;
		this.minute = minute;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public int getMonth() {
		return this.month;
	}
	
	public int getDay() {
		return this.day;
	}
	
	public int getHour() {
		return this.hour;
	}
	
	public int getMinute() {
		return this.minute;
	}
	
	@Override
	public String toString() {
		String output = "";
		output += year + "/" + month + "/" + day + " at " + hour + ":" + minute;
		return output;
	}
}