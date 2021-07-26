package seleniumactivities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity7 {
WebDriver driver;
	
    @BeforeMethod
    public void beforeMethod() {
       
    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\KhushbuSinha\\eclipse-workspace\\driver\\geckodriver.exe");
        driver = new FirefoxDriver();
        
      
        driver.get("https://alchemy.hguy.co/lms");
    }
    
    @Test
    public void exampleTestCase() {
        
        WebElement lnkMAcc = driver.findElement(By.xpath("//a[contains(text(),'All Courses')]"));
        lnkMAcc.click();
        
        List<WebElement> allCourses = driver.findElements(By.xpath("//div/h3"));
        
        System.out.println("Number of courses on the page "+allCourses.size());
        
        
                    
        
       
    }

    @AfterMethod
    public void afterMethod() {
       
        driver.quit();
    }
}
