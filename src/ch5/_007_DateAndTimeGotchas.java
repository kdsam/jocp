package ch5;

import java.time.LocalDate;
import java.time.Month;

public class _007_DateAndTimeGotchas {

    public static void main(String[] args) {

//        LocalDate d = new LocalDate(); // DOES NOT COMPILE
        LocalDate.of(2015, Month.JANUARY, 32); // throws DateTimeException

    }
}
