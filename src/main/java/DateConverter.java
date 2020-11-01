import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateConverter {

    public static Date stringToDate(String date){
        try {
            return new SimpleDateFormat("dd.MM.yyyy").parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return new Date(0);
        }
    }


    public static Integer getAge(Date birthday){
        long current = System.currentTimeMillis();
        long ageInMillis = current - birthday.getTime();
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(ageInMillis);
        return c.get(Calendar.YEAR) - 1970;
    }

}
