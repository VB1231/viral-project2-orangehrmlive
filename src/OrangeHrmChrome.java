import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class OrangeHrmChrome {
    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        //create the refrence variable
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        //maximise the screen
        driver.manage().window().maximize();
        //time to delay page
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //get the url
        System.out.println(driver.getCurrentUrl());
        //get the source
        System.out.println(driver.getPageSource());
        //page title
        System.out.println(driver.getTitle());
        //set username
        WebElement userField = driver.findElement(By.name("username"));
        userField.sendKeys("Admin");
        //set the  password
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");
        //close browser
        driver.quit();
    }
}
