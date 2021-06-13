package pages;

import net.bytebuddy.asm.Advice;
import org.apache.bcel.generic.Select;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyAddressPage {
    WebDriver driver;
    WebElement addNewAddressButton;
    WebElement firstName;
    WebElement lastName;
    WebElement address;
    WebElement city;
    WebElement state;
    WebElement zipCode;
    WebElement phone;
    WebElement saveButton;
    WebElement addressTitle;
    WebElement successfulyAddNewAddress;
    WebElement deleteaddressButton;
    WebElement updateAddressButton;
    public MyAddressPage(WebDriver driver)
{
    this.driver=driver;
}
    public WebElement getAddNewAddressButton() { return driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/a")); }
    public WebElement getFirstName() {
        return driver.findElement(By.id("firstname"));
    }
    public WebElement getLastName() {
        return driver.findElement(By.id("lastname"));
    }
    public WebElement getAddress() {
        return driver.findElement(By.id("address1"));
    }
    public WebElement getCity() {
        return driver.findElement(By.id("city"));
    }
    public WebElement getState() { return driver.findElement(By.id("id_state")); }
    public WebElement getZipCode() {
        return driver.findElement(By.id("postcode"));
    }
    public WebElement getPhone() {
        return driver.findElement(By.id("phone"));
    }
    public WebElement getSaveButton() {
        return driver.findElement(By.id("submitAddress"));
    }
    public WebElement getSuccessfulyAddNewAddress(){return driver.findElement(By.cssSelector(".last_item.item.box> li:first-of-type>.page-subheading"));}
    public WebElement getAddressTitle() { return driver.findElement(By.id("alias")); }
    public WebElement getDeleteaddressButton() {
      //  return driver.findElement(By.cssSelector(".last_item.alternate_item.box>.address_update>.btn.btn-default.button.button-small:last-of-type"));
        return driver.findElement(By.cssSelector(".last_item.item.box>.address_update>.btn.btn-default.button.button-small:last-of-type"));
        }
    public WebElement getUpdateAddressButton() {
        return driver.findElement(By.cssSelector(".last_item.item.box>.address_update>.btn.btn-default.button.button-small:first-of-type"));

    }

    public void addNewAddressButtonClick() { getAddNewAddressButton().click(); }
    public void firstNameInput(String firstName)
    {
        getFirstName().clear();
        getFirstName().sendKeys(firstName);
    }
    public void lastNameInput(String lastName)
    {
        getLastName().clear();
        getLastName().sendKeys(lastName);
    }
    public void addressInput(String address)
    {
        getAddress().clear();
        getAddress().sendKeys(address);
    }
    public void cityInput(String city) { getCity().clear(); getCity().sendKeys(city); }
    public void stateInput(String state) { getState().click();getState().sendKeys(state);getState().sendKeys("ENTER"); }
    public void phoneInput(String phone) { getPhone().sendKeys(phone); }
    public void zipCodeInput(String zip) { getZipCode().clear(); getZipCode().sendKeys(zip); }
    public void saveButton() { getSaveButton().click(); }
    public String addNewAddresText() { return getSuccessfulyAddNewAddress().getText(); }
    public void addresTitleInput(String title){ getAddressTitle().clear(); getAddressTitle().sendKeys(title);}
    public void deleteAddress(){ getDeleteaddressButton().click();}
    public void popUpClickOnDelete(){ Alert action = driver.switchTo().alert(); action.accept();}
    public void updateAddressButton() { getUpdateAddressButton().click(); }

}
