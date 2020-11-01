public class InternetContract extends Contract {
    private Double trafficSpeed;

    /**
     * Constructor of InternetContract
     * @param id unique identifier of each Contract
     * @param dateBegin date when Contract starts in String format written using pattern "dd.MM.yyyy"
     * @param dateEnd date when Contract ends in String format written using pattern "dd.MM.yyyy"
     * @param number number of each Contract
     * @param owner Contract's owner
     * @param trafficSpeed internet access speed
     */
    public InternetContract(Integer id, String dateBegin, String dateEnd, String number, Client owner, Double trafficSpeed) {
        super(id, dateBegin, dateEnd, number, owner);
        this.trafficSpeed = trafficSpeed;
    }
}
