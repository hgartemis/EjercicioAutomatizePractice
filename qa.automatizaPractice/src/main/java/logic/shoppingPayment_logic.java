package logic;

import driver.driver;
import pages.shoppingPayment_page;

public class shoppingPayment_logic {

    driver Driver = null;
    shoppingPayment_page sp = null;

    public shoppingPayment_logic(driver driver) {

        this.Driver = driver;
        sp = new shoppingPayment_page(Driver);

    }

    public  void btnPayBank()
    {
        sp.btnPayBank();
    }

    public void btnPayConfirm()
    {
        sp.btnConfirm();
    }

    public String obtenerReferencia()
    {
        return sp.obtenerReferencia();
    }
}
