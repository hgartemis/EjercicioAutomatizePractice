package logic;

import driver.driver;
import pages.landing_page;

public class Landing_logic {

    driver Driver = null;
    landing_page lp = null;

    public Landing_logic(driver driver) {

        this.Driver = driver;
        lp = new landing_page(Driver);

    }

    public void SignIn() {

        lp.SignIn();

    }

}
