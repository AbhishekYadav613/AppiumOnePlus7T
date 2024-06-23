package testCases;

//checking Privacy Policy

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class TC004 extends BaseTest{

    @Test
    public void TC004() throws InterruptedException {
        HomePage hp = new HomePage(driver);
        LoginPage lp = new LoginPage(driver);
        hp.loginButton.click();
        lp.privacyPolicyLink.click();
        driver.navigate().back();
    }
}
