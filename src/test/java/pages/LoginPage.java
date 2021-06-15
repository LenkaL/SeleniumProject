package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;
    WebElement emailField;
    WebElement passwordField;
    WebElement signInButton;
    WebElement successfullyLogInMessage;
    WebElement logOut;
    WebElement signInMessage;
    WebElement errorMessageInvalidCredential;

    public  LoginPage(WebDriver driver) {
        super();
        this.driver=driver;
    }

    public WebElement getEmailField() {

        return driver.findElement(By.id("email"));
    }

    public WebElement getPasswordField() {

        return driver.findElement(By.id("passwd"));
    }

    public WebElement getSignInButton() {
        return driver.findElement(By.id("SubmitLogin"));
    }

    public WebElement getSuccessfullyLogInMessage() {
        return driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1"));
    }

    public WebElement getLogOut() {

        return driver.findElement(By.className("logout"));
    }

    public WebElement getSignInMessage() {

        return driver.findElement(By.className("login"));
    }

    public WebElement getErrorMessageInvalidCredential() {
        return driver.findElement(By.className("alert-danger"));
    }

    public void emailInput(String email) {
        getEmailField().sendKeys(email);
    }

    public void passwordInput(String password) {
        getPasswordField().sendKeys(password);
    }

    public void signInClick() {
        getSignInButton().click();
    }

    public String logInText() {
        return getSuccessfullyLogInMessage().getText();
    }

    public void logOutClick() {
        getLogOut().click();
    }

    public String logOutText() {
        return getSignInMessage().getText();
    }

    public  String invalidCredentialsText() {
        return getErrorMessageInvalidCredential().getText();
    }
}
