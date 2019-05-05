package test;

import com.flightManagementSystem.*;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PassengerTest {
    static Passenger passenger;
    static Plane plane;
    static Flight flight;
    static DateAndTime dateAndTime;

    @Before
    public void allocateMemory() {
        passenger = new Passenger("Parsa", "Rahmaty", 1, 1000);
        plane = new Plane(1, "Mahan", "jet", 500);
        dateAndTime = new DateAndTime(2019, 6, 25, 21, 15);
        flight = new Flight(1, dateAndTime, "Frankfurt", "Tehran", plane);
    }

    @Test
    public void passengerGetterTest() {
        assertEquals("Parsa", passenger.getName());
        assertEquals("Rahmaty", passenger.getLastName());
        assertEquals(1, passenger.getId());
        assertEquals(1000, passenger.getCarrions());
        assertEquals(0, passenger.getTickets().length);
    }

    @Test
    public void passengerSetCarrionsTest() {
        passenger.setCarrions(2000);
        assertEquals(2000, passenger.getCarrions());
    }

    @Test
    public void setPassengerBuyTicketTest() {
        passenger.buyTicket(plane.getSeat(1), flight, 2000, true);
        assertEquals(1, passenger.getTickets().length);
    }
}
