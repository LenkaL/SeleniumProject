package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignInTest extends BaseTest{
    @BeforeMethod
    public void preSvakogTesta() {
        driver.navigate().to(homeUrl);
        driver.manage().window().maximize();
    }
    @Test(priority = 0)
    public void signInInvalidEmail() throws InterruptedException {
        String username = excelReader.getStringData("SigninInvalidEmail", 5, 2);
        String textForAssertion = excelReader.getStringData("SigninInvalidEmail", 7, 2);
        signInForm(username);
        Thread.sleep(6000);
        String actualText = signInPage.errorInvalidEmailText();
        Assert.assertEquals(actualText, textForAssertion);
    }
    @Test(priority = 1)
    public void signInWithEmptyField() throws InterruptedException {
        String username = excelReader.getStringData("SigninEmptyField", 5, 2);
        String textForAssertion = excelReader.getStringData("SigninEmptyField", 7, 2);
        signInForm(username);
        Thread.sleep(6000);
        String actualText = signInPage.errorInvalidEmailText();
        Assert.assertEquals(actualText, textForAssertion);
    }
    @Test(priority = 2)
    public void signInValidEmail() throws InterruptedException {
        String username = excelReader.getStringData("SigninTest", 5, 2);
        String textForAssertion = excelReader.getStringData("SigninTest", 7, 2);
        signInForm(username);
        Thread.sleep(6000);
        String actualText = signInPage.successfullySigInText();
        Assert.assertEquals(actualText, textForAssertion);
    }
    public void signInForm(String email){
        mainNavigation.signInClick();
        signInPage.emailFieldForUnregistredUser(email);
        signInPage.createAccountButtonClick();
    }
    @AfterMethod
    public void posleSvakogTesta() throws InterruptedException {
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();
    }
}
