import models.Client;
import models.Contract;
import models.Gender;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContractRepositoryTest {

    @Test
    public void addContract() {
        ContractRepository cr = new ContractRepository();
        Contract c = new Contract(0,"10.10.2000", "10.10.2000", "0", new Client(0, "aaa", "10.10.2000", Gender.male, "pass"));
        cr.addContract(c);
        assertEquals(c, cr.getContractById(0));
    }

    @Test
    public void getContractById() {
        ContractRepository cr = new ContractRepository();
        Contract c = new Contract(0,"10.10.2000", "10.10.2000", "0", new Client(0, "aaa", "10.10.2000", Gender.male, "pass"));
        cr.addContract(c);
        assertEquals(c.getId(), cr.getContractById(0).getId());
    }

    @Test
    public void removeById() {
        ContractRepository cr = new ContractRepository();
        Contract c = new Contract(0,"10.10.2000", "10.10.2000", "0", new Client(0, "aaa", "10.10.2000", Gender.male, "pass"));
        cr.addContract(c);
        cr.removeById(0);
        assertEquals(null, cr.getContractById(0));
    }

    @Test
    public void getSize() {
        ContractRepository cr = new ContractRepository();
        for (int i=0; i<5; i++){
            cr.addContract(new Contract(i,"10.10.2000", "10.10.2000", "0", new Client(0, "aaa", "10.10.2000", Gender.male, "pass")));
        }
        assertEquals(5, cr.getSize());
    }
}