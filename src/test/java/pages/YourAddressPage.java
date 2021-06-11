package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YourAddressPage {
    WebDriver driver;
    WebElement address1;
    WebElement city;
    WebElement state;
    WebElement zipCode;
    WebElement phoneNumber;

    public YourAddressPage(WebDriver driver)
    {
        this.driver=driver;
    }

    public WebElement getAddress1() {
        return driver.findElement(By.id("address1"));
    }

    public WebElement getCity() {
        return driver.findElement(By.id("city"));
    }

    public WebElement getPhoneNumber() {
        return driver.findElement(By.id("phone"));
    }

    public WebElement getState() {
        return driver.findElement(By.id("id_state"));
    }

    public WebElement getZipCode() {
        return driver.findElement(By.id("postcode"));
    }

    public void addressField(String address)
    {
        getAddress1().sendKeys(address);
    }
    public void phoneField(String phone)
    {
        getPhoneNumber().sendKeys(phone);
    }
    public void cityField(String city)
    {
        getCity().sendKeys(city);
    }
    public void stateFormControl()
    {
        getState().click();
    }
    public void zipCodeField(String zip)
    {
        getZipCode().sendKeys(zip);
    }


}
