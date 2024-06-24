package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import jdk.jshell.execution.Util;
import org.openqa.selenium.WebElement;
import utils.ReusableMethods;

public class HomePage extends BasePage{


    public HomePage(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy (xpath = "//android.widget.Button[@text=\"Login\"]")
    public WebElement loginButton;

    @AndroidFindBy (xpath = "//android.webkit.WebView[@text=\"Home | Thyrocare\"]/android.view.View/android.view.View[1]/android.widget.Button[1]")
    public WebElement menuButton;

    @AndroidFindBy (xpath = "//android.widget.EditText")
    public WebElement searchBar;

    @AndroidFindBy (xpath = "//android.widget.Button[@text=\"REQUEST CALLBACK\"]")
    public WebElement requestCallBack;


    public void verifyLogin(){
        ReusableMethods.verifyButton(loginButton);
        loginButton.click();
    }




}
