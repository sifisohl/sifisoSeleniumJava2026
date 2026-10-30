package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Base;

import java.time.Duration;

public class GroupsPage {

    WebDriver driver;

    By createNewGroup_xpath = By.xpath("//button[contains(., '+ Create New Group')]");
    By groupName_xpath = By.xpath("//*[@id=\"app-root\"]/div/div[3]/div/div[4]/div/form/div[1]/input");
    By maxCapacity_xpath = By.xpath("//*[@id=\"app-root\"]/div/div[3]/div/div[4]/div/form/div[1]/input");
    By createGroupButton_xpath = By.xpath("//button[text()='Create Group']");
    By successMessage_xpath = By.xpath("//*[contains(text(),'Group created successfully!')]");

    public GroupsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnCreateNewGroup(){
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(createNewGroup_xpath));
        driver.findElement(createNewGroup_xpath).click();
    }

    public void fillGroupName(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(groupName_xpath));
        driver.findElement(groupName_xpath).sendKeys("Sifiso Group");
    }

    public void setMaxCapacity(){ driver.findElement(maxCapacity_xpath).sendKeys("100");
    }

    public void clickOnCreateGroup(){
        driver.findElement(createGroupButton_xpath).click();
    }

    public void verifyGroupCreated(){
        driver.findElement(successMessage_xpath).isDisplayed();
    }
}
