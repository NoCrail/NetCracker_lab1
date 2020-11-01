import org.junit.Test;

import static org.junit.Assert.*;

public class ClientTest {

    @Test
    public void getId() {
        Client client = new Client(0, "", "10.10.2000", Gender.male, "");
        assertSame(0, client.getId());
    }

    @Test
    public void getFullName() {
        Client client = new Client(0, "test test", "10.10.2000", Gender.male, "");
        assertSame("test test", client.getFullName());
    }

    @Test
    public void getBirthday() {
        Client client = new Client(0, "test test", "10.10.2000", Gender.male, "");
        assertEquals(DateConverter.stringToDate("10.10.2000"), client.getBirthday());
    }

    @Test
    public void getGender() {
        Client client = new Client(0, "test test", "10.10.2000", Gender.male, "");
        assertEquals(Gender.male, client.getGender());
    }

    @Test
    public void getPassport() {
        Client client = new Client(0, "test test", "10.10.2000", Gender.male, "1234 567890");
        assertEquals("1234 567890", client.getPassport());
    }
}