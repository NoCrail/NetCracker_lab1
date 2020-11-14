import models.Client;
import models.Gender;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClientTest {

    @Test
    public void getId() {
        Client client = new Client(0, "", 1286668800000L, Gender.MALE, "");
        assertSame(0, client.getId());
    }

    @Test
    public void getFullName() {
        Client client = new Client(0, "test test", 1286668800000L, Gender.MALE, "");
        assertSame("test test", client.getFullName());
    }

    @Test
    public void getBirthday() {
        Client client = new Client(0, "test test", 1286668800000L, Gender.MALE, "");
        assertEquals(1286668800000L, (long)client.getBirthday());
    }

    @Test
    public void getGender() {
        Client client = new Client(0, "test test", 1286668800000L, Gender.MALE, "");
        assertEquals(Gender.MALE, client.getGender());
    }

    @Test
    public void getPassport() {
        Client client = new Client(0, "test test", 1286668800000L, Gender.MALE, "1234 567890");
        assertEquals("1234 567890", client.getPassport());
    }
}