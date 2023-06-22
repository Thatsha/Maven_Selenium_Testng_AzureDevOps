package maven.selenium.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavenScript {

   public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Thatsha\\eclipse-workspace\\Azure_Repo_for_Maven\\webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");

        // Close the browser
        driver.quit();
    }
}
