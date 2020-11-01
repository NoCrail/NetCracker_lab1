import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Client {

    private Integer id;
    private String fullName;
    private Date birthday;
    private Gender gender;
    private String passport;

    /**
     * Constructor of Client
     * @param id unique identifier of each Client
     * @param fullName full name of each Client
     * @param birthday date of birth in String format with pattern "dd.MM.yyyy"
     * @param gender enum value which shows Client's gender
     * @param passport passport data in String format
     */
    public Client(Integer id, String fullName, String birthday, Gender gender, String passport) {
        this.id = id;
        this.fullName = fullName;
        this.gender = gender;
        this.passport = passport;
        this.birthday = DateConverter.stringToDate(birthday);
    }

    /**
     * Method returns Client's unique identifier
     * @return id value
     */
    public Integer getId() {
        return id;
    }

    /**
     * Method returns Clent's full name
     * @return fullName value
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Method returns Clent's date of birth
     * @return birthday value
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * Method returns Clent's gender
     * @return gender value
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * Method returns Clent's passport data
     * @return passport value
     */
    public String getPassport() {
        return passport;
    }



}
