package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartTests extends LoginTests{
    @BeforeMethod
    public void preSvakogTesta() {
        driver.navigate().to(homeUrl);
        driver.manage().window().maximize();
    }
    @Test(priority = 0)
    public void addProductToCart() throws InterruptedException {
        logInValidCredentials();
        mainNavigation.womanProductClick();
        womenProductsPage.listClick();
        Thread.sleep(2000);
        womenProductsPage.addToCartTshrtClick();
        womenProductsPage.closeWindowClick();
        womenProductsPage.cartButton();
        String textForAssertion = excelReader.getStringData("AddProductToCart", 10, 2);
        String actualText = womenProductsPage.succesText();
        Assert.assertEquals(actualText, textForAssertion);

    }
    @Test(priority = 1)
    public void addMultipleProductsToCart() throws InterruptedException {
        logInValidCredentials();
        mainNavigation.womanProductClick();
        womenProductsPage.listClick();
        womenProductsPage.addToCartTshrtClick();
        womenProductsPage.closeWindowClick();
        womenProductsPage.addToCartBlousetClick();
        String textForAssertion = excelReader.getStringData("AddMultipleProduct", 15, 2);
        String actualText = womenProductsPage.succesText();
        Assert.assertEquals(actualText, textForAssertion);
        womenProductsPage.closeWindowClick();
    }
    @AfterMethod
    public void posleSvakogTesta() throws InterruptedException {
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();
    }
}
