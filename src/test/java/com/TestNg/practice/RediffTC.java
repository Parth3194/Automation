package com.TestNg.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RediffTC {

	public WebDriver driver;
	
	@BeforeMethod
	
	public void LaunchURL() 
	    {
		driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }

@Test(groups= {"smoke"}, dataProvider = "rediff1", dataProviderClass = MultipleDP.class)
public void Login(String un ,String pwd) {
	WebElement signin = driver.findElement(By.linkText("Sign in"));
	signin.click();
    WebElement username = driver.findElement(By.id("login1"));
    username.sendKeys(un);
    WebElement password = driver.findElement(By.id("password"));
    password.sendKeys(pwd);
    WebElement login = driver.findElement(By.className("signinbtn"));
    login.click();
}
@Test(groups= {"SIT"},dataProvider = "rediff2", dataProviderClass = MultipleDP.class)
public void Login1(String un, String pwd) 
    {
	WebElement signin = driver.findElement(By.linkText("Sign in"));
	signin.click();
    WebElement username = driver.findElement(By.id("login1"));
    username.sendKeys(un);
    WebElement password = driver.findElement(By.id("password"));
    password.sendKeys(pwd);
    WebElement login = driver.findElement(By.className("signinbtn"));
    login.click();
    }

@AfterMethod
public void teardown() {
	driver.quit();
}
}


