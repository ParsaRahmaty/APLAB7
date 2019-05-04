package com.flightManagementSystem;

public class Plane {
	private int id;
	private String co;
	private String planeType;
	private Seat[] seats;
	
	public Plane(int id, String co, String planeType, int numberOfSeats) {
		this.id = id;
		this.co = co;
		this.planeType = planeType;
		seats = new Seat[numberOfSeats];
	}
	
	public String getCo() {
		return co;
	}
	
	public Seat[] getSeats() {
		return seats;
	}
	
	public String getPlaneType() {
		return planeType;
	}
	
	public Seat[] getEmptySeats() {
		Seat[] emptySeats = new Seat[emptySeatsNumber()];
		int index = 0;
		for(Seat seat : seats) {
			if (!seat.isReserved()) {
				emptySeats[index] = seat;
				index++;
			}
		}
		return emptySeats;
	}
	
	public int getId() {
		return id;
	}
	
	public void reserveSeat(Seat s) {
		if (!s.isReserved())
			s.setReserved(true);
		else
			System.out.println("ERROR: Seat is already reserved.");
	}
	
	public void flushReserves() {
		for (Seat seat : seats)
			seat.setReserved(false);
	}
	
	private int emptySeatsNumber() {
		int answer = 0;
		for(Seat seat : seats) {
			if (!seat.isReserved())
				answer++;
		}
		return answer;
	}
}