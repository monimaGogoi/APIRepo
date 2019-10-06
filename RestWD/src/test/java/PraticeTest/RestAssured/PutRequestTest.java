package PraticeTest.RestAssured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutRequestTest {
	@Test
	public void AddData()
	{
		RequestSpecification req = RestAssured.given();
		JSONObject jobj = new JSONObject();
		jobj.put("id", 300);
		jobj.put("author", "Rajesh");
		jobj.put("Title", "Senior Test Engineer");		
		
		req.body(JSONObject.toJSONString(jobj));
		req.contentType(ContentType.JSON);
		
		Response resp = req.put("http://localhost:3000/posts/500");
		int statusCode = resp.statusCode();
		String respInString = resp.asString();
		String contentType=resp.contentType();
		System.out.println(statusCode);
		System.out.println(respInString);
		System.out.println(contentType);
	}

}
