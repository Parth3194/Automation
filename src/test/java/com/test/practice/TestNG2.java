package com.test.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG2 {

public WebDriver driver ;
	
    @BeforeMethod 
    public void Login ()
    {
    	driver = new ChromeDriver ();
    	driver.manage().window().maximize();
    	driver.get("https://tutorialsninja.com/demo/");
    }
    @Test(priority = 1)
    public void Login1 (){
    	driver.findElement(By.cssSelector("li.dropdown>a>:nth-of-type(1)+span")).click();
    	driver.findElement(By.cssSelector("ul.list-inline>li:nth-child(2)>ul:nth-child(2)>li:nth-child(2)>a")).click();
    	driver.findElement(By.cssSelector("input#input-email")).sendKeys("javaV928@sele.com");
    	driver.findElement(By.cssSelector("input#input-password")).sendKeys("Vipula@3194");
    	driver.findElement(By.cssSelector("input[value='Login']")).click();
    	 }
    
    @Test (priority=2) 
    public void Login2 (){
    	driver.findElement(By.cssSelector("li.dropdown>a>i+span")).click();
    	driver.findElement(By.cssSelector("li.dropdown>ul:nth-child(2)>li:nth-of-type(2)>a")).click();
        driver.findElement(By.cssSelector("input#input-email[name='email']")).sendKeys("javaV97@sele.com");
    	driver.findElement(By.cssSelector("input#input-password[name='password']")).sendKeys("Vipula@3194");
    	driver.findElement(By.cssSelector("input[value='Login'][type='submit']")).click();
    }
    @Test (priority=3)
    public void Login3 (){
    	driver.findElement(By.cssSelector("li.dropdown>a>i+span[class='hidden-xs hidden-sm hidden-md']")).click();
    	driver.findElement(By.cssSelector("a[href='https://tutorialsninja.com/demo/index.php?route=account/login']")).click();
    	driver.findElement(By.cssSelector("input[name='email']")).sendKeys("javaV96@sele.com");
    	driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Vipula@3194");
    	driver.findElement(By.cssSelector("input[type='submit']")).click();
    }
 @AfterMethod 
 
 public void teardown() {
	 driver.quit();
 }    	}


