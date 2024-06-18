package com.swades.tokenAuthentication;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import com.swades.endpoints.SwadesAPIsEndPoints;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GenerateToken {
	static String AccessToken;
	
	@Test
    public String getAccessToken() {
        Response response = given()
                .contentType(ContentType.JSON)
                .body("{\r\n"
                		+ "  \"request\": {\r\n"
                		+ "    \"userName\": \"QATest\",\r\n"
                		+ "    \"password\": \"Test@123\"\r\n"
                		+ "  }\r\n"
                		+ "}")
                
                .post(SwadesAPIsEndPoints.token);
                response.prettyPrint();
				System.out.println("status code is" + response.statusCode());
				String token = response.getBody().path("data.token");
				System.out.println("Access token is:" + token);
				//String dbUserId =response.getBody().path("dbUserId");
				//System.out.println("DbUserId is" + dbUserId);
				return token;
}
}