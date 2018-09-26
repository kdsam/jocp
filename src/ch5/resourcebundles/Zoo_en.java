package ch5.resourcebundles;


import java.util.*;

public class Zoo_en extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][]{
                {"hello", "Hello"},
                {"open", "The zoo is open"}};
    }
}
