package utils;

import org.openqa.selenium.WebDriver;
import pageObjects.*;

public class Base {

    static final WebDriver driver = browserFactory.startBrowser("chrome", "\"https://ndosisimplifiedautomation.vercel.app/\"");
    public HomePage homepage= new HomePage(driver);
    public LoginPage loginPage= new LoginPage(driver);
    public DashboardPage dashboardPage= new DashboardPage(driver);
    public AdminPanelPage adminPanelPage= new AdminPanelPage(driver);
    public GroupsPage groupsPage= new GroupsPage(driver);
}

