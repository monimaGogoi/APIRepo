package com.api.testScripts;

import org.testng.annotations.Test;

import com.api.rootLib.BaseClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.restassured.response.Response;

public class FetchDataReport extends BaseClass {
	public ExtentTest logger;
	public ExtentHtmlReporter htmlReporter;
	 public ExtentReports extent;
	@Test
	public void userIDData() throws Exception
	{
		logger=extent.createTest("Fetch ALL USERID data");
		String testobj=conf.getPropertyObject("AllEmp");
		Response resp = conf.executeRequest(testobj);
		resp.then().log().all();
	}

}
