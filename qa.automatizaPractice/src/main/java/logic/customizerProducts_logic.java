package logic;

import driver.driver;
import pages.customizeProducts_page;

public class customizerProducts_logic {

    driver Driver = null;
    customizeProducts_page cp = null;

    public customizerProducts_logic(driver driver) {

        this.Driver = driver;
        cp = new customizeProducts_page(Driver);

    }

    public void seleccionProd(String cantidad, String size)
    {
        cp.setCantidad(cantidad);
        cp.setSize(size);
        cp.btnAddCart();
        cp.btnContinueShopp();

    }

    public void home()
    {
        cp.btnHome();
    }

}
