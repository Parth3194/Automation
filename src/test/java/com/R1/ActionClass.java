package com.R1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver ();
driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
//driver.get("https://demoqa.com/buttons");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//WebElement Rc = driver.findElement(By.id("rightClickBtn"));
//WebElement Dc = driver.findElement(By.id("doubleClickBtn"));
//WebElement si = driver.findElement(By.id("box3"));
WebElement si = driver.findElement(By.id("box7"));
WebElement ti = driver.findElement(By.id("box102"));
Actions ac = new Actions (driver);
ac.clickAndHold(si).moveToElement(ti).release().perform();
//rightClickBtn
//doubleClickBtn 

	}

}
