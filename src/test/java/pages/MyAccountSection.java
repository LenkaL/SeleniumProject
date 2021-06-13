package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountSection {
    WebDriver driver;
    WebElement myAddressPage;
    WebElement myPersonalInfoPage;
    WebElement myWishlistPage;
public MyAccountSection(WebDriver driver)
{
    this.driver=driver;
}
    public WebElement getMyAddressPage() {
       // return driver.findElement(By.cssSelector("ul.myaccount-link-list li:nth-of-type(3)"));
        return driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/ul/li[3]/a/span"));

    }
    public WebElement getMyPersonalInfoPage() {
        return driver.findElement(By.cssSelector("ul.myaccount-link-list li:nth-of-type(4)"));
    }
    public WebElement getMyWishlistPage() {
        return driver.findElement(By.cssSelector("ul.myaccount-link-list li:nth-of-type(5)"));
    }

    public void myPersonalInfoPageClick()
    {
        getMyPersonalInfoPage().click();
    }
    public void myWishlistClick()
    {
        getMyWishlistPage().click();
    }
    public void myAddressPageClick()
    {
        getMyAddressPage().click();
    }
}
