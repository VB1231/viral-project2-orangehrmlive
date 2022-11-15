import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class OrangeHrmEdge {
    public static void main(String[] args) {
        String baseUrl="https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.edge.driver","driver/msedgedriver.exe");
        WebDriver driver =new EdgeDriver();
        driver.get(baseUrl);
        //maximise the screen
        driver.manage().window().maximize();
        //time delay
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get current url
        System.out.println(driver.getCurrentUrl());
        //get page source
        System.out.println(driver.getPageSource());
        //get title
        System.out.println(driver.getTitle());
        //set userid
        WebElement userField= driver.findElement(By.name("username"));
        userField.sendKeys("Admin");
        //set password
        WebElement passwordField= driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");
        //close browser
        driver.quit();
    }
}
