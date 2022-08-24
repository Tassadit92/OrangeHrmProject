import browser.Browser;
import browser.Info;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;

import java.time.Duration;

public class TestBase {
    WebDriver driver;

    // we have to iherit or exted this class everytime we creat a test class
    //lik first test extend test Base
    @BeforeMethod
    public void setUp() {
        driver = Browser.getDriver();
        driver.navigate().to(Info.URl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @AfterMethod
    public void closeBrowser() {
        driver.close();
        driver.quit();
    }
    public LoginPage startLoginPage(){
        return PageFactory.initElements(driver,LoginPage.class);
    }
}
