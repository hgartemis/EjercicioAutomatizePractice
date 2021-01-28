package pages;

import driver.driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class perfil_page {

    public driver Driver = null;
    public WebDriver driver = null;

    @FindBy(id = "search_query_top")
    WebElement search;

    @FindBy(id = "submit_search")
    WebElement btnSearch;

    @FindBy(xpath = "//*[@id='center_column']/div/div[1]/ul/li[1]/a/i")
    WebElement btnHistory;

    @FindBy(xpath = "//*[@id='header']/div[3]/div/div/div[3]/div/a/b")
    WebElement btnCart;

    @FindBy(xpath = "//*[@id='header']/div[2]/div/div/nav/div[1]/a/span")
    WebElement btnPerfilUser;

    @FindBy(xpath = "//*[@id='header']/div[2]/div/div/nav/div[2]/a")
    WebElement btnSignOut;

    public perfil_page(driver driver) {

        this.Driver = driver;
        PageFactory.initElements(this.Driver.returnDriver(), this);

    }

    public void setSearch(String idSearch){

        Driver.implicitwait();
        search.sendKeys(idSearch);
    }

    public void btnSearch() {

        search.sendKeys(Keys.ENTER);
        //btnSearch.click();

    }

    public void btnHistory(){

        //Driver.implicitwait();
        btnHistory.click();

    }

    public void btnCart(){

        Driver.implicitwait();
        btnCart.click();

    }

    public void btnPerfilUser(){
        btnPerfilUser.click();
    }

    public void btnSignOut(){
        btnSignOut.click();
    }




}
