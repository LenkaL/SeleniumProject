package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyWishListTests extends LoginTests{
    @BeforeMethod
    public void preSvakogTesta(){
        driver.navigate().to(homeUrl);
        driver.manage().window().maximize();
    }
  @Test(priority = 0)
    public void addingNewWishlist() throws InterruptedException {
        String name = excelReader.getStringData("AddingWishlist", 7, 2);
        String textForAssertion = excelReader.getStringData("AddingWishlist", 10, 2);
        addNewWishListFill(name);
        String actualText = myWishListsPage.successfulyText();
        Assert.assertEquals(actualText, textForAssertion);
    }
    @Test(priority = 1)
    public void removeWishlist() throws InterruptedException {
        logInValidCredentials();
        myAccountSection.myWishlistClick();
        myWishListsPage.deleteButtonClick();
        Thread.sleep(3000);

       myAddressPage.popUpClickOnDelete();
    }
    @Test(priority = 2)
    public void addMultipleWishlist() throws InterruptedException {
        logInValidCredentials();
        myAccountSection.myWishlistClick();
       for(int i=2; i<=4; i++) {
            String name = excelReader.getStringData("AddMultipleWishList", 7, i);
            myWishListsPage.nameInput(name);
            myWishListsPage.saveButtonClick(); }
            String textForAssertion = excelReader.getStringData("AddMultipleWishList", 10, 2);
            String actualText = myWishListsPage.countAddedWishLists();
            Assert.assertEquals(actualText, textForAssertion);

    }
   public void addNewWishListFill(String name) throws InterruptedException {
        logInValidCredentials();
        myAccountSection.myWishlistClick();
        myWishListsPage.nameInput(name);
        myWishListsPage.saveButtonClick();
    }
    @AfterMethod
    public void posleSvakogTesta() throws InterruptedException {
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();
    }
}
