package BS_23_Automation_Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class SecoundUser {
    public static void main(String[] args) {
        // Initialize Driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        // Url
        String url = "http://automationpractice.com/index.php";

        driver.get(url);

        // Register 2nd User
        WebElement clickSign=  driver.findElement(By.xpath("//a[@class='login']"));
        clickSign.click();

        WebElement emailInputBox = driver.findElement(By.id("email_create"));
        emailInputBox.sendKeys("rashidulhasan.swe@gmail.com");

        // Click Button

        WebElement clickCreateAccount = driver.findElement(By.id("SubmitCreate"));
        clickCreateAccount.click();

        // Add Wait for Page Load
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //Fill up the Form

        // tittle
        WebElement title = driver.findElement(By.id("id_gender1"));
        title.click();

        // Frist Name
        WebElement fristName = driver.findElement(By.id("customer_firstname"));
        fristName.sendKeys("Ratul");

        // Last Name
        WebElement lastName = driver.findElement(By.id("customer_lastname"));
        lastName.sendKeys("Hasan");

        // Password
        WebElement passWord = driver.findElement(By.id("passwd"));
        passWord.sendKeys("123456");

        // DOB

        // Days
        WebElement Day = driver.findElement(By.id("days"));

        Select dayDropdown = new Select(Day);
        dayDropdown.selectByValue("5");

        // Month
        WebElement Month = driver.findElement(By.id("months"));

        Select MonthDropdown = new Select(Month);
        MonthDropdown.selectByIndex(6);

        // Year
        WebElement Year = driver.findElement(By.id("years"));

        Select YearDropdown = new Select(Year);
        YearDropdown.selectByIndex(22);

        // click signup News Letter
        WebElement clickSignupNewsLetter = driver.findElement(By.id("newsletter"));
        clickSignupNewsLetter.click();

        // Receive Special Offer
        WebElement receiveSpecialOffer = driver.findElement(By.id("optin"));
        receiveSpecialOffer.click();


        // Company
        WebElement company = driver.findElement(By.id("company"));
        company.sendKeys("Mediusware");

        // Adress 1
        WebElement adress1 = driver.findElement(By.id("address1"));
        adress1.sendKeys("Mohammadpur,Dhaka");

        // Adress 2
        WebElement adress2 = driver.findElement(By.id("address2"));
        adress2.sendKeys("Dhaka,Bangladesh");

        // city
        WebElement city = driver.findElement(By.id("city"));
        city.sendKeys("Dhaka");

        // State
        WebElement state = driver.findElement(By.id("id_state"));

        Select stateDropdown = new Select(state);
        stateDropdown.selectByIndex(8);


        // ZIP Code
        WebElement postCode = driver.findElement(By.id("postcode"));
        postCode.sendKeys("32118");

        // Additional Information
        WebElement textArea = driver.findElement(By.id("other"));
        textArea.sendKeys("Hi this is Ratul Hasan From Dhaka");

        // Home Phone
        WebElement homePhone = driver.findElement(By.id("phone"));
        homePhone.sendKeys("01828496307");

        // Mobile  Phone
        WebElement mobilePhone = driver.findElement(By.id("phone_mobile"));
        mobilePhone.sendKeys("01796063958");

        // Clear Assign an address alias for future reference. Text Input Box

        WebElement assignAddress = driver.findElement(By.id("alias"));
        assignAddress.clear();
        assignAddress.sendKeys("Pabna,Dhaka");


        // Click on Register Button
        WebElement registerButton = driver.findElement(By.id("submitAccount"));
        registerButton.click();




    }

}
