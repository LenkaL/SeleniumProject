package pages;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MyWishListsPage {
    WebDriver driver;
    WebElement name;
    WebElement saveButton;
    WebElement lastName;
    WebElement successfulyAddesList;
    WebElement deleteList;
    public MyWishListsPage(WebDriver driver){
        this.driver=driver; }

    public WebElement getName() {
        return driver.findElement(By.id("name")); }

    public WebElement getSaveButton() {
        return driver.findElement(By.id("submitWishlist")); }

    public WebElement getSuccessfulyAddesList() {
        return driver.findElement(By.cssSelector(".table.table-bordered > tbody>tr> td:first-of-type")); }

    public WebElement getDeleteList() {
         return  driver.findElement(By.className("icon-remove"));}

    public void nameInput(String name){
        getName().sendKeys(name);}

    public void saveButtonClick() {
        getSaveButton().click();}

    public void deleteButtonClick() {
        getDeleteList().click();}

    public String successfulyText() {
        return getSuccessfulyAddesList().getText();
    }

    //Prebrojavanje redova u tbody-ju - koliko ima redova(tr) toliko se wishlist-i dodalo
    public String countAddedWishLists(){
        List<WebElement> rows = driver.findElements(By.cssSelector(".table.table-bordered > tbody>tr"));
        System.out.println(rows.size());
        return String.valueOf(rows.size()); }



}
