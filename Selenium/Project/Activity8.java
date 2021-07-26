package seleniumactivities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity8 {
WebDriver driver;
	
    @BeforeMethod
    public void beforeMethod() {
       
    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\KhushbuSinha\\eclipse-workspace\\driver\\geckodriver.exe");
        driver = new FirefoxDriver();
        
      
        driver.get("https://alchemy.hguy.co/lms");
    }
    
    @Test
    public void exampleTestCase() {
        
        WebElement lnkMAcc = driver.findElement(By.xpath("//a[contains(text(),'Contact')]"));
        lnkMAcc.click();
        
       driver.findElement(By.xpath("//*[contains(text(),'Full Name ')]//following-sibling::input")).sendKeys("Khushbu Sinha");
       driver.findElement(By.xpath("//*[contains(text(),'Email ')]//following-sibling::input")).sendKeys("xyz@gmail.com");
       driver.findElement(By.xpath("//*[contains(text(),'Subject')]//following-sibling::input")).sendKeys("Computer Science");
       driver.findElement(By.xpath("//*[contains(text(),'Comment or Message ')]//following-sibling::textarea")).sendKeys("My input details");
       
       driver.findElement(By.xpath("//button[contains(text(),'Send Message')]")).click();
       
       String message = driver.findElement(By.xpath("//*[contains(text(),'Thanks for contacting us! We will be in touch with you shortly.')]")).getText();
       
       System.out.println("Message displayed after submission "+message);
       
     }

    @AfterMethod
    public void afterMethod() {
       
        driver.quit();
    }
}
