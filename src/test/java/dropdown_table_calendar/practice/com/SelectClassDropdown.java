package dropdown_table_calendar.practice.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver ();
		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().window().maximize();
		WebElement drp = driver.findElement(By.xpath("//select[@id='option' and @name='option']"));
		drp.click();
	    Select cdrp = new Select (drp);
	    cdrp.selectByIndex(1);
	    
	    cdrp.selectByValue("option 1");
	    
	    cdrp.selectByVisibleText("Option 3");
	   
	}

}
