package com.api.testScripts;

import org.testng.annotations.Test;

import com.api.rootLib.BaseClass;

import io.restassured.response.Response;


public class FetchData extends BaseClass{
	@Test
	public void getPosts() throws Exception
	{
		String testobj=conf.getPropertyObject("AllEmp");
		Response resp = conf.executeRequest(testobj);
		resp.then().log().all();
	}
}
