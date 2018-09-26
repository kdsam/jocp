package ch5.resourcebundles;

import java.util.ListResourceBundle;

public class Tax_en_PH extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][]{{"tax", new PhTaxCode()}};
    }

}
