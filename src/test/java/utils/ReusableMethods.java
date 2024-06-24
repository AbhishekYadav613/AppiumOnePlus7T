package utils;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ReusableMethods {

    public static String number()
    {
        Faker fake = new Faker();
        return fake.number().digits(10);

    }


    public static void verifyButton(WebElement element){
        Assert.assertTrue(element.isDisplayed(),"Button is not displayed");
    }
}
