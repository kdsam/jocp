package ch5;


import java.time.*;

public class _025_DayLightSavingsTimeDoesNotExist {

    public static void main(String[] args) throws InterruptedException {
        LocalDate date = LocalDate.of(2016, Month.MARCH, 13);
        LocalTime time = LocalTime.of(2, 30);
        ZoneId zone = ZoneId.of("US/Eastern");
        ZonedDateTime dateTime = ZonedDateTime.of(date, time, zone);
        System.out.println(dateTime);
    }
}
