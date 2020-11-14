import models.Contract;

import java.util.Comparator;


/**
 * Realization of fast sorting algorithm
 */
public class FastSorter implements RepositorySorter {
    @Override
    public ContractRepository sorted(ContractRepository contractRepository, int startIndex, int count, Comparator<Contract> comparator) {
        ContractRepository sorted = contractRepository.clone();

        quickSort(sorted, startIndex, count - 1, comparator);

        return sorted;
    }

    private void quickSort(ContractRepository contractRepository, int startIndex, int endIndex, Comparator<Contract> comparator) {
        if (startIndex < endIndex) {
            int partitionIndex = partition(contractRepository, startIndex, endIndex, comparator);

            quickSort(contractRepository, startIndex, partitionIndex - 1, comparator);
            quickSort(contractRepository, partitionIndex + 1, endIndex, comparator);
        }
    }


    private int partition(ContractRepository contractRepository, int startIndex, int endIndex, Comparator<Contract> comparator) {
        int i = startIndex - 1;

        for (int j = startIndex; j < endIndex; j++)
            if (comparator.compare(contractRepository.getByPosition(j), contractRepository.getByPosition(endIndex)) < 0)
                contractRepository.swap(++i, j);

        contractRepository.swap(++i, endIndex);

        return i;
    }


}
