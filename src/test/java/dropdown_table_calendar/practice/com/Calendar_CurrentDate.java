package dropdown_table_calendar.practice.com;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar_CurrentDate {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver ();
		Calendar calendar = Calendar.getInstance();
		driver.navigate().to("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();
		String targetdate = "08-01-2023";
		SimpleDateFormat targetdateformat = new SimpleDateFormat("mm-dd-yyyy");
		Date formattedTargetDate = targetdateformat.parse(targetdate);
		calendar.setTime(formattedTargetDate);
		int Targetday = calendar.get(calendar.DAY_OF_MONTH);
		int Targetmonth = calendar.get(calendar.MONTH);
		int Targetyear = calendar.get(calendar.YEAR);
		
		driver.findElement(By.id("second_date_picker")).click();
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,' ui-datepicker-other-month '))]//a[text()="+Targetday+"]")).click();
		
	}
	


}
