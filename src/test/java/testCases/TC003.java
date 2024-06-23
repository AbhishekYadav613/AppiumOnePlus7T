package testCases;

//enter number and click proceed.

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utils.ReusableMethods;

public class TC003 extends BaseTest{

    @Test

    public void TC003()
    {
        HomePage hp = new HomePage(driver);
        LoginPage lp = new LoginPage(driver);
        hp.loginButton.click();
        lp.phoneNumberField.sendKeys(ReusableMethods.number());
        lp.proceedButton.click();

    }
}
