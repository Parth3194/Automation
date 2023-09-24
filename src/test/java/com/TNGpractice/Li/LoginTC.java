package com.TNGpractice.Li;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class LoginTC extends Report{
	
	public WebDriver driver;
		
	@BeforeMethod
	public void Login() 
	   {
		driver = new ChromeDriver ();
		driver.get("https://tutorialsninja.com/demo");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    }
	@Test(priority =1,dataProvider = "TN1" , dataProviderClass = MultipleDP.class)
	public void TNlogin1(String username, String pwd)
	   {
		test = extent.createTest("Verify successful login by positive data1").assignAuthor("Parth");
		test.info("User can sucessfully login the application with positive username and password");
		try {
			WebElement Myaccount = driver.findElement(By.linkText("My Account"));
			Myaccount.click();
			WebElement Login = driver.findElement(By.linkText("Login"));
			Login.click();
			WebElement email = driver.findElement(By.cssSelector("input#input-email"));
			email.sendKeys(username);
			WebElement password = driver.findElement(By.id("input-password"));
			password.sendKeys(pwd);
			WebElement login = driver.findElement(By.xpath("//input[@type='submit' and @value='Login']"));
			login.click();
			test.pass("Testcase is passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    }
	
	@Test(priority =2,dataProvider = "TN2" , dataProviderClass = MultipleDP.class)
	public void TNlogin2(String username, String pwd)
	   {
		test = extent.createTest("Verify successful login by positive data2");
		test.info("User can sucessfully login the application with positive username and password");
		try {
			WebElement Myaccount = driver.findElement(By.linkText("My Accoun"));
			Myaccount.click();
			WebElement Login = driver.findElement(By.linkText("Login"));
			Login.click();
			WebElement email = driver.findElement(By.cssSelector("input#input-email"));
			email.sendKeys(username);
			WebElement password = driver.findElement(By.id("input-password"));
			password.sendKeys(pwd);
			WebElement login = driver.findElement(By.xpath("//input[@type='submit' and @value='Login']"));
			login.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    }
	
	@Test(priority =2,dataProvider = "TN3" , dataProviderClass = MultipleDP.class, alwaysRun = true)
	public void TNlogin3(String username, String pwd)
	
	   {
		ExtentTest test = extent.createTest("Verify successful login by positive data3");
		test.info("User can sucessfully login the application with positive username and password");
		try {
			WebElement Myaccount = driver.findElement(By.linkText("My Account"));
			Myaccount.click();
			WebElement Login = driver.findElement(By.linkText("Login"));
			Login.click();
			WebElement email = driver.findElement(By.cssSelector("input#input-email"));
			email.sendKeys(username);
			WebElement password = driver.findElement(By.id("input-password"));
			password.sendKeys(pwd);
			WebElement login = driver.findElement(By.xpath("//input[@type='submit' and @value='Login']"));
			login.click();
			test.pass("Testcase is passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
	    }
	
	@AfterMethod
	public void teardown() 
	   {
		driver.quit();
	   }

	    }
