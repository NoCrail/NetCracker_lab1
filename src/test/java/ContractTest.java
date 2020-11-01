import models.Client;
import models.Contract;
import models.Gender;
import org.junit.Test;
import utils.DateConverter;

import static org.junit.Assert.*;

public class ContractTest {

    @Test
    public void getId() {
        Contract c = new Contract(0,"10.10.2000", "10.10.2000", "0", new Client(0, "aaa", "10.10.2000", Gender.male, "pass"));
        assertSame(0, c.getId());
    }

    @Test
    public void getBeginDate() {
        Contract c = new Contract(0,"10.10.2000", "10.10.2000", "0", new Client(0, "aaa", "10.10.2000", Gender.male, "pass"));
        assertEquals(DateConverter.stringToDate("10.10.2000"), c.getBeginDate());
    }

    @Test
    public void getEndDate() {
        Contract c = new Contract(0,"10.10.2000", "10.10.2000", "0", new Client(0, "aaa", "10.10.2000", Gender.male, "pass"));
        assertEquals(DateConverter.stringToDate("10.10.2000"), c.getEndDate());
    }

    @Test
    public void getNumber() {
        Contract c = new Contract(0,"10.10.2000", "10.10.2000", "0", new Client(0, "aaa", "10.10.2000", Gender.male, "pass"));
        assertEquals("0", c.getNumber());
    }

    @Test
    public void getOwner() {
        Contract c = new Contract(0,"10.10.2000", "10.10.2000", "0", new Client(0, "aaa", "10.10.2000", Gender.male, "pass"));
        assertSame(0, c.getOwner().getId());
    }
}