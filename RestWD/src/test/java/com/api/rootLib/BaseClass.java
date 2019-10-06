package com.api.rootLib;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import static io.restassured.RestAssured.*;

public class BaseClass {
	
 public ApiConfig conf= new ApiConfig();
 public ExtentHtmlReporter htmlReporter;
 public ExtentReports extent;
 public ExtentTest logger;
 
 @BeforeSuite
 public void beforeSuite()
 {
	 baseURI = "http://dummy.restapiexample.com/";
	 basePath = "api/v1/";
	 htmlReporter=new ExtentHtmlReporter("./test-output/test-report2.html");
	 extent = new ExtentReports();
	 extent.attachReporter(htmlReporter);
	 
	 extent.setSystemInfo("Environment", "Windows");
	 extent.setSystemInfo("user", "gaurav");
	 htmlReporter.config().setChartVisibilityOnOpen(true);
	 htmlReporter.config().setDocumentTitle("Extent Report Demo");
	 htmlReporter.config().setReportName("Test Report2");
	 htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
	 htmlReporter.config().setTheme(Theme.STANDARD);
	 htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd YYYY, hh:mm a '(' zzz ')");
	
 }
 
 @AfterMethod
 public void getResult(ITestResult result)
 {
	 
	 if(result.getStatus() == ITestResult.FAILURE)
	 {
		 logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+ "Failed ", ExtentColor.RED));
		 logger.fail(result.getThrowable());
	 }
	 
	 else if(result.getStatus() == ITestResult.SUCCESS)
	 {
		 logger.log(Status.PASS, MarkupHelper.createLabel(result.getName()+ "Passed ", ExtentColor.GREEN));
		 logger.fail(result.getThrowable());
	 }
	 
	 if(result.getStatus() == ITestResult.SKIP)
	 {
		 logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+ "Skipped ", ExtentColor.ORANGE));
		 logger.fail(result.getThrowable());
	 }
 }
 
 @AfterSuite
 public void configAfterSuite()
 {
	 extent.flush();
 }

}
