package ch5;


import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;

public class _040_ConvertingResourceBundleToProperties {

    public static void main(String[] args) throws InterruptedException {

        Locale us = new Locale("en", "US");
        ResourceBundle rb = ResourceBundle.getBundle("Zoo", us);
        Set<String> keys = rb.keySet();
        keys.stream().map(k -> k + " " + rb.getString(k))
                .forEach(System.out::println);

        Properties props = new Properties();
        rb.keySet().stream()
                .forEach(k -> props.put(k, rb.getString(k)));

        System.out.println(props);

        System.out.println(props.getProperty("notReallyAProperty"));
        System.out.println(props.getProperty("notReallyAProperty", "123"));
    }
    
}
