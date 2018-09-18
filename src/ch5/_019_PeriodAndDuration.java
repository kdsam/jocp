package ch5;

import java.time.*;

public class _019_PeriodAndDuration {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2015, 5, 25);
        Period period = Period.ofDays(1);
        Duration days = Duration.ofDays(1);

        System.out.println(date.plus(period)); // 2015–05–26
        System.out.println(date.plus(days)); // Unsupported unit: Seconds
    }
}
