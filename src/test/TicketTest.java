package test;

import com.flightManagementSystem.*;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TicketTest {
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
    public void ticketMethodsTest() {
        assertEquals(passenger, ticket.getPassenger());
        assertEquals(plane.getSeat(1), ticket.getSeat());
        assertEquals(flight, ticket.getFlight());
        assertEquals(2000, ticket.getAllowedCarrions());
        assertEquals(true, ticket.isFoodReserved());
        assertEquals(FlightSystem.genTicketId() - 1, ticket.getId());
    }
}
