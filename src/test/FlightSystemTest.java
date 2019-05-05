package test;

import com.flightManagementSystem.*;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FlightSystemTest {
    static Ticket ticket;
    static Passenger passenger;
    static Flight flight;
    static DateAndTime dateAndTime;
    static Plane plane;

    @Before
    public void allocateMemory() {
        dateAndTime = new DateAndTime(2019, 6, 25, 21, 15);
        plane = new Plane(10, "Mahan", "jet", 500);
        flight = new Flight(1, dateAndTime, "Frankfurt", "Tehran", plane);
        ticket = new Ticket(passenger = new Passenger("Parsa", "Rahmaty", 9731021, 1000), plane.getSeat(1), flight, 2000, true, FlightSystem.genTicketId());
    }

    @Test
    public void flightSystemGetterTest() {
        assertEquals(0, FlightSystem.getFlights().length);
        assertEquals(0, FlightSystem.getPassengers().length);
        assertEquals(0, FlightSystem.getPlanes().length);
        assertEquals(0, FlightSystem.getTickets().length);
    }

    @Test
    public void flightSystemGenTicketIdTest() {
        assertEquals(FlightSystem.genTicketId(), FlightSystem.genTicketId() - 1);
        assertEquals(true, FlightSystem.genTicketId() > 0);
    }

    @Test
    public void flightSystemAdderTest() {
        FlightSystem.addFlight(flight);
        FlightSystem.addPassenger(passenger);
        FlightSystem.addPlane(plane);
        FlightSystem.addTicket(ticket);
        assertEquals(flight, FlightSystem.getFlights()[0]);
        assertEquals(passenger, FlightSystem.getPassengers()[0]);
        assertEquals(plane, FlightSystem.getPlanes()[0]);
        assertEquals(ticket, FlightSystem.getTickets()[0]);
    }

    @Test
    public void flightSystemRemoverTest() {
        FlightSystem.addFlight(flight);
        FlightSystem.addPlane(plane);
        assertEquals(flight, FlightSystem.getFlights()[0]);
        assertEquals(plane, FlightSystem.getPlanes()[0]);
        FlightSystem.removeFlight(flight);
        FlightSystem.removePlane(plane);
        assertEquals(0, FlightSystem.getFlights().length);
        assertEquals(0, FlightSystem.getPlanes().length);
        FlightSystem.removeFlight(flight);
        FlightSystem.removePlane(plane);
        assertEquals(0, FlightSystem.getFlights().length);
        assertEquals(0, FlightSystem.getPlanes().length);
    }
}
