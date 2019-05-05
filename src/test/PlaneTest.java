package test;

import com.flightManagementSystem.Plane;
import com.flightManagementSystem.Seat;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
/**
 * Created by 9731021 on 5/5/2019.
 */
public class PlaneTest {
    static Plane plane;

    @Before
    public void allocateMemory() {
        plane = new Plane(1, "Mahan", "jet", 500);
    }

    @Test
    public void planeGetterTest1() {
        assertEquals(1, plane.getId());
        assertEquals("Mahan", plane.getCo());
        assertEquals("jet", plane.getPlaneType());
    }

    @Test
    public void planeGetterTest2() {
        assertNotNull(plane.getEmptySeats());
        assertNotNull(plane.getSeats());
        assertNotNull(plane.getSeat(500));
        assertNull(plane.getSeat(0));
        assertNull(plane.getSeat(501));
        assertEquals(1, plane.getSeats()[0].getNumber());
        assertEquals(1, plane.getSeat(1).getNumber());
        plane.getSeat(1).setReserved(true);
        assertEquals(2, plane.getEmptySeats()[0].getNumber());
    }

    @Test
    public void planeReserveSeatTest() {
        plane.reserveSeat(plane.getSeat(1));
        assertEquals(true, plane.getSeat(1).isReserved());
    }

    @Test
    public void planeFlushReservesTest() {
        plane.reserveSeat(plane.getSeat(1));
        plane.flushReserves();
        assertEquals(false, plane.getSeat(1).isReserved());
    }
}
