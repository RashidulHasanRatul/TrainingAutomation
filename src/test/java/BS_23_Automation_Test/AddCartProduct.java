package BS_23_Automation_Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCartProduct {
    public static void main(String[] args) {
        // Initialize Driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        // Url
        String url = "http://automationpractice.com/index.php";

        driver.get(url);
    }
}
