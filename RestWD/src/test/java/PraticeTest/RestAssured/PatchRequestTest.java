package PraticeTest.RestAssured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PatchRequestTest {
	@Test
	public void AddData()
	{
		RequestSpecification req = RestAssured.given();
		JSONObject jobj = new JSONObject();
		jobj.put("author", "Ramesh123");	
		
		req.body(JSONObject.toJSONString(jobj));
		req.contentType(ContentType.JSON);
		
		Response resp = req.patch("http://localhost:3000/posts/300");
		int statusCode = resp.statusCode();
		String respInString = resp.asString();
		String contentType=resp.contentType();
		System.out.println(statusCode);
		System.out.println(respInString);
		System.out.println(contentType);
	}

}
