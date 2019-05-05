package test;

import com.flightManagementSystem.Seat;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
/**
 * Created by 9731021 on 5/5/2019.
 */
public class SeatTest {
    static Seat seat1;

    @Before
    public void allocateMemory() {
        seat1 = new Seat(1, false, "economic");
    }

    @Test
    public void seatGetterTest() {
        assertEquals(1, seat1.getNumber());
        assertEquals(false, seat1.isReserved());
        assertEquals("economic", seat1.getType());
    }

    @Test
    public void seatSetterTest() {
        seat1.setReserved(true);
        assertEquals(true, seat1.isReserved());
    }
}
