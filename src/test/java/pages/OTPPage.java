package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class OTPPage extends BasePage{


    public OTPPage(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy (xpath = "//android.widget.TextView[@text=\"Change Number?\"]")
    public WebElement changeNumber;

    @AndroidFindBy (xpath = "//android.widget.TextView[@text=\"Resend OTP\"]")
    public WebElement resendOTP;

    @AndroidFindBy (xpath = "//android.widget.Button[@text=\"Close\"]")
    public WebElement closeButton;
}
