package src.test.java;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class GETandPOSTExample {

	
	
	@Test
	public void Post() {
//		
		
		JSONObject req=new JSONObject();
		req.put("name", "req");
		req.put("role", "qreq");
		
		
	
		given().body(req.toJSONString()).when().post("https://reqres.in/api/users").then().statusCode(201).log().all();
		
	}
	
	
}
