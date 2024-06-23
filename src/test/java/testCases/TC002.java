package testCases;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utils.ReusableMethods;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

//enter number in phone number field.
public class TC002 extends BaseTest{

    @Test

    public void TC002() throws InterruptedException {
        HomePage hp = new HomePage(driver);
        LoginPage lp = new LoginPage(driver);
        hp.loginButton.click();
        lp.phoneNumberField.sendKeys(ReusableMethods.number());





    }
}
