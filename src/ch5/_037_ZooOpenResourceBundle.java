package ch5;


import java.util.Locale;
import java.util.ResourceBundle;

public class _037_ZooOpenResourceBundle {

    public static void main(String[] args) throws InterruptedException {

        Locale us = new Locale("en", "US");
        Locale france = new Locale("fr", "FR");

        printProperties(us);
        System.out.println();
        printProperties(france);
    }

    public static void printProperties(Locale locale) {
        ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);
        System.out.println(rb.getString("hello"));
        System.out.println(rb.getString("open"));
    }

}
