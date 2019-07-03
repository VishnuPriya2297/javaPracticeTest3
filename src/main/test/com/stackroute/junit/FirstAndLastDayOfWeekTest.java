package main.test.com.stackroute.junit;
import main.java.com.stackroute.junit.FirstAndLastDayOfWeek;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstAndLastDayOfWeekTest {
    FirstAndLastDayOfWeek object;

    @Before
    public void setUp() throws Exception {
    object=new FirstAndLastDayOfWeek();
    }

    @After
    public void tearDown() throws Exception {
        object=null;
    }
    @Test
    public void startDate() {
        //Arrange
        boolean expectedValue = true;
        //Act
        boolean actualValue = object.startDate();
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }

    @Test
    public void endDate() {
        //Arrange
        boolean expectedValue1 = true;
        //Act
        boolean actualValue1 = object.endDate();
        assertEquals(expectedValue1, actualValue1);
        assertNotNull(actualValue1);
    }
}