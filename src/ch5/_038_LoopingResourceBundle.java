package ch5;


import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;

public class _038_LoopingResourceBundle {

    public static void main(String[] args) throws InterruptedException {

        Locale us = new Locale("en", "US");
        ResourceBundle rb = ResourceBundle.getBundle("Zoo", us);
        Set<String> keys = rb.keySet();
        keys.stream().map(k -> k + " " + rb.getString(k))
                .forEach(System.out::println);
    }
    
}
