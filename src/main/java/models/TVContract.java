package models;

public class TVContract extends Contract {
    private final String channelsPackage;

    /**
     * Constructor of models.TVContract
     *
     * @param id              unique identifier of each models.Contract
     * @param dateBegin       date when models.Contract starts in String format written using pattern "dd.MM.yyyy"
     * @param dateEnd         date when models.Contract ends in String format written using pattern "dd.MM.yyyy"
     * @param owner           models.Contract's owner
     * @param channelsPackage name of channels package that connected in this models.TVContract
     */
    public TVContract(String channelsPackage, Integer id, Long dateBegin, Long dateEnd, Client owner) {
        super(id, dateBegin, dateEnd, owner);
        this.channelsPackage = channelsPackage;
    }

}
