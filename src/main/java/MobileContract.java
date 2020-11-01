public class MobileContract extends Contract {
    private Integer amountOfMinutes;
    private Integer amountOfSMS;
    private Double amountOfTraffic;

    public MobileContract(Integer id, String dateBegin, String dateEnd, String number, Client owner, Integer amountOfMinutes, Integer amountOfSMS, Double amountOfTraffic) {
        super(id, dateBegin, dateEnd, number, owner);
        this.amountOfMinutes = amountOfMinutes;
        this.amountOfSMS = amountOfSMS;
        this.amountOfTraffic = amountOfTraffic;
    }
}
