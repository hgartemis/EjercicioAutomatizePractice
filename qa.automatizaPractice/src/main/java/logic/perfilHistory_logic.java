package logic;

import driver.driver;
import pages.perfilHistory_page;

import java.util.ArrayList;

public class perfilHistory_logic {

    driver Driver = null;
    perfilHistory_page pp = null;

    public perfilHistory_logic(driver driver) {

        this.Driver = driver;
        pp = new perfilHistory_page(Driver);

    }

    public ArrayList<String> listaOrdenes(){
     return pp.listaOrdenes();
    }

}
