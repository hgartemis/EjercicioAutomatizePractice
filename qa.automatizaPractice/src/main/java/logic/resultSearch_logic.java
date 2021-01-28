package logic;

import driver.driver;
import pages.resultSearch_page;

public class resultSearch_logic {

    driver Driver = null;
    resultSearch_page rs = null;

    public resultSearch_logic(driver driver) {

        this.Driver = driver;
        rs = new resultSearch_page(Driver);

    }

    public  void btnSelect()
    {
        rs.btnSelect();

    }

}
