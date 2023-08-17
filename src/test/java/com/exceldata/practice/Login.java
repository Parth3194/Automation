package com.exceldata.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.test.practice.DPclass;

public class Login {
public WebDriver driver;
	@BeforeMethod 
    public void Login()
    {
    	driver = new ChromeDriver ();
    	driver.manage().window().maximize();
    	driver.get("https://tutorialsninja.com/demo/");
    }
    @Test(priority = 1, dataProvider = "TN" , dataProviderClass = ExcelData.class)
    public void Login1 (String username , String password){
    	driver.findElement(By.cssSelector("li.dropdown>a>:nth-of-type(1)+span")).click();
    	driver.findElement(By.cssSelector("ul.list-inline>li:nth-child(2)>ul:nth-child(2)>li:nth-child(2)>a")).click();
    	driver.findElement(By.cssSelector("input#input-email")).sendKeys(username);
    	driver.findElement(By.cssSelector("input#input-password")).sendKeys(password);
    	driver.findElement(By.cssSelector("input[value='Login']")).click();
    	 }
    
	@AfterMethod 
	public void teardown () {
		driver.quit();
	}
	
	
}
