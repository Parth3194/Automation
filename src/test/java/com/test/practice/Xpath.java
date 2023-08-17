package com.test.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");


		// ancestor - grandfathers \
		// parent
		//preceding
		//sibling - preceding 
		//child --- element 
		//following - sibling
		//sibling
		//descendant 

		//Create Account 
		//parent to child - driver.findElement(By.xpath("//p[@id='signin_info']/child::a[contains(text(),'Create Account')]")).click(); 
		//following sibling - driver.findElement(By.xpath("//a[text()='Sign in']/following-sibling::a[text()='Create Account']")).click();
		//preceding - driver.findElement(By.xpath("//div[starts-with(@id,'div_advt_x')]/preceding::a[text()='Create Account']")).click();
		//descendant - driver.findElement(By.xpath("//div[(@class='logobar')]/descendant::a[text()='Create Account']")).click();
		//following - driver.findElement(By.xpath("//span[(@class='username')]/following::a[text()='Create Account']")).click();
		//ancestor  - driver.findElement(By.xpath("//form[@id="queryTop"]/ancestor::div[@class="srchbar clear-fix relative"]/preceding::a[text()='Create Account']")).click();
		//preceding sibling - driver.findElement(By.xpath("//div[@class='srchbar clear-fix relative']/preceding-sibling::div[@class='logobar']/descendant::a[text()='Create Account']")

		//Shopping link
		//parent - driver.findElement(By.xpath("//div[@class='cell topicons']/child::a[@class='shopicon relative']")).click();
		//following sibling - driver.findElement(By.xpath("//a[@class='vdicon']/following-sibling::a[@class='shopicon relative']")).click();
		//following - driver.findElement(By.xpath("//div[@class='cell']/following::a[@class='shopicon relative']")).click();
		//preceding - driver.findElement(By.xpath("//div[@class='cell alignR toprlinks']/preceding::a[@class='shopicon relative']")).click();
		//descendant - driver.findElement(By.xpath("//div[@class='logobar']/descendant::a[@class='shopicon relative']")).click();
		//ancestor - driver.findElement(By.xpath("//div[@id='div_advt_right']/ancestor::div[@id='red_container_main']/preceding::a[@class='shopicon relative']")).click();

		//Videos link
		//parent - driver.findElement(By.xpath("//div[@class='cell topicons']/child::a[@class='vdicon']")).click();
		//preceding-sibling - driver.findElement(By.xpath("//a[@class='shopicon relative']/preceding-sibling::a[@class='vdicon']")).click();
		//following-sibling - driver.findElement(By.xpath("//a[@class='bmailicon relative']/following-sibling::a[@class='vdicon']")).click();
		//ancestor - driver.findElement(By.xpath("//div[@id='div_advt_right']/ancestor::div[@id='red_container_main']/preceding::a[@class='vdicon']")).click();
		//descendant - driver.findElement(By.xpath("//div[@class='logobar']/descendant::a[@class='vdicon']")).click();
		//following - driver.findElement(By.xpath("//div[@class='cell']/following::a[@class='vdicon']")).click();

		//Business Email
		//parent - driver.findElement(By.xpath("//div[@class='cell topicons']/child::a[@class='bmailicon relative']")).click();
		//preceding-sibling - driver.findElement(By.xpath("//a[@class='vdicon']/preceding-sibling::a[@class='bmailicon relative']")).click();
		//following-sibling- driver.findElement(By.xpath("//a[@class='mailicon']/following-sibling::a[@class='bmailicon relative']")).click();
		//ancestor - driver.findElement(By.xpath("//div[@id='div_advt_right']/ancestor::div[@id='red_container_main']/preceding::a[@class='bmailicon relative']")).click();
		//descendant - driver.findElement(By.xpath("//div[@class='logobar']/descendant::a[@class='bmailicon relative']")).click();
		//following - driver.findElement(By.xpath("//div[@class='cell']/following::a[@class='bmailicon relative']")).click();

		//Money
		//parent - driver.findElement(By.xpath("//div[@class='cell topicons']/child::a[@class='moneyicon relative']")).click(); 
		//preceding-sibling - driver.findElement(By.xpath("//a[@class='vdicon']/preceding-sibling::a[@class='moneyicon relative']")).click();
		//following-sibling- driver.findElement(By.xpath("//a[@class='mailicon']/following-sibling::a[@class='moneyicon relative']")).click();
		//ancestor - driver.findElement(By.xpath("//div[@id='div_advt_right']/ancestor::div[@id='red_container_main']/preceding::a[@class='moneyicon relative']")).click();
		//descendant - driver.findElement(By.xpath("//div[@class='logobar']/descendant::a[@class='moneyicon relative']")).click();
		//following - driver.findElement(By.xpath("//div[@class='cell']/following::a[@class='moneyicon relative']")).click();

		//Rediffmail
		//parent - driver.findElement(By.xpath("//div[@class='cell topicons']/child::a[@class='mailicon']")).click(); 
		//preceding-sibling - driver.findElement(By.xpath("//a[@class='moneyicon relative']/preceding-sibling::a[@class='mailicon']")).click();
		//ancestor - driver.findElement(By.xpath("//div[@id='div_advt_right']/ancestor::div[@id='red_container_main']/preceding::a[@class='mailicon']")).click();
		//descendant - driver.findElement(By.xpath("//div[@class='logobar']/descendant::a[@class='mailicon']")).click();
		//following - driver.findElement(By.xpath("//div[@class='cell']/following::a[@class='mailicon']")).click();

	}

}
