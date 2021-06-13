package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest{
    @BeforeMethod
    public void preSvakogTesta() {
        driver.navigate().to(homeUrl);
        driver.manage().window().maximize();
    }
    @Test(priority = 0)
    public void logInValidCredentials() throws InterruptedException {
        String email = excelReader.getStringData("LoginRegisteredUser", 5, 2);
        String password = excelReader.getStringData("LoginRegisteredUser", 6, 2);
        String textForAssertion = excelReader.getStringData("LoginRegisteredUser", 8, 2);
        logInForm(email, password);
        String actualText = loginPage.logInText();
        Assert.assertEquals(actualText, textForAssertion);
    }
    @Test(priority = 1)
    public void logOut() throws InterruptedException {
        logInValidCredentials();
        loginPage.logOutClick();
        Thread.sleep(6000);
        String textForAssertion = excelReader.getStringData("Logout", 9, 2);
        String actualText = loginPage.logOutText();
        Assert.assertEquals(actualText, textForAssertion);
    }
    @Test(priority = 3)
    public void logInInvalidEmail() throws InterruptedException {
        String email = excelReader.getStringData("LoginInvalidEmail", 5, 2);
        String password = excelReader.getStringData("LoginInvalidEmail", 6, 2);
        String textForAssertion = excelReader.getStringData("LoginInvalidEmail", 8, 2);
        logInForm(email, password);
        Thread.sleep(6000);
        String actualText = loginPage.invalidCredentialsText();
        Assert.assertEquals(actualText, textForAssertion);
    }
    @Test(priority = 4)
    public void logInInvalidPassword() throws InterruptedException {
        String email = excelReader.getStringData("LoginInvalidPassword", 5, 2);
        String password = excelReader.getStringData("LoginInvalidPassword", 6, 2);
        String textForAssertion = excelReader.getStringData("LoginInvalidPassword", 8, 2);
        logInForm(email, password);
        Thread.sleep(6000);
        String actualText = loginPage.invalidCredentialsText();
        Assert.assertEquals(actualText, textForAssertion);
    }
    @Test(priority = 5)
    public void logInEmptyCredentials() throws InterruptedException {
        String email = excelReader.getStringData("LoginEmptyCredentials", 5, 2);
        String password = excelReader.getStringData("LoginEmptyCredentials", 6, 2);
        String textForAssertion = excelReader.getStringData("LoginEmptyCredentials", 8, 2);
        logInForm(email, password);
        Thread.sleep(6000);
        String actualText = loginPage.invalidCredentialsText();
        Assert.assertEquals(actualText, textForAssertion);
    }

    public void logInForm(String email, String password){
        mainNavigation.signInClick();
        loginPage.emailInput(email);
        loginPage.passwordInput(password);
        loginPage.signInClick();
    }
    @AfterMethod
    public void posleSvakogTesta() throws InterruptedException {
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();
    }
}
