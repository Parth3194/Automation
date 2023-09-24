package com.TNGpractice.Li;

import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Report {
	ExtentReports extent = new ExtentReports ();
	ExtentSparkReporter spark = new ExtentSparkReporter("target/spark2.html");
    ExtentTest test;
@BeforeSuite
	
	public void reportsetup() {
		spark.config().setReportName("Reporting of test");
		spark.config().setDocumentTitle("Project Name_Jira Story");
		spark.config().setTheme(Theme.DARK);
		spark.config().setEncoding("utf-8");
		extent.attachReporter(spark);
	
}

@BeforeMethod

public void getstatus(ITestResult result) {
	if (result.getStatus()==ITestResult.SUCCESS) {
	test.pass("Testcase is passed");
	}
	
	else if(result.getStatus()==ITestResult.FAILURE){
		test.fail(result.getThrowable());
		test.fail("Testcase is failed");
	}
	
	else{
		test.skip(result.getThrowable());
		test.skip("Testcase is skipped");
	}
}

@AfterSuite

public void flush() {
	extent.flush();
}
}
