package com.R1;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reports {

	
	@Test
	
	public void extentreports () {
		
ExtentReports extent = new ExtentReports ();
ExtentSparkReporter spark = new ExtentSparkReporter("target/spark.html");
spark.config().setReportName("Reporting of test");
spark.config().setDocumentTitle("Project Name_Jira Story");
spark.config().setTheme(Theme.DARK);
spark.config().setEncoding("utf-8");
extent.attachReporter(spark);


	}
}
