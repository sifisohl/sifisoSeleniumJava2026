package tests;

import org.testng.annotations.Test;
import utils.Base;

public class NdosiLoginTest extends Base{

    @Test
    public void LoginTest(){
        homepage.checkIfNdosiWebsiteLoaded();
        homepage.clickHomeLoginButton();
        loginPage.enterUsername("SifisoH@gmail.com");
        loginPage.enterPassword("@12345678");
        loginPage.clickLoginButton();
        dashboardPage.verifyLoginWasSuccessful();
        dashboardPage.clickMenu();
        dashboardPage.clickLogout();
        dashboardPage.closeAlertWindow();
    }
}
