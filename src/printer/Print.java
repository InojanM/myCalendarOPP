package printer;

public class Print {


    public static void printMonth(String[] month) {

        System.out.println("\t\t\t" + month[49] + " " + month[48]);

        System.out.println(" MOM TUE WED THU FRI SAT SUN");

        for (int i = 0; i < month.length-3; i++) {

            if (i % 7 == 0) {
                System.out.println();
                System.out.printf("%s%2s%s", " ", month[i], " ");
            } else {
                System.out.printf("%s%2s%s", " ", month[i], " ");

            }
        }
    }


}
