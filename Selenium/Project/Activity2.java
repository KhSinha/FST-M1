package seleniumactivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2 {
WebDriver driver;
	
    @BeforeMethod
    public void beforeMethod() {
       
    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\KhushbuSinha\\eclipse-workspace\\driver\\geckodriver.exe");
        driver = new FirefoxDriver();
        
      
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void exampleTestCase() {
        
        String heading = driver.findElement(By.xpath("//*[contains(text(),'Learn from Industry Experts')]")).getText();
        
            
       
        System.out.println("Page heading is: " + heading);
            
           
        Assert.assertEquals("Learn from Industry Experts", heading);
                    
        
       
    }

    @AfterMethod
    public void afterMethod() {
       
        driver.quit();
    }
}
