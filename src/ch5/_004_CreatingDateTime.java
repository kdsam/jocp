package ch5;

import java.time.*;

public class _004_CreatingDateTime {

    public static void main(String[] args) {

        System.out.println("*************** Creating a DateTime ****************");
        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        LocalTime time1 = LocalTime.of(6, 15); // hour and minute
        LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
        LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
        System.out.println(dateTime1);
        System.out.println(dateTime2);

    }
}
