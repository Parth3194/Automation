package com.R2;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DP {

	@DataProvider (name = "TN")
	public Object [][] getdata(Method name){
		System.out.println("Testcase use the data : " + name.getName());
		Object [][] data = new Object [2][2];
		data [0][0] = "parthc341@gmail.com";
		data[0][1] = "Parth@3194";	
		
		data[1][0] ="parthc331@gmail.com";
		data[1][1] ="Parth@3194";
		return data;
	}
	
	
}
