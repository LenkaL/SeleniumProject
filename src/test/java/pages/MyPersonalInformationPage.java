package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyPersonalInformationPage {
    WebDriver driver;
    WebElement radioButtonMr;
    WebElement firstName;
    WebElement lastName;
    WebElement password;
    WebElement email;
    WebElement saveButton;
    WebElement successMessage;
    public MyPersonalInformationPage(WebDriver driver)
    {
        this.driver=driver;
    }

    public WebElement getRadioButtonMr() {
        return driver.findElement(By.id("id_gender1")); }

    public WebElement getLastName() {
        return driver.findElement(By.id("lastname")); }

    public WebElement getFirstName() {
        return driver.findElement(By.id("firstname"));
    }

    public WebElement getPassword() {
        return driver.findElement(By.id("old_passwd")); }

    public WebElement getEmail() {
        return driver.findElement(By.id("email")); }

    public WebElement getSaveButton() {
        return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/form/fieldset/div[11]/button/span"));
    }

    public WebElement getSuccessMessage() {
        return driver.findElement(By.className("alert-success"));
    }

    public void radioButtonMrClick() {
        getRadioButtonMr().click();
    }
    public void firstNameField(String firstName)
    {
        getFirstName().clear();
        getFirstName().sendKeys(firstName);
    }
    public void lastNameField(String lastName)
    {
        getLastName().clear();
        getLastName().sendKeys(lastName);
    }
    public void passwordField(String password) {
        getPassword().sendKeys(password);
    }
    public void emailInput(String email) {
        getEmail().clear();
        getEmail().sendKeys(email); }

    public void saveButtonClick(){
        getSaveButton().click();
    }
    public String succesMessage(){
        return getSuccessMessage().getText();
    }
}
