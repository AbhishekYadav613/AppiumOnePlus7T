package testCases;

import org.testng.annotations.Test;
import pages.HomePage;

public class TC001 extends BaseTest {

    @Test
    public void TC001(){

        HomePage hp = new HomePage(driver);
        hp.verifyLogin();

    }
}
