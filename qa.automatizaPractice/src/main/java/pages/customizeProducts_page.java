package pages;

import driver.driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class customizeProducts_page {

    public driver Driver = null;
    public WebDriver driver = null;

    @FindBy(id = "quantity_wanted")
    WebElement idCantidad;

    @FindBy(xpath = "//*[@id='quantity_wanted_p']/a[2]/span")
    WebElement btnCantidad;

    @FindBy(id = "group_1")
    WebElement cboSize;

    @FindBy(xpath = "//*[@id='add_to_cart']/button/span")
    WebElement btnAddCart;

    @FindBy(xpath = "//*[@id='layer_cart']/div[1]/div[2]/div[4]/span/span")
    WebElement btnContinueShopp;

    @FindBy(xpath = "//*[@id='columns']/div[1]/a[1]")
    WebElement btnHome;

    public customizeProducts_page(driver driver) {

        this.Driver = driver;
        PageFactory.initElements(this.Driver.returnDriver(), this);

    }

    public void setCantidad(String cant)
    {
        idCantidad.clear();
        idCantidad.sendKeys(cant);

    }

    public void setSize(String size)
    {
        cboSize.sendKeys(size);
        //Select sel = new Select(cboSize);
        //Driver.implicitwait();
        //sel.selectByValue(size);

    }

    public void btnAddCart()
    {
        Driver.implicitwait();
        btnAddCart.click();
    }

    public void btnContinueShopp()
    {
        Driver.implicitwait();
        btnContinueShopp.click();
    }

    public void btnHome()
    {
        Driver.implicitwait();
        btnHome.click();
    }

}
