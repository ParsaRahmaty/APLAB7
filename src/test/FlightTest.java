package test;

import com.flightManagementSystem.DateAndTime;
import com.flightManagementSystem.Flight;
import com.flightManagementSystem.Plane;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
/**
 * Created by 9731021 on 5/5/2019.
 */
public class FlightTest {
    static Plane plane;
    static Flight flight;
    static DateAndTime dateAndTime;

    @Before
    public void allocateMemory() {
        plane = new Plane(1, "Mahan", "jet", 500);
        dateAndTime = new DateAndTime(2019, 6, 25, 21, 15);
        flight = new Flight(1, dateAndTime, "Frankfurt", "Tehran", plane);
    }

    @Test
    public void flightMethodsTest() {
        
    }
}
