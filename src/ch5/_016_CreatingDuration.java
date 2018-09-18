package ch5;

import java.time.*;

public class _016_CreatingDuration {

    public static void main(String[] args) {
        Duration daily = Duration.ofDays(1); // PT24H
        Duration hourly = Duration.ofHours(1); // PT1H
        Duration everyMinute = Duration.ofMinutes(1); // PT1M
        Duration everyTenSeconds = Duration.ofSeconds(10); // PT10S
        Duration everyMilli = Duration.ofMillis(1); // PT0.001S
        Duration everyNano = Duration.ofNanos(1); // PT0.000000001S

        System.out.println("Daily: " + daily);
        System.out.println("Hourly: " + hourly);
        System.out.println("Every Minute: " + everyMinute);
        System.out.println("Every Ten Seconds: " + everyTenSeconds);
        System.out.println("Every Milli: " + everyMilli);
        System.out.println("Every Nano: " + everyNano);
    }
}
