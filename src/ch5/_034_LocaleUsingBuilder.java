package ch5;


import java.util.Locale;

public class _034_LocaleUsingBuilder {

    public static void main(String[] args) throws InterruptedException {

        Locale l1 = new Locale.Builder()
                .setLanguage("en")
                .setRegion("US")
                .build();
        Locale l2 = new Locale.Builder()
                .setRegion("US")
                .setLanguage("en")
                .build();

        System.out.println(l1);
        System.out.println(l2);
        
    }
}
