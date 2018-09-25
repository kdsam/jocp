package ch5;


import java.util.Locale;

public class _035_ChangingDefaultLocale {

    public static void main(String[] args) throws InterruptedException {

        System.out.println(Locale.getDefault()); // en_US
        Locale locale = new Locale("fr");
        Locale.setDefault(locale); // change the default
        System.out.println(Locale.getDefault()); // fr
    }
}
