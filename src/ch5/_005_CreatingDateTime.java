package ch5;

import java.time.*;

public class _005_CreatingDateTime {

    public static void main(String[] args) {

        System.out.println("*************** Creating a ZonedDateTime ****************");

        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);

        ZoneId zone = ZoneId.of("US/Eastern");
        ZonedDateTime zoned1 = ZonedDateTime.of(2015, 1, 20,
                6, 15, 30, 200, zone);
        LocalTime time4 = LocalTime.of(6, 15);
        ZonedDateTime zoned2 = ZonedDateTime.of(date1, time4, zone);
        LocalDateTime dateTime3 = LocalDateTime.of(date1, time4);
        ZonedDateTime zoned3 = ZonedDateTime.of(dateTime3, zone);
        System.out.println(zoned1);
        System.out.println(zoned2);
        System.out.println(zoned3);
    }
}
