package dropdown_table_calendar.practice.com;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 WebDriver driver = new ChromeDriver ();
 driver.get("https://testautomationpractice.blogspot.com/");
 driver.manage().window().maximize();
 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
 
 List<WebElement> row = driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr"));
 System.out.println(row.size());
 List<WebElement> col = driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr[1]//th"));
 System.out.println(col.size());
 
for (int r=2;r<=row.size();r++) {
 for (int c=1;c<=col.size();c++) {
String Data = driver.findElement(By.xpath("//table[@name='BookTable']//tbody//tr["+r+"]//td["+c+"]")).getText();
 System.out.println(Data);
 
 String BookName = "Learn Js";
 
 List <WebElement> bn = driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr//td[1]"));
 List <WebElement> price = driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr//td[4]"));
 
 for (int i=0;i<bn.size();i++) {
	 if (BookName.equals(bn.get(i).getText())){
		System.out.println(bn.get(i).getText()+ "---->"+ price.get(i).getText()); 
		break;
	 }
 }
	
}

}
	}
	}

