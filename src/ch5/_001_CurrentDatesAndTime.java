package ch5;

import java.time.*;

public class _001_CurrentDatesAndTime {

    public static void main(String[] args) {

        System.out.println("*************** Current dates and time ****************");
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());

    }
}
