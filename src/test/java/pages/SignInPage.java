package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {
    WebDriver driver;
    WebElement emailFieldForUnregistred;
    WebElement createAccountButton;
    WebElement errorMessageInvalidEmail;
    WebElement successfullySignInMessage;

    public SignInPage(WebDriver driver)
    {
        super();
        this.driver=driver;
    }

    public WebElement getEmailFieldForUnregistred() {
        return driver.findElement(By.id("email_create"));
    }

    public WebElement getCreateAccountButton() {
        return driver.findElement(By.id("SubmitCreate"));
    }

    public WebElement getErrorMessageInvalidEmail() {
        return driver.findElement(By.id("create_account_error"));
    }

    public WebElement getSuccessfullySignInMessage() {
        return driver.findElement(By.className("page-subheading"));
    }

    public void emailFieldForUnregistredUser(String email)
    {
        getEmailFieldForUnregistred().sendKeys(email);
    }
    public void createAccountButtonClick()
    {
        getCreateAccountButton().click();
    }
    public String errorInvalidEmailText()
    {
        return getErrorMessageInvalidEmail().getText();
    }
    public String successfullySigInText()
    {
        return getSuccessfullySignInMessage().getText();
    }
}
