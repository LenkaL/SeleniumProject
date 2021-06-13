package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainNavigation {
    WebDriver driver;
    WebElement signInTab;
    WebElement myAccountTab;
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

    public void signInClick()
    {
        getSignInTab().click();
    }
    public void myaccountClick()
    {
        getMyAccountTab().click();
    }
}
