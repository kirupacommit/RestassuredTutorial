package aRestassured_normalStyle;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class aGetEmployees {

    @Test
    public void getAllEmployees(){
        RestAssured.baseURI = "https://reqres.in/";

        //We use the given() method to start building our request
        RequestSpecification anyHeadervalues = RestAssured.given();

        //Get the response
       Response response = anyHeadervalues.request(Method.GET,"/api/users/2");

        System.out.println(response.asPrettyString());
        System.out.println(response.getStatusCode());
        System.out.println(response.getStatusLine());


    }
}
