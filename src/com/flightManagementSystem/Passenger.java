package com.flightManagementSystem;

import java.util.ArrayList;

public class Passenger {
	private String name;
	private String lastName;
	private int id;
	private ArrayList<Ticket> tickets;
	private int carrions;
	
	public Passenger(String name, String lastName, int id, int carrions) {
		this.name = name;
		this.lastName = lastName;
		this.id = id;
		this.carrions = carrions;
		tickets = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public int getId() {
		return id;
	}

	public void buyTicket(Seat s, Flight f, int allowedCarrions, boolean isFoodResereved) {
		if (!s.isReserved()) {
			tickets.add(new Ticket(this, s, f, allowedCarrions, isFoodResereved, FlightSystem.genTicketId()));
			f.getPlane().reserveSeat(s);
		} else
			System.out.println("ERROR: Seat is already reserved.");
	}

	public Ticket[] getTickets() {
		Ticket[] ticketsArray = new Ticket[tickets.size()];
		for (int i = 0; i < tickets.size(); i++)
			ticketsArray[i] = tickets.get(i);
		return ticketsArray;
	}

	public void setCarrions(int carrions) {
		this.carrions = carrions;
	}

	public int getCarrions() {
		return carrions;
	}
}