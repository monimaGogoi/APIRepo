package AssertionDemo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CheckAssert {
	@Test
	public void checkassert()
	{
		Response resp = RestAssured.given().param("userId","2").param("id", "13").pathParam("key", "posts").get("https://jsonplaceholder.typicode.com/{key}");
		resp.then().assertThat().contentType(ContentType.JSON);
		resp.then().assertThat().statusCode(201);	
		// or
		resp.then().assertThat().contentType(ContentType.JSON).and().statusCode(200);
		// assertion by using testng get the header
		String CT = resp.header("Content-Type");
		//apply condition or print it
		System.out.println("Content type is "+CT);
		resp.then().log().all();
	}

}
