package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Class with funcs that works with date
 */
public class DateConverter {

    /**
     * Method converts Date from String format with pattern "dd.MM.yyyy" to Date
     *
     * @param date Date in String format with pattern "dd.MM.yyyy"
     * @return converted Date value
     */
    public static Date stringToDate(String date) {
        try {
            return new SimpleDateFormat("dd.MM.yyyy").parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return new Date(0);
        }
    }

    public static String dateToString(Date date) {
        return new SimpleDateFormat("dd.MM.yyyy").format(date.getTime());
    }

    /**
     * Method counts age of person
     *
     * @param birthday Person's birthday
     * @return Person's age
     */
    public static Integer getAge(Date birthday) {
        long current = System.currentTimeMillis();
        long ageInMillis = current - birthday.getTime();
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(ageInMillis);
        return c.get(Calendar.YEAR) - 1970;
    }

}
