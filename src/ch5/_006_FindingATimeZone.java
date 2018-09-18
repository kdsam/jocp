package ch5;

import java.time.*;

public class _006_FindingATimeZone {

    public static void main(String[] args) {

        System.out.println("*************** Finding a Time Zone ****************");

        ZoneId myTimeZone = ZoneId.systemDefault();
        System.out.println(myTimeZone);

        ZoneId.getAvailableZoneIds().stream()
                .filter(z -> z.contains("US") || z.contains("America"))
                .sorted().forEach(System.out::println);


    }
}
