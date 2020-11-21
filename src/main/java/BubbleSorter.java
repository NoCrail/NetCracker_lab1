import models.Contract;

import java.util.Comparator;

/**
 * Realization of bubble sorting algorithm
 */
public class BubbleSorter implements RepositorySorter {

    @Override
    public ContractRepository sorted(ContractRepository contractRepository, int startIndex, int count, Comparator<Contract> comparator) {
        ContractRepository sorted = contractRepository.clone();

        for (int i = startIndex; i < count; i++)
            for (int j = startIndex + 1; j < (count - i); j++)
                if (comparator.compare(sorted.getByPosition(j - 1), sorted.getByPosition(j)) > 0)
                    sorted.swap(j - 1, j);

        return sorted;
    }
}
