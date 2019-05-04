package com.flightManagementSystem;

import java.util.ArrayList;
import java.util.HashMap;

public class FlightSystem {
    static int lastTicketId = 0;
    static HashMap<Integer, Flight> flights = new HashMap<>();
    static HashMap<Integer, Passenger> passengers = new HashMap<>();
    static HashMap<Integer, Ticket> tickets = new HashMap<>();
    static HashMap<Integer, Plane> planes = new HashMap<>();

    private FlightSystem() {}

    public static Flight[] getFlights() {
        Flight[] flightsArray = new Flight[flights.size()];
        int i = 0;
        for (Flight flight : flights.values()) {
            flightsArray[i] = flight;
            i++;
        }
        return flightsArray;
    }

    public static void addFlight(Flight f) {
        flights.put(f.getId(), f);
    }

    public static void removeFlight(Flight f) {
        if (flights.get(f.getId()) != null)
            flights.remove(f.getId());
        else
            System.out.println("ERROR: No flight found with this Id: " + f.getId() + ".");
    }

    public static Passenger[] getPassengers() {
        Passenger[] passengersArray = new Passenger[passengers.size()];
        int i = 0;
        for (Passenger passenger : passengers.values()) {
            passengersArray[i] = passenger;
            i++;
        }
        return passengersArray;
    }

    public static void addPassenger(Passenger p) {
        passengers.put(p.getId(), p);
    }

    public static Ticket[] getTickets() {
        Ticket[] ticketsArray = new Ticket[tickets.size()];
        int i = 0;
        for (Ticket ticket : tickets.values()) {
            ticketsArray[i] = ticket;
            i++;
        }
        return ticketsArray;
    }

    public static void addTicket(Ticket t) {
        tickets.put(t.getId(), t);
    }

    public static Plane[] getPlanes() {
        Plane[] planesArray = new Plane[planes.size()];
        int i = 0;
        for (Plane plane : planes.values()) {
            planesArray[i] = plane;
            i++;
        }
        return planesArray;
    }

    public static void addPlane(Plane p) {
        planes.put(p.getId(), p);
    }

    public static void removePlane(Plane p) {
        if (planes.get(p.getId()) != null)
            planes.remove(p.getId());
        else
            System.out.println("ERROR: No flight found with this Id: " + p.getId() + ".");
    }

    public static int genTicketId() {
        lastTicketId++;
        return lastTicketId;
    }
}
