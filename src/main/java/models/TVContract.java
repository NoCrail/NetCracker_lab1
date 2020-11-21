package models;

public class TVContract extends Contract {
    private String channelsPackage;
    private Contract contract;

    /**
     * Constructor of models.TVContract
     *
     * @param id              unique identifier of each models.Contract
     * @param dateBegin       date when models.Contract starts in String format written using pattern "dd.MM.yyyy"
     * @param dateEnd         date when models.Contract ends in String format written using pattern "dd.MM.yyyy"
     * @param number          number of each models.Contract
     * @param owner           models.Contract's owner
     * @param channelsPackage name of channels package that connected in this models.TVContract
     */
    public TVContract(Integer id, Long dateBegin, Long dateEnd, String number, Client owner, String channelsPackage) {
        super(id, dateBegin, dateEnd, number, owner);
        this.channelsPackage = channelsPackage;
    }

    public TVContract(String channelsPackage, Contract contract) {
        super(contract.getId(), contract.getBeginDate(), contract.getEndDate(), contract.getNumber(), contract.getOwner());
        this.channelsPackage = channelsPackage;
    }
}
