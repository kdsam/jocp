package ch5;

import java.time.LocalDate;
import java.time.Month;

public class _011_AnimalEnrichment {

    public static void main(String[] args){
        LocalDate start = LocalDate.of(2018, Month.OCTOBER, 1);
        LocalDate end = LocalDate.of(2018, Month.DECEMBER, 30);
        performAnimalEnrichment(start, end);
    }

    private static void performAnimalEnrichment(LocalDate start, LocalDate end) {
        LocalDate upTo = start;
        while (upTo.isBefore(end)) { // check if still before end
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plusMonths(1); // add a month
        }
    }
}
