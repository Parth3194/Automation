package com.test.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGpractice {
	public WebDriver driver ;
	@BeforeMethod
	public void loginrediff() {
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.rediff.com/");
	}
	
	@Test(priority=1)
	public void Login1 () throws InterruptedException {
		driver.findElement(By.xpath("//p[@id='signin_info']/a[@class='signin']")).click();
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		Thread.sleep(10);
		driver.findElement(By.className("rd_logout")).click();
		}
	@Test(priority=2)
	public void Login2 () throws InterruptedException {
		driver.findElement(By.xpath("//p[@id='signin_info']/a[@class='signin']")).click();
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda1@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Donkey@123");
		Thread.sleep(10);
		driver.findElement(By.className("rd_logout")).click();
		
	}
	@AfterMethod 
	public void teardown() {
		driver.quit();
	}
}
