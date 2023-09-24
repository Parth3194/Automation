package com.package2.suiterun;

import org.testng.annotations.DataProvider;

public class MultipleDP {
	@DataProvider(name = "TN1")
 public Object [][] getdata(){
	 Object [][]data = {{"parthc341@gmail.com","Parth@3194"}};
	 return data;
 }
 
	@DataProvider(name="TN2")
 public Object [][] getdata1(){
	 Object data [][]= {{"parthc341@gmail.com","Parth@3194"}};
	 return data;
	}
	 @DataProvider(name="TN3")
	 public Object [][] getdata2(){
		 Object data [][]= {{"parthc341@gmail.com","Parth@3194"}};
		 return data;
 }
	 @DataProvider (name = "rediff1")
	 public Object [][] inputdata(){
		 Object [][] data = {{"seleniumpanda@rediffmail.com" , "Selenium@123"}};
		 return data;
	 }
	 
	 @DataProvider(name = "rediff2")
	 public Object [][] inputdata1(){
		 Object [][] data = {{"seleniumpanda@rediffmail.com", "Donkey@123"}};
		 return data;
	 }
		 
		 
	 }
	 

