import csvUtils.CSVParser;
import csvUtils.CSVReader;
import models.Contract;
import models.InternetContract;
import models.MobileContract;
import models.TVContract;

import java.io.File;

public class ContractParser {


    private static String join(Object[] objects, String separator) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < objects.length; i++) {
            sb.append(objects[i]);
            if (i != objects.length - 1)
                sb.append(separator);
        }

        return sb.toString();
    }

    /**
     * Creates new ContractRepository with data from csv file
     * @param file csv file to parse
     * @return ContractRepository from csv file
     */
    public ContractRepository parse(File file) {
        ContractRepository contractRepository = new ContractRepository();
        CSVReader reader = new CSVReader(file);
        CSVParser parser = new CSVParser();

        for (String line : reader.readLines()) {
            String[] sourceValues = line.split(",");
            for (int i = 0; i < sourceValues.length; i++)
                sourceValues[i] = sourceValues[i].trim();

            String[] extra = sourceValues[sourceValues.length - 1].split(";");
            String temp = sourceValues[5];
            sourceValues[5] = sourceValues[6];
            sourceValues[6] = temp;
            temp = sourceValues[10];
            sourceValues[10] = sourceValues[9];
            sourceValues[9] = temp;
            String contractType = sourceValues[10];
            System.arraycopy(sourceValues, 0, sourceValues, 1, sourceValues.length - 2);
            sourceValues[0] = temp;
            String[] normalValues = new String[sourceValues.length + extra.length - 1];


            System.arraycopy(extra, 0, normalValues, 0, extra.length);
            System.arraycopy(sourceValues, 1, normalValues, extra.length, sourceValues.length - 2);

            String contractSource = join(normalValues, ",");
            contractRepository.addContract(parser.from(contractSource, parseClass(contractType)));
        }

        return contractRepository;
    }

    private Class<? extends Contract> parseClass(String s) {
        switch (s.toLowerCase()) {
            case "internet":
                return InternetContract.class;
            case "mobile":
                return MobileContract.class;
            case "tv":
                return TVContract.class;
        }
        return null;
    }
}