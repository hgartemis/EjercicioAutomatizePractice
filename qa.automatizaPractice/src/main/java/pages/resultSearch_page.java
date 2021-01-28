package pages;

import driver.driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class resultSearch_page {

    public driver Driver = null;
    public WebDriver driver = null;

    @FindBy(xpath = "//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[2]/span")
    WebElement btnSelect;

    public resultSearch_page(driver driver) {

        this.Driver = driver;
        PageFactory.initElements(this.Driver.returnDriver(), this);

    }

    public void btnSelect() {

        btnSelect.click();

    }

}
