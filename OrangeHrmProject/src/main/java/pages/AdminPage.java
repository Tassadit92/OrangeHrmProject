package pages;

import browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class AdminPage {
    WebDriver driver= Browser.driver;
    @FindBy(css = "button[type='submit']")private WebElement submmitButton;
public AdminPage searchUserName(String userName){
    List<WebElement> elements= driver.findElements(By.cssSelector(".oxd-input.oxd-input--active"));
    elements.get(1).sendKeys(userName);
    submmitButton.click();
    return this;
}
public void validatUserName(String userName){
    List<WebElement> elemrnts =driver.findElements(By.className("oxd-table-cell"));
    Assert.assertEquals(elemrnts.get(1).getText(),userName);
}








}
