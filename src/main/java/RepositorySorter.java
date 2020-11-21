import models.Contract;

import java.util.Comparator;

/**
 * interface for repository sorters
 */
public interface RepositorySorter {
    public ContractRepository sorted(ContractRepository contractRepository, int startIndex, int count, Comparator<Contract> comparator);
}
