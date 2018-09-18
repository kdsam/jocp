package ch5;


import java.time.*;
import java.time.temporal.ChronoUnit;

public class _022_InstantFromEpochSeconds {

    public static void main(String[] args) throws InterruptedException {
        int epochSeconds = 600;
        Instant instant = Instant.ofEpochSecond(epochSeconds);
        System.out.println(instant);

        // Do math operations
        Instant nextDay = instant.plus(1, ChronoUnit.DAYS);
        System.out.println(nextDay);
        Instant nextHour = instant.plus(1, ChronoUnit.HOURS);
        System.out.println(nextHour);
        Instant nextWeek = instant.plus(1, ChronoUnit.WEEKS); // exception
    }
}
