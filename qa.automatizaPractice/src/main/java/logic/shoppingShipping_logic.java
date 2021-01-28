package logic;

import driver.driver;
import pages.shoppingShipping_page;

public class shoppingShipping_logic {

    driver Driver = null;
    shoppingShipping_page ss = null;

    public shoppingShipping_logic(driver driver) {

        this.Driver = driver;
        ss = new shoppingShipping_page(Driver);

    }

    public void chkTerm()
    {
        ss.chkTerm();

    }

    public  void btnNext()
    {
        ss.btnNext();

    }

}
