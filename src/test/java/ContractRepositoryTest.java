import models.*;
import org.junit.Test;

import java.util.Comparator;

import static org.junit.Assert.*;

public class ContractRepositoryTest {

    public void fillRepo(ContractRepository cr){
        cr.addContract(new models.Contract(8,1286668800000L, 1286668800000L, "0", new models.Client(1, "abc", 1286668800000L, models.Gender.MALE, "pass")));
        cr.addContract(new models.Contract(10,1286668800000L, 1286668800000L, "0", new models.Client(2, "qwerty", 1286668800000L, models.Gender.MALE, "pass")));
        cr.addContract(new models.Contract(4,1286668800000L, 1286668800000L, "0", new models.Client(3, "test", 1286668800000L, models.Gender.MALE, "pass")));
        cr.addContract(new models.Contract(7,1286668800000L, 1286668800000L, "0", new models.Client(4, "cat", 1286668800000L, models.Gender.MALE, "pass")));

    }

    @Test
    public void addContract() {
        ContractRepository cr = new ContractRepository();
        Contract c = new Contract(0,1286668800000L, 1286668800000L, "0", new Client(0, "aaa", 1286668800000L, Gender.MALE, "pass"));
        cr.addContract(c);
        assertEquals(c, cr.getContractById(0));
    }

    @Test
    public void getContractById() {
        ContractRepository cr = new ContractRepository();
        Contract c = new Contract(0,1286668800000L, 1286668800000L, "0", new Client(0, "aaa", 1286668800000L, Gender.MALE, "pass"));
        cr.addContract(c);
        assertEquals(c.getId(), cr.getContractById(0).getId());
    }

    @Test
    public void removeById() {
        ContractRepository cr = new ContractRepository();
        Contract c = new Contract(0,1286668800000L, 1286668800000L, "0", new Client(0, "aaa", 1286668800000L, Gender.MALE, "pass"));
        cr.addContract(c);
        cr.removeById(0);
        assertNull(cr.getContractById(0));
    }

    @Test
    public void removeById2() {
        ContractRepository cr = new ContractRepository();
        for (int i = 0; i<50; i++){
            cr.addContract(new models.Contract(i,1286668800000L, 1286668800000L, "0", new models.Client(0, "aaa", 1286668800000L, models.Gender.MALE, "pass")));
        }
        for (int i = 0; i<50; i++){
            cr.removeById(i);
        }
        assertNull(cr.getContractById(0));
    }

    @Test
    public void getSize() {
        ContractRepository cr = new ContractRepository();
        for (int i=0; i<5; i++){
            cr.addContract(new Contract(i,1286668800000L, 1286668800000L, "0", new Client(0, "aaa", 1286668800000L, Gender.MALE, "pass")));
        }
        assertEquals(5, cr.getSize());
    }

    @Test
    public void filterName(){
        ContractRepository cr  = new ContractRepository();
        fillRepo(cr);
        ContractRepository filtered = cr.filter(it -> it.getOwner().getFullName().contains("a"));
        assertEquals(2, filtered.getSize());
        assertEquals(8, (int)filtered.getByPosition(0).getId());
        assertEquals(7, (int)filtered.getByPosition(1).getId());
    }

    @Test
    public void bubbleSort(){
        ContractRepository cr  = new ContractRepository();
        fillRepo(cr);
        ContractRepository filtered = cr.sort(Comparator.comparingInt(Contract::getId));
        assertEquals(4, (int)filtered.getByPosition(0).getId());
        assertEquals(7, (int)filtered.getByPosition(1).getId());
        assertEquals(8, (int)filtered.getByPosition(2).getId());
        assertEquals(10, (int)filtered.getByPosition(3).getId());
    }

    @Test
    public void quickSort(){
        ContractRepository cr  = new ContractRepository();
        fillRepo(cr);
        cr.setSorter(new QuickSorter());
        ContractRepository filtered = cr.sort(Comparator.comparingInt(Contract::getId));
        assertEquals(4, (int)filtered.getByPosition(0).getId());
        assertEquals(7, (int)filtered.getByPosition(1).getId());
        assertEquals(8, (int)filtered.getByPosition(2).getId());
        assertEquals(10, (int)filtered.getByPosition(3).getId());
    }



}