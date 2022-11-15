import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class OrangeHrmFirerFox {
    public static void main(String[] args) {
        String baseUrl="https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.gheko.driver","driver/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get(baseUrl);
        //maximise the screen
        driver.manage().window().maximize();
        //set time delay
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get current url
        System.out.println(driver.getCurrentUrl());
        //get page source
        System.out.println(driver.getPageSource());
        //get title
        System.out.println(driver.getTitle());
        //set the username
        WebElement userField= driver.findElement(By.name("username"));
        userField.sendKeys("Admin");
        //set the password
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");
        //close browser
        driver.quit();
    }
}
