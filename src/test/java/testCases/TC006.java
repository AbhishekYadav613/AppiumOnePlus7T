package testCases;

//to check whether the PROCEED button is enabled or disabled.

import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class TC006 extends BaseTest {
    @Test

    public void TC006() {
        HomePage hp = new HomePage(driver);
        LoginPage lp = new LoginPage(driver);
        hp.loginButton.click();
        WebElement pb = lp.proceedButton;
        Assert.assertFalse(pb.isEnabled(), "Button is unexpectedly enabled.");
        System.out.println("Button is Disabled.");
    }
}
