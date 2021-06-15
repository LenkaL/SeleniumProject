package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainNavigation {
    WebDriver driver;
    WebElement signInTab;
    WebElement myAccountTab;
    WebElement womanProductsTab;
    public MainNavigation(WebDriver driver) {
        super();
        this.driver = driver;
    }

    public WebElement getSignInTab() {
        return driver.findElement(By.className("login"));
    }

    public WebElement getMyAccountTab() {
        return driver.findElement(By.className("account"));
    }

    public WebElement getWomanProductsTab() {
        return driver.findElement(By.cssSelector(".sf-menu.clearfix.menu-content >li:first-of-type"));
    }

    public void signInClick() {
        getSignInTab().click();
    }
    /*public void myaccountClick()
    {
        getMyAccountTab().click();
    }*/

    public void womanProductClick() {
        getWomanProductsTab().click();
    }
}
