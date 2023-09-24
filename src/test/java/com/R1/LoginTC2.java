package com.R1;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTC2 {
	
	public WebDriver driver;
	Properties prop = new Properties ();
    FileInputStream fis ; 

	
	@BeforeMethod
	public void Login() throws IOException 
	   {
		fis = new FileInputStream("C:\\Users\\parth\\eclipse-workspace\\Automation_practice\\src\\test\\java\\com\\R1\\properties.file");
		prop.load(fis);
	    driver = new ChromeDriver ();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   }
	@Test()
	public void TNlogin1()
	{
		WebElement Myaccount = driver.findElement(By.linkText("My Account"));
	    Myaccount.click();
	    WebElement Login = driver.findElement(By.linkText("Login"));
	    Login.click();
	    WebElement email = driver.findElement(By.cssSelector("input#input-email"));
	    email.sendKeys(prop.getProperty("username"));
	    WebElement password = driver.findElement(By.id("input-password"));
	    password.sendKeys(prop.getProperty("pwd"));
	    WebElement login = driver.findElement(By.xpath("//input[@type='submit' and @value='Login']"));
	    login.click();
	    }

	
	@AfterMethod
	public void teardown() 
	   {
		driver.close();
	   }
	    }
