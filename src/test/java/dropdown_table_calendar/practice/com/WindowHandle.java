package dropdown_table_calendar.practice.com;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		String p1 = driver.getWindowHandle();
		System.out.println(p1);
		WebElement link = driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']"));
		link.click();
		Set <String> list = driver.getWindowHandles();
		Iterator <String> it = list.iterator();
		String par = it.next();
		String child = it.next();
		
		driver.switchTo().window(child);
		
		
		
		
	}

}
