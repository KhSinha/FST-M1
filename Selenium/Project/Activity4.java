package seleniumactivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity4 {
WebDriver driver;
	
    @BeforeMethod
    public void beforeMethod() {
       
    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\KhushbuSinha\\eclipse-workspace\\driver\\geckodriver.exe");
        driver = new FirefoxDriver();
        
      
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void exampleTestCase() {
        
        String mostpopularTitle = driver.findElement(By.xpath("//*[contains(text(),'Email Marketing Strategies')]")).getText();
            
       
        System.out.println("Most popular Title is: " + mostpopularTitle);
            
           
        Assert.assertEquals("Email Marketing Strategies", mostpopularTitle);
                    
        
       
    }

    @AfterMethod
    public void afterMethod() {
       
        driver.quit();
    }
}
