package rest;

import org.testng.Assert;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.response.*;

public class EmployeeRestServices {
	
	

    @Test
    public static void apiCallResponse() {

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

       //String body = response.getBody().print();

    }

}
