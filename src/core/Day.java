package core;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Day {

    static Calendar calendar = Calendar.getInstance();

    public static String findDay(int year, int month, int day) {
        calendar.set(year, month - 1, day);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE");
        String date = simpleDateFormat.format(calendar.getTime());
        return date;

    }

    public static String addDay(int day) {
        calendar.add(Calendar.DATE, day);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        return simpleDateFormat.format(calendar.getTime());
    }


    public static String removeDay(int day) {
        calendar.add(Calendar.DATE, -day);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        return simpleDateFormat.format(calendar.getTime());
    }


    public static String findWeekDaysOrWeekend(int year, int month, int day) {
        calendar.set(year, month - 1, day);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE");
        String date = simpleDateFormat.format(calendar.getTime());
       if (date.equals("Saturday")||date.equals("Sunday")){
           return "The Day Is Weekend";
       }
       else
           return "The Day Is Week Day ";

    }


}
