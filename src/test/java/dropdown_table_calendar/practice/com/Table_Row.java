 package dropdown_table_calendar.practice.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Row {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver ();
driver.get("https://www.w3schools.com/html/html_tables.asp");

//*[@id="customers"]/tbody/tr[1]/th[1]
//*[@id="customers"]/tbody/tr[2]/td[1]
//*[@id="customers"]/tbody/tr[3]/td[1]
//*[@id="customers"]/tbody/tr[4]/td[1]
//*[@id="customers"]/tbody/tr[5]/td[1]
//*[@id="customers"]/tbody/tr[6]/td[1]
//*[@id="customers"]/tbody/tr[7]/td[1]
List <WebElement> row = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr"));
String Beforexpath = "*[@id=\"customers\"]/tbody/tr[";
String Afterxpath = "]/td[1]";

for (int i=2; i<= row.size(); i++) {
	String Actualxpath = Beforexpath+i+Afterxpath;
	WebElement r = driver.findElement(By.xpath(Actualxpath));
	if(r.getText().contains("Ernst Handel")) {
		 System.out.println("Company name : " + r.getText()+ "is found at position" + i);
	}
}

for (int j=2; j<=row.size();j++) {
	String Actualxpath1 = Beforexpath + j + Afterxpath ;
	WebElement t = driver.findElement(By.xpath(Actualxpath1));
	if (t.getText().contains("Laughing Bacchus Winecellars")){
		System.out.println("Company name is :" + t + "is at position" + j);
	}
}

	}

}
