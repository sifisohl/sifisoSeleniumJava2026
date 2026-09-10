import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver;

    @Test
    public void testLogin() throws InterruptedException {
        driver= new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://ndosisimplifiedautomation.vercel.app/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/button/span[2]")).click();
        driver.findElement(By.id("login-email")).sendKeys("SifisoH@gmail.com");
        driver.findElement(By.id("login-password")).sendKeys("@12345678");
        driver.findElement(By.id("login-submit")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("welcome-word")).isDisplayed();
        driver.quit();


    }
}
