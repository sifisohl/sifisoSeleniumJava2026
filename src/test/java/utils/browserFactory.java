package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class browserFactory {
    static WebDriver driver;

    public static WebDriver startBrowser(String browserName, String url){

        if (browserName.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("safari")){
            driver = new SafariDriver();
        } else {
            driver = new EdgeDriver();
        }

        driver.get(url);
        driver.manage().window().maximize();

        return driver;
    }
}
