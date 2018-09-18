package ch5;

import java.time.*;

public class _003_CreatingATime {

    public static void main(String[] args) {

        System.out.println("*************** Creating a time ****************");
        LocalTime time1 = LocalTime.of(6, 15); // hour and minute
        LocalTime time2 = LocalTime.of(6, 15, 30); // + seconds
        LocalTime time3 = LocalTime.of(6, 15, 30, 200); // + nanoseconds
        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);


    }
}
