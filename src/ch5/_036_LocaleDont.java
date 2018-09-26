package ch5;


import java.util.Locale;

public class _036_LocaleDont {

    public static void main(String[] args) throws InterruptedException {

        Locale l2 = new Locale.Builder() // bad but legal
                .setRegion("us")
                .setLanguage("EN")
                .build();

        System.out.println(l2);
    }
}
