package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class LaunchNdosiTest {

    WebDriver driver;

    @Test

    public void launchNdosiUrlTest(){
        driver = new ChromeDriver();
        driver.get("https://ndosisimplifiedautomation.vercel.app/");
        driver.manage().window().maximize();
    }

    @AfterTest
    public void closeBrowser(){
    driver.quit();
    }

}
