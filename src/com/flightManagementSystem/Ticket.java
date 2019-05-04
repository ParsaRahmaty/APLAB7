package com.flightManagementSystem;

public class Ticket {
	private Passenger passenger;
	private Seat seat;
	private Flight flight;
	private int allowedCarrions;
	private boolean isFoodReserved;
	
	public Ticket(Passenger passenger, Seat seat, Flight flight, int allowedCarrions, boolean isFoodReserved) {
		this.passenger = passenger;
		this.seat = seat;
		this.flight = flight;
		this.allowedCarrions = allowedCarrions;
		this.isFoodReserved = isFoodReserved;
	}
	
	public Seat getSeat() {
		return this.seat;
	}
	
	public Flight getFlight() {
		return this.flight;
	}
	
	public Passenger getPassenger() {
		return this.passenger;
	}
	
	public int getAllowedCarrions() {
		return this.allowedCarrions;
	}
	
	public boolean isFoodReserved() {
		return this.isFoodReserved;
	}

	@Override
	public String toString() {
		String output = "";
		output += "Passenger Name: " + passenger.getName() + " " + passenger.getLastName() + "\n";
		output += "Passenger Id: " + passenger.getId() + "\n\n";
		output += "Flight Id: " + flight.getId() + "\n";
		output += "From " + flight.getCity() + " to " + flight.getDest() +  "\n";
		output += "Date and Time: " + flight.getDateAndTime() + "\n\n";
		output += "Plane Id: " + flight.getPlane().getId() + "\n";
		output += "Plane Company: " + flight.getPlane().getCo() + "\n";
		output += "Plane Type: " + flight.getPlane().getPlaneType() + "\n\n";
		output += "Seat Number: " + seat.getNumber() + "\n";
		output += "Seat Type: " + seat.getType();
		return output;
	}
}