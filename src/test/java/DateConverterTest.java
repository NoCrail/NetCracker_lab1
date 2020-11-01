import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class DateConverterTest {


    @Test
    public void stringToDate() {
        assertEquals(2000-1900 ,DateConverter.stringToDate("10.10.2000").getYear());
    }

    @Test
    public void getAge() {

        assertSame(0, DateConverter.getAge(new Date()));
    }
}