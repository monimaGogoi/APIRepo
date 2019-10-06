package PraticeTest.RestAssured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequestTest {
	@Test
	public void AddData()
	{
		
		
		Response resp = RestAssured.get("https://restcounties/rest/v2/all");
		int statusCode = resp.statusCode();
		String respInString = resp.asString();
		String contentType=resp.contentType();
		System.out.println(statusCode);
		System.out.println(respInString);
		System.out.println(contentType);
	}

}
