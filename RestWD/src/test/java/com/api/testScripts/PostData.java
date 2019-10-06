package com.api.testScripts;

import org.testng.annotations.Test;

import com.api.rootLib.BaseClass;

import io.restassured.response.Response;

public class PostData extends BaseClass{
	
	@Test
	public void createResource() throws Exception
	{
		String testObj = conf.getPropertyObject("createPost");
		Response resp = conf.executeRequest(testObj);
		resp.then().log().all();
	}

}
