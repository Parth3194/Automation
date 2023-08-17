package com.test.practice;

import org.testng.annotations.DataProvider;

public class DPclass {

	@DataProvider(name = "Login1")
	public Object [][] getlogindata1(){
		Object[] []  data= {{"seleniumpanda4567@gmail.com","Selenium@123"},{"java96111@sele.com","Parth@3194"}};
		return data;
	}
		@DataProvider(name = "Login2")
		public Object [][] getlogindata2(){
			Object[] []  data= {{"seleniumpanda4567@gmail.com","Selenium@123"},{"java9281111@sele.com","Parth@3194"}};
			return data;
		}
			
			@DataProvider(name = "Login3")
			public Object [][] getlogindata3(){
				Object[] []  data= {{"seleniumpanda4567@gmail.com","Selenium@123"},{"java9711113@sele.com","Parth@3194"}};
				return data;
	}
}
