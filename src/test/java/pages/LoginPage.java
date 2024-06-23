package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import utils.ReusableMethods;

public class LoginPage extends BasePage{


    public LoginPage(AndroidDriver driver) {
        super(driver);
    }


    @AndroidFindBy (xpath = "//android.app.Dialog/android.view.View/android.widget.EditText")
    public WebElement phoneNumberField;
    @AndroidFindBy (xpath = "//android.widget.Button[@text=\"PROCEED\"]")
    public WebElement proceedButton;
    @AndroidFindBy (xpath = "//android.widget.TextView[@text=\"Terms & conditions\"]")
    public WebElement termsAndConditionsLink;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Privacy Policy\"]")
    public WebElement privacyPolicyLink;
    @AndroidFindBy (xpath = "//android.widget.Button[@text=\"Close\"]")
    public WebElement closeButton;


    public void enterNumber()
    {
        HomePage hp = new HomePage(driver);
        hp.verifyLogin();
        LoginPage lp = new LoginPage(driver);
        lp.phoneNumberField.sendKeys(ReusableMethods.number());
    }
}
