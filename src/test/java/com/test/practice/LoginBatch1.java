package com.test.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginBatch1 {

public WebDriver driver ;
	
    @BeforeMethod 
    public void Login ()
    {
    	driver = new ChromeDriver ();
    	driver.manage().window().maximize();
    	driver.get("https://tutorialsninja.com/demo/");
    }
    @Test(priority = 1, dataProvider = "Login1" , dataProviderClass = DPclass.class)
    public void Login1 (String email, String password){
    	driver.findElement(By.cssSelector("li.dropdown>a>:nth-of-type(1)+span")).click();
    	driver.findElement(By.cssSelector("ul.list-inline>li:nth-child(2)>ul:nth-child(2)>li:nth-child(2)>a")).click();
    	driver.findElement(By.cssSelector("input#input-email")).sendKeys(email);
    	driver.findElement(By.cssSelector("input#input-password")).sendKeys(password);
    	driver.findElement(By.cssSelector("input[value='Login']")).click();
    	 }
    
    @Test (priority=2) 
    public void Login2 (String email, String password){
    	driver.findElement(By.cssSelector("li.dropdown>a>i+span")).click();
    	driver.findElement(By.cssSelector("li.dropdown>ul:nth-child(2)>li:nth-of-type(2)>a")).click();
        driver.findElement(By.cssSelector("input#input-email[name='email']")).sendKeys(email);
    	driver.findElement(By.cssSelector("input#input-password[name='password']")).sendKeys(password);
    	driver.findElement(By.cssSelector("input[value='Login'][type='submit']")).click();
    
    }
 @AfterMethod 
 
 public void teardown() {
	 driver.quit();

}
}
