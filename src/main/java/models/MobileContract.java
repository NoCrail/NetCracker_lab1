package models;

public class MobileContract extends Contract {
    private final Integer amountOfMinutes;
    private final Integer amountOfSMS;
    private final Double amountOfTraffic;

    /**
     * Constructor of models.MobileContract
     *
     * @param id              unique identifier of each models.Contract
     * @param dateBegin       date when models.Contract starts in String format written using pattern "dd.MM.yyyy"
     * @param dateEnd         date when models.Contract ends in String format written using pattern "dd.MM.yyyy"
     * @param owner           models.Contract's owner
     * @param amountOfMinutes amount of minutes that are available in this models.MobileContract
     * @param amountOfSMS     amount of SMS that are available in this models.MobileContract
     * @param amountOfTraffic amount of internet traffic that are available in this models.MobileContract
     */
    public MobileContract(Integer amountOfMinutes, Integer amountOfSMS, Double amountOfTraffic, Integer id, Long dateBegin, Long dateEnd, Client owner) {
        super(id, dateBegin, dateEnd, owner);
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
