package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountSection {
    WebDriver driver;
    WebElement myAddressPage;
    WebElement myPersonalInfoPage;
    WebElement myWishlistPage;
public MyAccountSection(WebDriver driver) {
    this.driver=driver;
}
    public WebElement getMyAddressPage() {
    return driver.findElement(By.className("icon-building")); }

    public WebElement getMyPersonalInfoPage() {
    return driver.findElement(By.className("icon-user")); }

    public WebElement getMyWishlistPage() {
    return driver.findElement(By.className("icon-heart")); }

    public void myPersonalInfoPageClick() {
        getMyPersonalInfoPage().click();
    }

    public void myWishlistClick() {
        getMyWishlistPage().click();
    }

    public void myAddressPageClick() {
        getMyAddressPage().click();
    }
}
