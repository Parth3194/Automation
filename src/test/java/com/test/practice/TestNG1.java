package com.test.practice;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG1 {
	
	public WebDriver driver ;
	
    @BeforeMethod 
    public void Login ()
    {
    	driver = new ChromeDriver ();
    	driver.manage().window().maximize();
    	driver.get("https://tutorialsninja.com/demo/");
    }
    @Test(priority = 1)
    public void RG1 () throws InterruptedException {
    	Thread.sleep(5);
    	driver.findElement(By.cssSelector("li.dropdown>a>i+span")).click();
    	driver.findElement(By.cssSelector("li[class='dropdown open']>a+ul>li>a")).click();
    	driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Vipula1");
    	driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Vipula3");
    	driver.findElement(By.cssSelector("input#input-email")).sendKeys("javaV96@sele.com");
    	driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("12345678");
    	driver.findElement(By.cssSelector("input#input-password")).sendKeys("Vipula@3194");
    	driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("Vipula@3194");
    	driver.findElement(By.cssSelector("input[type='radio'][value='1'][name='newsletter']")).click();
    	driver.findElement(By.cssSelector("div.pull-right>a.agree:nth-of-type(1)+input[name='agree']")).click();
    	driver.findElement(By.cssSelector("input[value='Continue']")).click();
    	driver.findElement(By.cssSelector("li.dropdown>a>i+span")).click(); 
    	driver.findElement(By.cssSelector("ul.list-inline>li:nth-child(2)>a+ul>li:nth-child(5)>a")).click();
    	
    }
    
    @Test (priority=2) 
    public void Register2 () throws InterruptedException {
    	Thread.sleep(5);
    	driver.findElement(By.cssSelector("li.dropdown>a>i+span")).click();
    	driver.findElement(By.cssSelector("li[class='dropdown open']>a+ul>li>a")).click();
    	driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Vipula2");
    	driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Vipula13");
    	driver.findElement(By.cssSelector("input#input-email")).sendKeys("javaV97@sele.com");
    	driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("12345678");
    	driver.findElement(By.cssSelector("input#input-password")).sendKeys("Vipula@3194");
    	driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("Vipula@3194");
    	driver.findElement(By.cssSelector("input[value='1'][name='newsletter']")).click();
    	driver.findElement(By.cssSelector("div.pull-right>a.agree:nth-of-type(1)+input[name='agree']")).click();
    	driver.findElement(By.cssSelector("input[value='Continue']")).click();
    	driver.findElement(By.cssSelector("li.dropdown>a>i+span")).click(); 
    	driver.findElement(By.cssSelector("ul.list-inline>li:nth-child(2)>a+ul>li:nth-child(5)>a")).click();
    	
    }
    @Test (priority=3)
    public void Register3 () throws InterruptedException {
    	Thread.sleep(5);
    	driver.findElement(By.cssSelector("li.dropdown>a>i+span[class='hidden-xs hidden-sm hidden-md']")).click();
    	driver.findElement(By.cssSelector("a[href='https://tutorialsninja.com/demo/index.php?route=account/register']")).click();
    	driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Vipula3");
    	driver.findElement(By.cssSelector("input.form-control#input-lastname")).sendKeys("Vipula12");
    	driver.findElement(By.cssSelector("input[name='email']")).sendKeys("javaV928@sele.com");
    	driver.findElement(By.cssSelector("input[name='telephone']")).sendKeys("12345678");
    	driver.findElement(By.cssSelector("input#input-password")).sendKeys("Vipula@3194");
    	driver.findElement(By.cssSelector("input[name='confirm']")).sendKeys("Vipula@3194");
    	driver.findElement(By.cssSelector("label.radio-inline:nth-child(1) > input")).click();
    	driver.findElement(By.cssSelector("input[type='checkbox'][value='1']")).click();
    	driver.findElement(By.cssSelector("input[class*=btn][value='Continue']")).click();
    	driver.findElement(By.cssSelector("li.dropdown>a>i+span")).click(); 
    	driver.findElement(By.cssSelector("ul.list-inline>li:nth-child(2)>a+ul>li:nth-child(5)>a")).click(); 
    }
 @AfterMethod 
 
 public void teardown() {
	 driver.quit();
 }
    

}
