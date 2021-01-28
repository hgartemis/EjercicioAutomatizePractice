package logic;

import driver.driver;
import pages.perfil_page;

public class perfil_logic {

    driver Driver = null;
    perfil_page pp = null;

    public perfil_logic(driver driver) {

        this.Driver = driver;
        pp = new perfil_page(Driver);

    }

    public void Search(String idSearch) {

        pp.setSearch(idSearch);
        pp.btnSearch();

    }

    public  void btnHistory()
    {
        pp.btnHistory();
    }

    public  void btnCart()
    {
        pp.btnCart();
    }

    public  void btnPerfilUser()
    {
        pp.btnPerfilUser();
    }

    public  void btnSignOut()
    {
        pp.btnSignOut();
    }

}
