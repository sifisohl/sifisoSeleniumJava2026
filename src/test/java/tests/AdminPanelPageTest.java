package tests;

import org.testng.annotations.Test;
import utils.Base;

public class AdminPanelPageTest extends Base {

    @Test
    public void NavigateToAdminTest(){
        homepage.checkIfNdosiWebsiteLoaded();
        homepage.clickHomeLoginButton();
        loginPage.enterUsername("SifisoH@gmail.com");
        loginPage.enterPassword("@12345678");
        loginPage.clickLoginButton();
        dashboardPage.verifyLoginWasSuccessful();
        dashboardPage.clickMenu();
        dashboardPage.clickAdminPanel();
        adminPanelPage.clickOnGroups();

    }
}
