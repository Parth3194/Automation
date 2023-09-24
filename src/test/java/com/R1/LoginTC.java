package com.R1;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTC {
	
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
	    }
	
	@Test(priority =2,dataProvider = "TN2" , dataProviderClass = MultipleDP.class, enabled = false)
	public void TNlogin2(String username, String pwd)
	   {
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
	    }
	
	@Test(priority =2,dataProvider = "TN3" , dataProviderClass = MultipleDP.class, alwaysRun = true)
	public void TNlogin3(String username, String pwd)
	   {
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
	    }
	
	@AfterMethod
	public void teardown() 
	   {
		driver.close();
	   }
	    }
