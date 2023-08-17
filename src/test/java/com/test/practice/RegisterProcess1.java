package com.test.practice;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterProcess1 {
	
	public WebDriver driver ;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	@BeforeMethod 
	
	public void Login() {
		driver = new ChromeDriver ();
    	driver.get("https://tutorialsninja.com/demo/");
    	driver.manage().window().maximize();
	}
	
  
    @Test (priority = 1, dataProvider = "Register1", dataProviderClass = DataProvider_Register.class )
    
   
    public void Register1(String fn, String ln , String em ,String tel , String pw, String cpw) throws InterruptedException  {
    	Thread.sleep(5);
    	WebElement account = driver.findElement(By.linkText("My Account"));
    	wait.until(ExpectedConditions.elementToBeClickable(account)).click();
		driver.findElement(By.linkText("Register")).click();
    	/*driver.findElement(By.cssSelector("li.dropdown>a>i+span")).click();
    	driver.findElement(By.cssSelector("li[class='dropdown open']>a+ul>li>a")).click();*/
    	driver.findElement(By.cssSelector("input#input-firstname")).sendKeys(fn);
    	driver.findElement(By.cssSelector("input#input-lastname")).sendKeys(ln);
    	driver.findElement(By.cssSelector("input#input-email")).sendKeys(em);
    	driver.findElement(By.cssSelector("input#input-telephone")).sendKeys(tel);
    	driver.findElement(By.cssSelector("input#input-password")).sendKeys(pw);
    	driver.findElement(By.cssSelector("input#input-confirm")).sendKeys(cpw);
    	driver.findElement(By.cssSelector("input[type='radio'][value='1'][name='newsletter']")).click();
    	driver.findElement(By.cssSelector("div.pull-right>a.agree:nth-of-type(1)+input[name='agree']")).click();
    	driver.findElement(By.cssSelector("input[value='Continue']")).click();
    	driver.findElement(By.cssSelector("li.dropdown>a>i+span")).click(); 
    	driver.findElement(By.cssSelector("ul.list-inline>li:nth-child(2)>a+ul>li:nth-child(5)>a")).click();
    	
}	
    

   @Test (priority =2, dataProvider = "Register2" , dataProviderClass = DataProvider_Register.class)
   
   public void Register2 (String fn, String ln , String em ,String tel , String pw, String cpw)
   {
	driver.findElement(By.linkText("My Account")).click();
    driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.cssSelector("input#input-firstname")).sendKeys(fn);
	driver.findElement(By.cssSelector("input#input-lastname")).sendKeys(ln);
	driver.findElement(By.cssSelector("input#input-email")).sendKeys(em);
	driver.findElement(By.cssSelector("input#input-telephone")).sendKeys(tel);
	driver.findElement(By.cssSelector("input#input-password")).sendKeys(pw);
	driver.findElement(By.cssSelector("input#input-confirm")).sendKeys(cpw);
	driver.findElement(By.cssSelector("input[type='radio'][value='1'][name='newsletter']")).click();
	driver.findElement(By.cssSelector("div.pull-right>a.agree:nth-of-type(1)+input[name='agree']")).click();
	driver.findElement(By.cssSelector("input[value='Continue']")).click();
	driver.findElement(By.cssSelector("li.dropdown>a>i+span")).click(); 
	driver.findElement(By.cssSelector("ul.list-inline>li:nth-child(2)>a+ul>li:nth-child(5)>a")).click();
   	
}
    @AfterMethod 
    
    public void teardown() {
    	driver.quit();
    }
	   }

