package seleniumactivities;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity9 {
	
WebDriver driver;
	
    @BeforeMethod
    public void beforeMethod() {
       
    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\KhushbuSinha\\eclipse-workspace\\driver\\geckodriver.exe");
        driver = new FirefoxDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://alchemy.hguy.co/lms");
        
    }
    @Test
    public void exampleTestCase() throws InterruptedException {
    	
    	
        
    	WebElement lnkMAcc = driver.findElement(By.xpath("//a[contains(text(),'All Courses')]"));
        lnkMAcc.click();
        
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@src='https://alchemy.hguy.co/lms/wp-content/uploads/2019/05/course-1-free-img-400x223.jpg']"))); 
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
        
       //WebElement courseLnk= driver.findElement(By.xpath("//img[@src='https://alchemy.hguy.co/lms/wp-content/uploads/2019/05/course-1-free-img-400x223.jpg']"));
       // Thread.sleep(6000);
        //courseLnk.click();
        
        
        Thread.sleep(6000);
        
        WebElement courseLnk = driver.findElement(By.xpath("//div[contains(text(),'Developing Strategy')]"));
        //courseLnk.click();
        
        WebDriverWait wwait = new WebDriverWait(driver, 10);
        WebElement ele = wwait.until(ExpectedConditions.visibilityOf(courseLnk)); 
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", ele);
        
        String pageTitle = driver.getTitle();
        
        System.out.println(pageTitle);
        
        Assert.assertEquals("Social Media Marketing – Alchemy LMS", pageTitle);
        
        
       
     }


	@AfterMethod
    public void afterMethod() {
       
        driver.quit();
    }
}
