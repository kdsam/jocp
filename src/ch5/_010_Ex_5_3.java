package ch5;

import java.time.LocalDate;
import java.time.Month;

public class _010_Ex_5_3 {

    public static void main(String[] args) {

        //A.
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        date.plusDays(10);
        System.out.println(date);

        //B.
        LocalDate date1 = LocalDate.of(2020, Month.JANUARY, 20);
//        date1 = date1.plusMinutes(1); // DOES NOT COMPILE

    }
}
