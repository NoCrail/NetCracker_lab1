package models;

public class InternetContract extends Contract {
    private Double trafficSpeed;
    private Contract contract;

    /**
     * Constructor of models.InternetContract
     *
     * @param id           unique identifier of each models.Contract
     * @param dateBegin    date when models.Contract starts in String format written using pattern "dd.MM.yyyy"
     * @param dateEnd      date when models.Contract ends in String format written using pattern "dd.MM.yyyy"
     * @param number       number of each models.Contract
     * @param owner        models.Contract's owner
     * @param trafficSpeed internet access speed
     */
    public InternetContract(Integer id, Long dateBegin, Long dateEnd, String number, Client owner, Double trafficSpeed) {
        super(id, dateBegin, dateEnd, number, owner);
        this.trafficSpeed = trafficSpeed;
    }

    public InternetContract(Double trafficSpeed, Contract contract) {
        super(contract.getId(), contract.getBeginDate(), contract.getEndDate(), contract.getNumber(), contract.getOwner());
        this.trafficSpeed = trafficSpeed;
    }


    public Double getTrafficSpeed() {
        return trafficSpeed;
    }
}
