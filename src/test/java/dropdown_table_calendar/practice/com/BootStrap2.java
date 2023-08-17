package dropdown_table_calendar.practice.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrap2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();
		List <WebElement> list = driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li//a//label"));
		for(int i =0; i<= list.size();i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("Java")){
			list.get(i).click();
			break;
			}
	
	
		}
		}
}




