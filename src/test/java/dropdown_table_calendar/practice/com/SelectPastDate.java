package dropdown_table_calendar.practice.com;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectPastDate {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver ();
driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
driver.manage().window().maximize();
Calendar calendar = Calendar.getInstance();
String targetdate = "11-08-2022";
SimpleDateFormat dateformate = new SimpleDateFormat ("mm-dd-yyy");
Date formattedTargetDate = dateformate.parse(targetdate);
calendar.getTime();
int targetday = calendar.get(calendar.DAY_OF_MONTH);
int targetmonth = calendar.get(calendar.MONTH);
int targetyear = calendar.get(calendar.YEAR);
driver.findElement(By.id("second_date_picker")).click();
String actualdate = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
SimpleDateFormat dateformate1 = new SimpleDateFormat ("MMM yyyy");
Date FormatedtargetDate1 = dateformate1.parse(actualdate);
calendar.setTime(FormatedtargetDate1);

int actualmonth = calendar.get(calendar.MONTH);
int actualyear = calendar.get(calendar.YEAR);

while(targetmonth > actualmonth || targetyear > actualyear) {
	driver.findElement(By.xpath("//a[@class='ui-datepicker-prev ui-corner-all']")).click();
	actualdate = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
	dateformate1 = new SimpleDateFormat ("MMM yyyy");
	FormatedtargetDate1 = dateformate1.parse(actualdate);
	calendar.setTime(FormatedtargetDate1);

	actualmonth = calendar.get(calendar.MONTH);
	actualyear = calendar.get(calendar.YEAR);
	
}
	
	driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,' ui-datepicker-other-month '))]//a[text()="+targetday+"]")).click();
	

}


	}

 
