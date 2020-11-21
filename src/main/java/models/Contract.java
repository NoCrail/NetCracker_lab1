package models;

public class Contract {
    private final Integer id;
    private final Long beginDate;
    private final Long endDate;
    private final Client owner;

    /**
     * Constructor of models.Contract
     *
     * @param id        unique identifier of each models.Contract
     * @param dateBegin date when models.Contract starts in String format written using pattern "dd.MM.yyyy"
     * @param dateEnd   date when models.Contract ends in String format written using pattern "dd.MM.yyyy"
     * @param owner     models.Contract's owner
     */
    public Contract(Integer id, Long dateBegin, Long dateEnd, Client owner) {
        this.id = id;
        this.beginDate = dateBegin;
        this.endDate = dateEnd;
        this.owner = owner;
    }

    /**
     * Method returns models.Contract's unique identifier
     *
     * @return id value
     */
    public Integer getId() {
        return id;
    }

    /**
     * Method returns models.Contract's start date
     *
     * @return begin value
     */
    public Long getBeginDate() {
        return beginDate;
    }

    /**
     * Method returns models.Contract's end date
     *
     * @return end value
     */
    public Long getEndDate() {
        return endDate;
    }


    /**
     * Method returns models.Contract's owner
     *
     * @return owner value
     */
    public Client getOwner() {
        return owner;
    }


    @Override
    public String toString() {
        return "models.Contract{" +
                "id=" + id +
                ", begin=" + beginDate +
                ", end=" + endDate +
                //", owner=" + owner +
                '}';
    }
}
