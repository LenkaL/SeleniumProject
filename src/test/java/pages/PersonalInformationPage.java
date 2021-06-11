package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PersonalInformationPage {
    WebDriver driver;
    WebElement radioButtonMr;
    WebElement getRadioButtonMrs;
    WebElement firstName;
    WebElement lastName;
    WebElement password;
    public  PersonalInformationPage(WebDriver driver)
    {
        this.driver=driver;
    }

    public WebElement getRadioButtonMr() {
        return driver.findElement(By.id("id_gender1"));
    }

    public WebElement getGetRadioButtonMrs() {
        return driver.findElement(By.id("id_gender2"));
    }

    public WebElement getLastName() {
        return driver.findElement(By.id("customer_lastname"));
    }

    public WebElement getFirstName() {
        return driver.findElement(By.id("customer_firstname"));
    }

    public WebElement getPassword() {
        return driver.findElement(By.id("passwd"));
    }
    public void radioButtonMrClick()
    {
        getRadioButtonMr().click();
    }
    public void radioButtonMrsClick()
    {
        getGetRadioButtonMrs().click();
    }
    public void firstNameField(String firstName)
    {
        getFirstName().sendKeys(firstName);
    }
    public void lastNameField(String lastName)
    {
        getLastName().sendKeys(lastName);
    }
    public void passwordField(String password)
    {
        getPassword().sendKeys(password);
    }
}
