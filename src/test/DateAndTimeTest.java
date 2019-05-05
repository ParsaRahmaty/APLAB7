package test;


import com.flightManagementSystem.DateAndTime;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.After;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by 9731021 on 5/5/2019.
 */
public class DateAndTimeTest {
    static DateAndTime dateAndTime;

    @BeforeClass
    public static void allocateMemory() {
        dateAndTime = new DateAndTime(2019, 6, 25, 21, 15);
    }

    @Test
    public void dateAndTimeMethodsTest() {
        assertEquals(2019, dateAndTime.getYear());
        assertEquals(6, dateAndTime.getMonth());
        assertEquals(25, dateAndTime.getDay());
        assertEquals(21, dateAndTime.getHour());
        assertEquals(15, dateAndTime.getMinute());
    }
}
