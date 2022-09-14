package rest;

import org.testng.Assert;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.response.*;

public class EmployeeRestServices {
	
	

    @Test
    public static void apiCallResponse() {
        //Response response = given().when().get("http://info.venturepulse.org:8080/service-webapp/api/AllEmployeeResources").
        Response response = given().when().get("http://reqres.in/api/search=1").
                then().statusCode(200).extract().response();
        String status = response.getStatusLine();
        String body = response.getBody().print();
        //Assert.assertEquals(response, 200);
    }
    @Test
    public static void apiCallResponseSingle() {
        Response response = given().when().get("http://reqres.in/api/search/1").
                then().statusCode(200).extract().response();

       // Response response = given().when().get("http://info.venturepulse.org:8080/service-webapp/api" +
               // "/SingleEmployeeResources/59ac2f43c09dea2660451c9d").
                //then().statusCode(200).extract().response();
        String status = response.getStatusLine();
        String body = response.getBody().print();
        //Assert.assertEquals(response.getStatusCode(), 200);
    }

    @Test
    public static void apiCallResponseSingle1 (){
        Response response = given().when().get("http://reqres.in/api/search/1").
                then().statusCode(200).extract().response();
        String id = response.getBody().prettyPrint();

        String status = response.getStatusLine();
        //String header = response.header(d)
       //String body = response.getBody().print();

    }

}
