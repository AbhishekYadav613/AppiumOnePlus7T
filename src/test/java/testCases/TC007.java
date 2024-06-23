package testCases;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utils.ReusableMethods;

//check whether a valid number is entered or not.
public class TC007 extends BaseTest{

    @Test
    public void TC007()
    {
        HomePage hp = new HomePage(driver);
        LoginPage lp = new LoginPage(driver);
        hp.loginButton.click();
        lp.phoneNumberField.sendKeys(ReusableMethods.number());
        lp.proceedButton.click();
        String errmsg= driver.findElement(By.xpath("//android.widget.TextView[@text=\"Invalid mobile number\"]")).getText();
        System.out.println(errmsg);

        if(errmsg.equalsIgnoreCase("invalid mobile number"))
        {
            System.out.println("TRY AGAIN.");
        }
else
        {
            System.out.println("MOVE FURTHER.");
        }

    }
}
