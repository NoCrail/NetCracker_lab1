package models;

import utils.DateConverter;

public class MobileContract extends Contract {
    private Integer amountOfMinutes;
    private Integer amountOfSMS;
    private Double amountOfTraffic;
    private Contract contract;

    /**
     * Constructor of models.MobileContract
     * @param id unique identifier of each models.Contract
     * @param dateBegin date when models.Contract starts in String format written using pattern "dd.MM.yyyy"
     * @param dateEnd date when models.Contract ends in String format written using pattern "dd.MM.yyyy"
     * @param number number of each models.Contract
     * @param owner models.Contract's owner
     * @param amountOfMinutes amount of minutes that are available in this models.MobileContract
     * @param amountOfSMS amount of SMS that are available in this models.MobileContract
     * @param amountOfTraffic amount of internet traffic that are available in this models.MobileContract
     */
    public MobileContract(Integer id, Long dateBegin, Long dateEnd, String number, Client owner, Integer amountOfMinutes, Integer amountOfSMS, Double amountOfTraffic) {
        super(id, dateBegin, dateEnd, number, owner);
        this.amountOfMinutes = amountOfMinutes;
        this.amountOfSMS = amountOfSMS;
        this.amountOfTraffic = amountOfTraffic;
    }
    public MobileContract(Integer amountOfMinutes, Integer amountOfSMS, Double amountOfTraffic,  Contract contract) {
        super(contract.getId(), contract.getBeginDate(), contract.getEndDate(), contract.getNumber(), contract.getOwner());
        this.amountOfMinutes = amountOfMinutes;
        this.amountOfSMS = amountOfSMS;
        this.amountOfTraffic = amountOfTraffic;
    }

    public Double getAmountOfTraffic() {
        return amountOfTraffic;
    }

    public Integer getAmountOfSMS() {
        return amountOfSMS;
    }

    public Integer getAmountOfMinutes() {
        return amountOfMinutes;
    }
}
