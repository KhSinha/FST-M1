package seleniumactivities;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Activity1 {
    
	WebDriver driver;
	
    @BeforeMethod
    public void beforeMethod() {
       
    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\KhushbuSinha\\eclipse-workspace\\driver\\geckodriver.exe");
        driver = new FirefoxDriver();
        
      
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void exampleTestCase() {
        
        String title = driver.getTitle();
            
       
        System.out.println("Page title is: " + title);
            
           
        Assert.assertEquals("Alchemy LMS – An LMS Application", title);
                    
        
       
    }

    @AfterMethod
    public void afterMethod() {
       
        driver.quit();
    }

}