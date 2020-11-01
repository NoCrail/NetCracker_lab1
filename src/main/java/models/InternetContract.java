package models;

public class InternetContract extends Contract {
    private Double trafficSpeed;

    /**
     * Constructor of models.InternetContract
     * @param id unique identifier of each models.Contract
     * @param dateBegin date when models.Contract starts in String format written using pattern "dd.MM.yyyy"
     * @param dateEnd date when models.Contract ends in String format written using pattern "dd.MM.yyyy"
     * @param number number of each models.Contract
     * @param owner models.Contract's owner
     * @param trafficSpeed internet access speed
     */
    public InternetContract(Integer id, String dateBegin, String dateEnd, String number, Client owner, Double trafficSpeed) {
        super(id, dateBegin, dateEnd, number, owner);
        this.trafficSpeed = trafficSpeed;
    }
}
