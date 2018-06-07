package core;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Month {
    static Calendar calendar = Calendar.getInstance();

    public static int findDaysOfMonth(int year,int month){
        calendar.set(Calendar.YEAR,year);
        calendar.set(Calendar.MONTH,month-1);
        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

    }

    private static int findStartValue(String day) {
        int startDay = 0;
        switch (day) {
            case "Mon":
                startDay = 1;
                break;
            case "Tue":
                startDay = 2;
                break;
            case "Wed":
                startDay = 3;
                break;
            case "Thu":
                startDay = 4;
                break;
            case "Fri":
                startDay = 5;
                break;
            case "Sat":
                startDay = 6;
                break;
            case "Sun":
                startDay = 7;
                break;
        }
        return startDay;
    }

    private static String getMonthName(int num) {
        String[] days = {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};
        return days[num - 1];
    }

    public static String[] monthCalendar(int year,int month){
        String[] days = new String[50];

        for (int i = 0; i < days.length; i++) {
            days[i] = " ";
        }

        int date = 1;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE");
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DATE, 1);

        int startValue = findStartValue(simpleDateFormat.format(calendar.getTime())) - 1;
        int endValue = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        for (int w = startValue; w < days.length; w++) {
            if (date <= endValue) {
                days[w] = "" + date;
                date = date + 1;
            }
        }
        days[48] = ""+year;
        days[49] = getMonthName(month);

        return days;
    }




}
