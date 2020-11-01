package models;

import utils.DateConverter;

import java.util.Date;

public class Contract {
    private Integer id;
    private Date beginDate;
    private Date endDate;
    private String number;
    private Client owner;

    /**
     * Constructor of models.Contract
     * @param id unique identifier of each models.Contract
     * @param dateBegin date when models.Contract starts in String format written using pattern "dd.MM.yyyy"
     * @param dateEnd date when models.Contract ends in String format written using pattern "dd.MM.yyyy"
     * @param number number of each models.Contract
     * @param owner models.Contract's owner
     */
    public Contract(Integer id, String dateBegin, String dateEnd, String number, Client owner) {
        this.id = id;
        this.beginDate = DateConverter.stringToDate(dateBegin);
        this.endDate = DateConverter.stringToDate(dateEnd);
        this.number = number;
        this.owner = owner;
    }

    /**
     * Method returns models.Contract's unique identifier
     * @return id value
     */
    public Integer getId() {
        return id;
    }

    /**
     * Method returns models.Contract's start date
     * @return begin value
     */
    public Date getBeginDate() {
        return beginDate;
    }

    /**
     * Method returns models.Contract's end date
     * @return end value
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * Method returns models.Contract's number
     * @return number value
     */
    public String getNumber() {
        return number;
    }

    /**
     * Method returns models.Contract's owner
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
                ", number='" + number + '\'' +
                //", owner=" + owner +
                '}';
    }
}
