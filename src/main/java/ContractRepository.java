import models.Contract;

import java.util.Comparator;
import java.util.function.Predicate;

/**
 * Special repository that can keep Contracts
 */
public class ContractRepository {
    private Contract[] array;
    private int last;
    private RepositorySorter sorter;

    /**
     * Constructor that creates repository
     */
    public ContractRepository() {
        this.array = new Contract[0];
        this.last = -1;
        this.sorter = new QuickSorter();
    }

    /**
     * Constructor that creates repository
     *
     * @param cr existed ContractRepository
     */
    public ContractRepository(ContractRepository cr) {
        this.array = cr.array;
        this.last = cr.last;
        this.sorter = cr.sorter;
    }

    /**
     * Sets repo sorter
     *
     * @param sorter sorter to set
     */
    public void setSorter(RepositorySorter sorter) {
        this.sorter = sorter;
    }

    /**
     * Method that adds new models.Contract to repository
     *
     * @param contract models.Contract that must be added
     */
    public void addContract(Contract contract) {
        if (last + 1 >= array.length) extendArray();
        array[++last] = contract;
    }

    /**
     * Method that extends repository's size
     */
    private void extendArray() {
        //System.out.println("Extended");
        Contract[] newArray = new Contract[array.length + 50];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    /**
     * Method that searches models.Contract in repository
     *
     * @param id Searching models.Contract's id
     * @return models.Contract if found or null
     */
    public Contract getContractById(int id) {
        int pos = getPositionById(id);
        if (pos == -1) return null;
        else return array[pos];
    }

    /**
     * Method for getting models.Contract's position in repository by id
     *
     * @param id Searching models.Contract's id
     * @return position in repository or -1 if not found
     */
    private int getPositionById(int id) {
        for (int i = 0; i <= last; i++) {
            if (array[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public Contract getByPosition(int position) {
        checkBounds(position);
        return array[position];
    }

    public void checkBounds(int position) {
        if ((position < 0) || (position > last))
            throw new IndexOutOfBoundsException("Position = " + position + ", Size=" + last + 1);
    }

    /**
     * Method removes models.Contract from repository by id
     *
     * @param id Removing models.Contract's id
     */
    public void removeById(int id) {
        int pos = getPositionById(id);
        if (pos != -1) {
            if (pos + 1 < last) {
                if (pos > 0) System.arraycopy(array, pos + 1, array, pos, last - pos);
                else System.arraycopy(array, pos + 1, array, pos, last - 1);
                last--;
            } else {
                System.arraycopy(array, pos + 1, array, pos, last + 1 - pos);
                last--;
            }

        }

    }

    /**
     * Method gets current repository's size
     *
     * @return Repository's size
     */
    public int getSize() {
        return last + 1;
    }


    /**
     * Method creates new repository, that contains filtered Contracts
     *
     * @param predicate condition for filter
     * @return new ContractRepository with filtered items
     */
    public ContractRepository filter(Predicate<Contract> predicate) {
        ContractRepository filtered = new ContractRepository();

        for (int i = 0; i < last + 1; i++) {
            Contract element = array[i];
            if (predicate.test(element))
                filtered.addContract(element);
        }
        return filtered;
    }

    /**
     * Method creates new ContractRepository which equals current
     *
     * @return new ContractRepository
     */
    @Override
    public ContractRepository clone() {
        try {
            super.clone();
        } catch (CloneNotSupportedException ignored) {

        }
        return new ContractRepository(this);
    }


    /**
     * Method swaps Contracts in ContractRepository
     *
     * @param c1 position of first Contract
     * @param c2 position of second Contract
     */
    public void swap(int c1, int c2) {
        checkBounds(c1);
        checkBounds(c2);
        Contract temp = array[c1];
        array[c1] = array[c2];
        array[c2] = temp;
    }

    /**
     * Method sorts ContractRepository with specified params
     *
     * @param comparator condition to compare
     * @return sorted ContractRepository
     */
    public ContractRepository sort(Comparator<Contract> comparator) {
        return sorter.sorted(this, 0, last + 1, comparator);
    }
}
