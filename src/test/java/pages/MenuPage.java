package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class MenuPage extends BasePage{
    public MenuPage(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy (xpath = "(//android.widget.Button[@text=\"Login\"])[1]")
    public WebElement menuPageLoginButton;

    @AndroidFindBy (xpath = "//android.view.View[@text=\"Book a test\"]")
    public WebElement bookAtestButton;

    @AndroidFindBy (xpath = "//android.widget.TextView[@text=\"Scans\"]")
    public  WebElement scanButton;

    @AndroidFindBy (xpath = "//android.view.View[@text=\"Labs Near Me\"]")
    public WebElement labsNearMe;

    @AndroidFindBy (xpath = "//android.view.View[@text=\"Become a Thyrocare Partner\"]")
    public WebElement becomeThryrocarePartner;

    @AndroidFindBy (xpath = "//android.view.View[@text=\"My Offers\"]")
    public WebElement myOffers;

    @AndroidFindBy (xpath = "//android.view.View[@text=\"Food Handler (FSSAI)\"]")
    public WebElement foodHandler;

    @AndroidFindBy (xpath = "//android.view.View[@text=\"X-ray\"]")
    public WebElement xRay;

    @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"Ultrasound\"]")
    public WebElement ultraSound;

    @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"ECG\"]")
    public WebElement ecg;


//    public void BookATest()
//    {
//        HomePage hp = new HomePage();
//        hp.loginButton.click();
//    }

}
