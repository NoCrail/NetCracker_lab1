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

    public Client(Integer id, String fullName, String birthday, Gender gender, String passport) {
        this.id = id;
        this.fullName = fullName;
        this.gender = gender;
        this.passport = passport;
        try {
            this.birthday = new SimpleDateFormat("dd.MM.yyyy").parse(birthday);
        } catch (ParseException e) {
            this.birthday = new Date(0);
            e.printStackTrace();
        }

    }

    public Integer getId() {
        return id;
    }
    public String getFullName() {
        return fullName;
    }
    public Date getBirthday() {
        return birthday;
    }
    public Gender getGender() {
        return gender;
    }
    public String getPassport() {
        return passport;
    }



}
