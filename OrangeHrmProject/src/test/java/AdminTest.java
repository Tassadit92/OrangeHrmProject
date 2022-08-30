import org.testng.annotations.Test;

public class AdminTest extends TestBase {
// we extande the Test Base so we can initiate or start the driver
    @Test
    public void test01(){
    startLoginPage().loginToPIMpage().navigateToAdminPage().searchUserName("Aaliyah.Haq").validatUserName("Aaliyah.Haq");

    }
}
