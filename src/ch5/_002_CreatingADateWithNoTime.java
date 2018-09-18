package ch5;

import java.time.*;

public class _002_CreatingADateWithNoTime {

    public static void main(String[] args) {

        System.out.println("*************** Creating a date with no time ****************");
        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        LocalDate date2 = LocalDate.of(2015, 1, 20);
        System.out.println(date1);
        System.out.println(date2);


    }
}
