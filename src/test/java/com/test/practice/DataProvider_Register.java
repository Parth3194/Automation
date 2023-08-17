package com.test.practice;

import org.testng.annotations.DataProvider;

public class DataProvider_Register {
	
	@DataProvider(name ="Register1")
	
	public Object [][] getdata1(){
		
		Object [][] data = {{"Parth331", "Chauhan331", "parthc331@gmail.com", "1234567", "Parth@3194", "Parth@3194"},
		                     };
        return data;
                             }
	
	@DataProvider (name="Register2")
	
	public Object [][] getdata2() {
		
		Object[][] data = {{"Parth341", "Chauhan341", "parthc341@gmail.com", "1234567", "Parth@3194", "Parth@3194"},
		                   };
	    return data ;
	}

	@DataProvider (name="Register3")
	
public Object [][] getdata3(){
		
		Object [][] data = {{"Parth351", "Chauhan351", "parth351@gmail.com", "1234567", "Parth@3194", "Parth@3194"},
		                    };
		
		return data;
	}
	@DataProvider (name="Register4")
	
	public Object [][] getdata4 (){
			
			Object [][] data = {{"Parth381", "Chauhan381", "parthc381@gmail.com", "1234567", "Parth@3194", "Parth@3194"},
					           
			                    };
			
			return data;
		}
	@DataProvider (name="Register5")
	
	public Object [][] getdata5 (){
			
			Object [][] data = {{"Parth371", "Chauhan371", "parth371@gmail.com", "1234567", "Parth@3194", "Parth@3194"},
					            
			                   };
			
			return data;
		}
@DataProvider (name="Register6")
	
	public Object [][] getdata6 (){
			
			Object [][] data = {{"Parth361", "Chauhan361", "parthc361@gmail.com", "1234567", "Parth@3194", "Parth@3194"},
					            
			                    };
			
			return data;
		}
}

 
