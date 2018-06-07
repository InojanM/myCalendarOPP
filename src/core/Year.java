package core;

import java.util.Calendar;

public class Year {

    public static String leapYear(int year) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, 1);
        int days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        if (days == 29) {
            return "This is leap year";
        }

        return "This is not leap year";
    }

    private static void printDays() {
        String[] Days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        for (String day : Days) {
            System.out.print(day + " ");

        }

        System.out.print("\t\t");
        for (String day : Days) {
            System.out.print(day + " ");

        }
        System.out.print("\t\t");
        for (String day : Days) {
            System.out.print(day + " ");

        }
        System.out.println();
    }

    public static void viewCalendar(int year) {

        String[] months = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};

        int monthCount = 3;

        System.out.print("\t\t\t" + months[0] + " " + year);
        System.out.print("\t\t\t\t\t\t\t" + months[1] + " " + year);
        System.out.print("\t\t\t\t\t\t\t" + months[2] + " " + year);
        System.out.println();

        printDays();
        int row = 3;
        int columns = 4;
        int month = 1;
        for (int c = 1; c <= columns; c++) {

            int firstWeekValue = 0;
            int lastWeekValue = 6;

            for (int t = 1; t <= 6; t++) {
                if (c == 1) {
                    month = 1;
                }
                if (c == 2) {
                    month = 4;
                }
                if (c == 3) {
                    month = 7;
                }
                if (c == 4) {
                    month = 10;
                }

                for (int m = 1; m <= 3; m++) {

                    Month.monthCalendar(year, month);
                    String[] days = Month.monthCalendar(year, month);

                    for (int i = firstWeekValue; i <= lastWeekValue; i++) {
                        System.out.printf("%s%2s%s", " ", days[i], " ");
                    }

                    if (m % row == 0) {
                        System.out.println();
                    } else {
                        System.out.print("\t\t");
                    }
                    month++;
                }
                firstWeekValue = firstWeekValue + 7;
                lastWeekValue = lastWeekValue + 7;

            }

            System.out.println();

            if (c != 4) {

                System.out.print("\t\t\t" + months[monthCount] + " " + year);
                System.out.print("\t\t\t\t\t\t\t" + months[monthCount + 1] + " " + year);
                System.out.print("\t\t\t\t\t\t\t" + months[monthCount + 2] + " " + year);
                System.out.println();

                printDays();
                monthCount = monthCount + 3;
            }
        }
    }
}