package dropdown_table_calendar.practice.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver ();
		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().window().maximize();
		WebElement drp = driver.findElement(By.xpath("//select[@id='option' and @name='option']"));
		Select option = new Select (drp);
		
		List<WebElement> list = option.getOptions();
		for(WebElement e : list) {
			if(e.getText().contains("Option 2")) {
				e.click();
				break;
			}
		}
		
		
		
	}

}
