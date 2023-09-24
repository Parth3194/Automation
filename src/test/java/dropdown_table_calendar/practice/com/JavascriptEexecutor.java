package dropdown_table_calendar.practice.com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavascriptEexecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions op = new ChromeOptions ();
	WebDriver driver = new ChromeDriver(op);
	op.addArguments("--start.maximized");
//driver.get("https://testautomationpractice.blogspot.com/");
//driver.get("https://the-internet.herokuapp.com/javascript_alerts");
JavascriptExecutor jse = (JavascriptExecutor) driver;
//jse.executeScript("window.scrollBy(0,500)");
//jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//WebElement submit = driver.findElement(By.xpath("//input[@type='submit' and @name='Submit']"));
//jse.executeScript("arguments[0].scrollIntoView",submit);
//WebElement button = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
//button.click();
//Alert alert = driver.switchTo().alert();
//System.out.println(alert.getText());
//alert.sendKeys("Hi, I am Parth");
//alert.accept();

//driver.get("https://the-internet.herokuapp.com/basic_auth");
//https://username:password@url
driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
