package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AdminPanelPage {

    WebDriver driver;

    By adminDashboardPage_xpath = By.xpath("//button[contains(., 'Admin Dashboard')]");
    By groups_xpath = By.xpath("//button[contains(., 'Groups')]");

    public AdminPanelPage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }

    public void verifyAdminPanelPage(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(adminDashboardPage_xpath));
        driver.findElement(adminDashboardPage_xpath).isDisplayed();
    }

    public void clickOnGroups (){driver.findElement(groups_xpath).click();
    }

}
