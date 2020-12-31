import csvUtils.CSVParser;
import csvUtils.CSVReader;
import di.Provides;
import models.Contract;
import validators.Condition;
import validators.Validator;
import validators.ValidatorBuilder;

import javax.inject.Singleton;
import java.io.File;
import java.net.URISyntaxException;

public class AppModule {
    @Provides
    @Singleton
    public File file(){
        try {
            return CSVReader.getFileFromResource("tableContents.csv");
        } catch (URISyntaxException e){
            return null;
        }
    }
    @Provides
    @Singleton
    public Validator<Contract> validator(){
        ValidatorBuilder<Contract> builder = new ValidatorBuilder<>();

        builder.add(new Condition<>(0, Contract::getId, ((expected, actual) -> actual%2==expected)));
        builder.add(new Condition<>("lera",
                contract -> contract.getOwner().getFullName()
        ));


        return builder.build();
    }

    @Provides
    @Singleton
    public CSVReader reader(File file){
        return new CSVReader(file);
    }

    @Provides
    @Singleton
    public CSVParser parser(){
        return new CSVParser();
    }

    @Provides
    @Singleton
    public RepositorySorter sorter(){
        return new QuickSorter();
    }
}
