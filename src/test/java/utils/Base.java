package utils;

import org.openqa.selenium.WebDriver;
import pageObjects.DashboardPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class Base {

    static final WebDriver driver = browserFactory.startBrowser("chrome", "\"https://ndosisimplifiedautomation.vercel.app/\"");
    public HomePage homepage= new HomePage(driver);
    public LoginPage loginPage= new LoginPage(driver);
    public DashboardPage dashboardPage= new DashboardPage(driver);
}
