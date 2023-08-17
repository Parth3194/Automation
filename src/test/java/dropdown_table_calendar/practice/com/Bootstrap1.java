package dropdown_table_calendar.practice.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver ();
driver.get("https://www.hdfcbank.com/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//a[@class='btn-primary dropdown-toggle btn-block' and text()='Select Product Type']")).click();
driver.findElement(By.xpath("//li[text()='Accounts']")).click();
	}

}
