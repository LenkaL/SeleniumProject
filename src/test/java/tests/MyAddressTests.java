package tests;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyAddressTests extends LoginTests{
    @BeforeMethod
    public void preSvakogTesta() {
        driver.navigate().to(homeUrl);
        driver.manage().window().maximize();
    }
    @Test(priority = 0)
    public void addingNewAddres() throws InterruptedException {
        String address = excelReader.getStringData("AddNewAddress", 7, 2);
        String city = excelReader.getStringData("AddNewAddress", 8, 2);
        String state = excelReader.getStringData("AddNewAddress", 9, 2);
        String zip = excelReader.getStringData("AddNewAddress", 10, 2);
        String phone = excelReader.getStringData("AddNewAddress", 11, 2);
        String addressTitle = excelReader.getStringData("AddNewAddress", 12, 2);
        String textForAssertion = excelReader.getStringData("AddNewAddress", 14, 2);
         addNewAddressForm(address,city, state, zip, phone, addressTitle);
        String actualText = myAddressPage.addNewAddresText();
        Assert.assertEquals(actualText, textForAssertion);
    }
    @Test(priority = 1)
    public void updateAddres() throws InterruptedException {
        String address = excelReader.getStringData("UpdateAddress", 7, 2);
        String city = excelReader.getStringData("UpdateAddress", 8, 2);
        String state = excelReader.getStringData("UpdateAddress", 9, 2);
        String zip = excelReader.getStringData("UpdateAddress", 10, 2);
        String phone = excelReader.getStringData("UpdateAddress", 11, 2);
        String addressTitle = excelReader.getStringData("UpdateAddress", 12, 2);
        String textForAssertion = excelReader.getStringData("UpdateAddress", 14, 2);
        updateAddressFill(address,city, state, zip, phone, addressTitle);
        String actualText = myAddressPage.addNewAddresText();
        Assert.assertEquals(actualText, textForAssertion);
    }
    @Test(priority = 2)
        public void deleteAddress() throws InterruptedException {
        mainNavigation.signInClick();
        logInValidCredentials();
        myAccountSection.myAddressPageClick();
        myAddressPage.deleteAddress();
        Thread.sleep(2500);
        myAddressPage.popUpClickOnDelete();
    }
    public void addNewAddressForm(String address, String city, String state, String zip, String phone, String addressTitle) throws InterruptedException {
        mainNavigation.signInClick();
        logInValidCredentials();
        myAccountSection.myAddressPageClick();
        myAddressPage.addNewAddressButtonClick();
        myAddressPage.addressInput(address);
        myAddressPage.cityInput(city);
        myAddressPage.stateInput(state);
        myAddressPage.zipCodeInput(zip);
        myAddressPage.phoneInput(phone);
        myAddressPage.addresTitleInput(addressTitle);
        myAddressPage.saveButton();
    }
    public void updateAddressFill(String address, String city, String state, String zip, String phone, String addressTitle) throws InterruptedException {
        mainNavigation.signInClick();
        logInValidCredentials();
        myAccountSection.myAddressPageClick();
        myAddressPage.updateAddressButton();
        myAddressPage.addressInput(address);
        myAddressPage.cityInput(city);
        myAddressPage.stateInput(state);
        myAddressPage.zipCodeInput(zip);
        myAddressPage.phoneInput(phone);
        myAddressPage.addresTitleInput(addressTitle);
        myAddressPage.saveButton();

    }
    @AfterMethod
    public void posleSvakogTesta() throws InterruptedException {
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();
    }
}
