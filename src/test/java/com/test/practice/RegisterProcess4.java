package com.test.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RegisterProcess4 {
	
	public WebDriver driver ;
	
	@BeforeMethod 
	@Parameters ({"url"})	
	public void Login (String url) {
		
driver = new ChromeDriver ();
driver.get(url);
driver.manage().window().maximize();
	}
  
    @Test
    @Parameters ({"fn","ln","email","telephone","password","confirmpassword"})
    
    public void Register1(String fn, String ln , String email ,String telephone , String password, String confirmpassword) throws InterruptedException {
    	Thread.sleep(5);
    	driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
    	driver.findElement(By.cssSelector("input#input-firstname")).sendKeys(fn);
    	driver.findElement(By.cssSelector("input#input-lastname")).sendKeys(ln);
    	driver.findElement(By.cssSelector("input#input-email")).sendKeys(email);
    	driver.findElement(By.cssSelector("input#input-telephone")).sendKeys(telephone);
    	driver.findElement(By.cssSelector("input#input-password")).sendKeys(password);
    	driver.findElement(By.cssSelector("input#input-confirm")).sendKeys(confirmpassword);
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

