package ch5;


import java.util.Locale;

public class _031_CurrentLocale {

    public static void main(String[] args) throws InterruptedException {
        Locale locale = Locale.getDefault();
        System.out.println(locale);
    }
}
