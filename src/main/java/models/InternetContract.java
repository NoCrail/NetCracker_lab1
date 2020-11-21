package models;

public class InternetContract extends Contract {
    private final Double trafficSpeed;

    /**
     * Constructor of models.InternetContract
     *
     * @param id           unique identifier of each models.Contract
     * @param dateBegin    date when models.Contract starts in String format written using pattern "dd.MM.yyyy"
     * @param dateEnd      date when models.Contract ends in String format written using pattern "dd.MM.yyyy"
     * @param owner        models.Contract's owner
     * @param trafficSpeed internet access speed
     */
    public InternetContract(Double trafficSpeed, Integer id, Long dateBegin, Long dateEnd, Client owner) {
        super(id, dateBegin, dateEnd, owner);
        this.trafficSpeed = trafficSpeed;
    }


    public Double getTrafficSpeed() {
        return trafficSpeed;
    }
}
