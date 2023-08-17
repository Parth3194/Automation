package dropdown_table_calendar.practice.com;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://www.amazon.ca/?tag=hydcaabkg-20&hvadid=317549713801&hvpos=&hvnetw=g&hvrand=967119407393483795&hvpone=&hvptwo=&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9000845&hvtargid=kwd-360364908397&ref=pd_sl_2g3jlg2slz_e&hydadcr=20061_10818755");
driver.manage().window().maximize();
driver.findElement(By.id("twotabsearchtextbox")).click();
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("airpods");
driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ARROW_DOWN);
driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
}
}