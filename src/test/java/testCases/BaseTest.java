package testCases;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    AndroidDriver driver;



    @Parameters({"deviceName","platformVersion","udid"})
    @BeforeClass
    public void setup(String deviceName, String platformVersion, String udid) throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,deviceName);
        caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.illionsoft.thyrocare.MainActivity");
        caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.illionsoft.thyrocare");
        caps.setCapability(MobileCapabilityType.UDID,udid);
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
        driver = new AndroidDriver (new URL("http://127.0.0.1:4723/"),caps);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);




    }
}
