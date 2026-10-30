package tests;

import org.testng.annotations.Test;
import utils.Base;

public class GroupsPageTest extends Base {

    @Test
    public void createANewGroup(){

        homepage.checkIfNdosiWebsiteLoaded();
        homepage.clickHomeLoginButton();
        loginPage.enterUsername("SifisoH@gmail.com");
        loginPage.enterPassword("@12345678");
        loginPage.clickLoginButton();
        dashboardPage.verifyLoginWasSuccessful();
        dashboardPage.clickMenu();
        dashboardPage.clickAdminPanel();
        adminPanelPage.clickOnGroups();
        groupsPage.clickOnCreateNewGroup();
        groupsPage.fillGroupName();
        groupsPage.setMaxCapacity();
        groupsPage.clickOnCreateGroup();
        groupsPage.verifyGroupCreated();
    }
}
