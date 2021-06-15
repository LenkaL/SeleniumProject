package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PersonalInfoTests extends LoginTests {
    @BeforeMethod
    public void preSvakogTesta() {
        driver.navigate().to(homeUrl);
        driver.manage().window().maximize();
    }
    @Test(priority = 1)
    public void editPersonalInfo() throws InterruptedException {
        String name = excelReader.getStringData("EditPersonalInfo", 8, 2);
        String lastName = excelReader.getStringData("EditPersonalInfo", 9, 2);
        String email = excelReader.getStringData("EditPersonalInfo", 10, 2);
        String currentPassword = excelReader.getStringData("EditPersonalInfo", 11, 2);
        String textForAssertion = excelReader.getStringData("EditPersonalInfo", 14, 2);
        updateInfoFill(name,lastName, email, currentPassword);
        String actualText = myPersonalInformationPage.succesMessage();
        Assert.assertEquals(actualText, textForAssertion);
    }
    public void updateInfoFill(String name, String lastName, String email, String currenPassword) throws InterruptedException {
        mainNavigation.signInClick();
        logInValidCredentials();
        myAccountSection.myPersonalInfoPageClick();
        myPersonalInformationPage.radioButtonMrClick();
        myPersonalInformationPage.firstNameField(name);
        myPersonalInformationPage.lastNameField(lastName);
        myPersonalInformationPage.emailInput(email);
        myPersonalInformationPage.passwordField(currenPassword);
        myPersonalInformationPage.saveButtonClick();
    }
    @AfterMethod
    public void posleSvakogTesta() throws InterruptedException {
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();
    }
}
