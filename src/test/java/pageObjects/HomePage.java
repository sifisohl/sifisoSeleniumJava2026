package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    WebDriver driver;

    By verifyHomePageContent_xpath = By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/button[1]/span[2]");
    By mainLoginButton_xpath = By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/button");

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void checkIfNdosiWebsiteLoaded(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(verifyHomePageContent_xpath));
        driver.findElement(verifyHomePageContent_xpath).isDisplayed();
    }

    public void clickHomeLoginButton(){
        driver.findElement(mainLoginButton_xpath).click();
    }
}
