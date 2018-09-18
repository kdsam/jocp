package ch5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class _009_GoBackwardInTime {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(5, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(dateTime); // 2020–01–20T05:15
        dateTime = dateTime.minusDays(1);
        System.out.println(dateTime); // 2020–01–19T05:15
        dateTime = dateTime.minusHours(10);
        System.out.println(dateTime); // 2020–01–18T19:15
        dateTime = dateTime.minusSeconds(30);
        System.out.println(dateTime); // 2020–01–18T19:14:30

        LocalDate date2 = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time2 = LocalTime.of(5, 15);
        LocalDateTime dateTime2 = LocalDateTime.of(date2, time2)
                .minusDays(1).minusHours(10).minusSeconds(30);
        System.out.println(dateTime2);

    }
}
