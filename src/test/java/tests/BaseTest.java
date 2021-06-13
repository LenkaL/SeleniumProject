package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver driver;
    protected MainNavigation mainNavigation;
    protected SignInPage signInPage;
    protected LoginPage loginPage;
    protected MyAddressPage myAddressPage;
    protected MyAccountSection myAccountSection;
    protected ExcelReader excelReader;
    protected String homeUrl;
    @BeforeClass
    public void preSihTestova() throws IOException {
        System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        mainNavigation = new MainNavigation(driver);
        signInPage = new SignInPage(driver);
        loginPage = new LoginPage(driver);
        myAddressPage = new MyAddressPage(driver);
        myAccountSection = new MyAccountSection(driver);
        excelReader =  new ExcelReader("data/TestPlan.xlsx");
        homeUrl = "http://automationpractice.com/index.php";

    }
    @AfterClass
    public void posleSihTestova() {
        driver.close();
    }
}
