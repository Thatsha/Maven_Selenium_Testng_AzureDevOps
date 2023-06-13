package maven.selenium.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MavenScript {

    @Test
    public void test() throws InterruptedException {
        // declaration and instantiation of objects/variables
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thatsha\\eclipse-workspace\\Azure_Repo_for_Maven\\webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "http://ww7.demoaut.com/";
       

        // launch Chrome and direct it to the Base URL
        driver.get(baseUrl);
        
        WebDriverWait wait = new WebDriverWait(driver, 50);
  
        // close Chrome
        driver.quit();
    }
}
