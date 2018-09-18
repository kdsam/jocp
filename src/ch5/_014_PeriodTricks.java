package ch5;

import java.time.Period;

public class _014_PeriodTricks {

    public static void main(String[] args) {
        Period wrong = Period.ofYears(1).ofWeeks(1);
        System.out.println(wrong);

        // Above is similar to ff
        Period wrong2 = Period.ofYears(1);
        wrong2 = Period.ofWeeks(1);
        System.out.println(wrong2);
    }
}
