package ch5;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class _016_CreatingDurationUsingChronoUnit {

    public static void main(String[] args) {
        Duration daily = Duration.of(1, ChronoUnit.DAYS);
        Duration hourly = Duration.of(1, ChronoUnit.HOURS);
        Duration everyMinute = Duration.of(1, ChronoUnit.MINUTES);
        Duration everyTenSeconds = Duration.of(10, ChronoUnit.SECONDS);
        Duration everyMilli = Duration.of(1, ChronoUnit.MILLIS);
        Duration everyNano = Duration.of(1, ChronoUnit.NANOS);

        System.out.println("Daily: " + daily);
        System.out.println("Hourly: " + hourly);
        System.out.println("Every Minute: " + everyMinute);
        System.out.println("Every Ten Seconds: " + everyTenSeconds);
        System.out.println("Every Milli: " + everyMilli);
        System.out.println("Every Nano: " + everyNano);
    }
}
