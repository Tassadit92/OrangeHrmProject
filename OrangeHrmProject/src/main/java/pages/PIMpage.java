package pages;

import browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class PIMpage {
    WebDriver driver = Browser.driver;
    @FindBy(linkText = "Recruitment")private WebElement recruitmentLink;
    @FindBy(css = "button[type='submit']")private  WebElement submitButton;
    @FindBy(xpath = "//div[@class=\"oxd-table-row oxd-table-row--with-border oxd-table-row--clickable\"]/div[3]/div") private  WebElement firstNameElement;
    @FindBy(xpath = "//div[@class=\"oxd-table-row oxd-table-row--with-border oxd-table-row--clickable\"]/div[4]/div") private  WebElement lastNameElement;

    public RecruitmentPage navigatToRecrutmentLink(){
    recruitmentLink.click();
    return PageFactory.initElements(Browser.driver, RecruitmentPage.class);
}

public PIMpage searchEmployeeID(String id){
    List<WebElement>elements =driver.findElements((By.cssSelector(".oxd-input.oxd-input--active")));
    elements.get(1).sendKeys(id);
    submitButton.click();
    return this;

}
public PIMpage validatFirstNameAndLastName(String firstName,String lastName){
    Assert.assertEquals(firstNameElement.getText(), firstName);
    Assert.assertEquals(lastNameElement.getText(),lastName);
    return this;
}






}