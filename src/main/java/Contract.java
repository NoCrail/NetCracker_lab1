import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Contract {
    private Integer id;
    private Date begin;
    private Date end;
    private String number;
    private Client owner;


    public Contract(Integer id, String dateBegin, String dateEnd, String number, Client owner) {
        this.id = id;
        this.begin = DateConverter.stringToDate(dateBegin);
        this.end = DateConverter.stringToDate(dateEnd);
        this.number = number;
        this.owner = owner;
    }

    public Integer getId() {
        return id;
    }

    public Date getBegin() {
        return begin;
    }

    public Date getEnd() {
        return end;
    }

    public String getNumber() {
        return number;
    }

    public Client getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "id=" + id +
                ", begin=" + begin +
                ", end=" + end +
                ", number='" + number + '\'' +
                //", owner=" + owner +
                '}';
    }
}
