package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WomenProductsPage {
    private WebDriver driver;
    WebElement viewListOptions;
    WebElement addToCartBlouse;
    WebElement addToCartSleeveTshrt;
    WebElement succesfulyAddProduct;
    WebElement closeWindow;
    WebElement continueShoppingButton;
    WebElement cartButton;

    public WomenProductsPage(WebDriver driver)
    {
        this.driver=driver;
    }

    public WebElement getViewListOptions() {
        return driver.findElement(By.className("icon-th-list"));
    }

    public WebElement getAddToCartBlouse() {
        return driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div/div[3]/div/div[2]/a[1]/span"));
    }

    public WebElement getAddToCartSleeveTshrt() {
        return driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div/div[3]/div/div[2]/a[1]/span"));
    }

    public WebElement getSuccesfulyAddProduct() {
        return driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a"));
    }

    public WebElement getCloseWindow() {
        return driver.findElement(By.className("cross"));
    }

    public WebElement getCartButton() {
        return driver.findElement(By.cssSelector(".shopping_cart>a"));
    }

    public void listClick(){
        getViewListOptions().click();
    }

    public WebElement getContinueShoppingButton() {
        return driver.findElement(By.className("continue.btn.btn-default.button.exclusive-medium"));
    }

    public void addToCartTshrtClick(){
        getAddToCartSleeveTshrt().click();
    }
    public void addToCartBlousetClick(){
        getAddToCartBlouse().click();
    }

    public String succesText(){
      return   getSuccesfulyAddProduct().getText();
    }

    public void closeWindowClick(){
        getCloseWindow().click();
    }
    public void continueButtonClick(){
        getContinueShoppingButton().click();
    }
    public void cartButton(){
        getAddToCartBlouse().click();
    }
}
