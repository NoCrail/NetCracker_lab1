public class MobileContract extends Contract {
    private Integer amountOfMinutes;
    private Integer amountOfSMS;
    private Double amountOfTraffic;

    /**
     * Constructor of MobileContract
     * @param id unique identifier of each Contract
     * @param dateBegin date when Contract starts in String format written using pattern "dd.MM.yyyy"
     * @param dateEnd date when Contract ends in String format written using pattern "dd.MM.yyyy"
     * @param number number of each Contract
     * @param owner Contract's owner
     * @param amountOfMinutes amount of minutes that are available in this MobileContract
     * @param amountOfSMS amount of SMS that are available in this MobileContract
     * @param amountOfTraffic amount of internet traffic that are available in this MobileContract
     */
    public MobileContract(Integer id, String dateBegin, String dateEnd, String number, Client owner, Integer amountOfMinutes, Integer amountOfSMS, Double amountOfTraffic) {
        super(id, dateBegin, dateEnd, number, owner);
        this.amountOfMinutes = amountOfMinutes;
        this.amountOfSMS = amountOfSMS;
        this.amountOfTraffic = amountOfTraffic;
    }
}
