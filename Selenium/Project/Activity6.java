package seleniumactivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity6 {
WebDriver driver;
	
    @BeforeMethod
    public void beforeMethod() {
       
    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\KhushbuSinha\\eclipse-workspace\\driver\\geckodriver.exe");
        driver = new FirefoxDriver();
        
      
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void exampleTestCase() {
        
        WebElement lnkMAcc = driver.findElement(By.xpath("//a[contains(text(),'My Account')]"));
        lnkMAcc.click();
        
        String title = driver.getTitle();
            
       
        System.out.println("My Account title is: " + title);
            
           
        Assert.assertEquals("My Account – Alchemy LMS", title);
        
        WebElement btn = driver.findElement(By.xpath("//a[@href='#login']"));
        btn.click();
        
        driver.findElement(By.id("user_login")).sendKeys("root");
        driver.findElement(By.id("user_pass")).sendKeys("​pa$$w0rd");
        
        driver.findElement(By.id("wp-submit")).click();
        
        String pageTitle = driver.getTitle();
        
        Assert.assertEquals("My Account – Alchemy LMS",pageTitle);
                    
        
       
    }

    @AfterMethod
    public void afterMethod() {
       
        driver.quit();
    }
}
