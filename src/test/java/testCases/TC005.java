package testCases;

import org.apache.commons.io.output.ByteArrayOutputStream;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

//navigating to Privacy Policy
public class TC005 extends BaseTest {

    @Test
    public void TC005()
    {
        HomePage hp = new HomePage(driver);
        LoginPage lp = new LoginPage(driver);
        hp.verifyLogin();
        lp.termsAndConditionsLink.click();
        driver.navigate().back();

    }
}
