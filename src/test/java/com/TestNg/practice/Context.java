package com.TestNg.practice;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class Context {
	
	@Test
	public void method1 (ITestContext context) {
		context.setAttribute("Name", "Parth");
		System.out.println("Hi");
	}
@Test
public void method2 (ITestContext context) {
	String a = (String)context.getAttribute("Name");
	System.out.println(a);
	
	
}

}
