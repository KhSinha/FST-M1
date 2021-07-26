package seleniumactivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity3 {
WebDriver driver;
	
    @BeforeMethod
    public void beforeMethod() {
       
    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\KhushbuSinha\\eclipse-workspace\\driver\\geckodriver.exe");
        driver = new FirefoxDriver();
        
      
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void exampleTestCase() {
        
        String infoboxTitle = driver.findElement(By.xpath("//*[contains(text(),'Actionable Training')]")).getText();
            
       
        System.out.println("Info Box Title is: " + infoboxTitle);
            
           
        Assert.assertEquals("Actionable Training", infoboxTitle);
                    
        
       
    }

    @AfterMethod
    public void afterMethod() {
       
        driver.quit();
    }
}
