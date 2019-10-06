package PraticeTest.RestAssured;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RealGetReqTest {
	@Test
	public void testParameter()
	{
		//param API
		Response resp = RestAssured.given().param("userId", "2").param("id", "13").pathParam("key", "posts")
		.get("https://jsonplaceholder.typicode.com/{key}");
		Object obj = resp.jsonPath().get("title[2]");
		System.out.println("title is: ");
		System.out.println(obj);
		List idList = resp.jsonPath().get("");
		for(Object obj1 : idList)
		{
		System.out.println(obj1);	
		}
	}

}
