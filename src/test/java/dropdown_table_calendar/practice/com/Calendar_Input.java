package dropdown_table_calendar.practice.com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar_Input {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver ();
driver.navigate().to("https://www.hyrtutorials.com/p/calendar-practice.html");
driver.manage().window().maximize();
Calendar calendar = Calendar.getInstance();
String targetdate = "08-08-2023";
SimpleDateFormat targetdateformat = new SimpleDateFormat ("dd-mm-yyyy");
Date formattedTargetDate = targetdateformat.parse(targetdate);
//calendar.setTime(formattedTargetDate);
System.out.println(formattedTargetDate);

	}

}
