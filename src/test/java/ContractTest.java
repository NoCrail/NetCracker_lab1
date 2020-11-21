import models.Client;
import models.Contract;
import models.Gender;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class ContractTest {

    @Test
    public void getId() {
        Contract c = new Contract(0, 1286668800000L, 1286668800000L, new Client(0, "aaa", 1286668800000L, Gender.MALE, "pass"));
        assertSame(0, c.getId());
    }

    @Test
    public void getBeginDate() {
        Contract c = new Contract(0, 1286668800000L, 1286668800000L, new Client(0, "aaa", 1286668800000L, Gender.MALE, "pass"));
        assertEquals(1286668800000L, (long) c.getBeginDate());
    }

    @Test
    public void getEndDate() {
        Contract c = new Contract(0, 1286668800000L, 1286668800000L, new Client(0, "aaa", 1286668800000L, Gender.MALE, "pass"));
        assertEquals(1286668800000L, (long) c.getEndDate());
    }


    @Test
    public void getOwner() {
        Contract c = new Contract(0, 1286668800000L, 1286668800000L, new Client(0, "aaa", 1286668800000L, Gender.MALE, "pass"));
        assertSame(0, c.getOwner().getId());
    }
}