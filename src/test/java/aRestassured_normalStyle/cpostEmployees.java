package aRestassured_normalStyle;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class cpostEmployees {

    @Test
    public void postEmployeeDetails() {

        RestAssured.baseURI = "https://reqres.in/";
        //add header Content-Type along with body
        RequestSpecification withHeader = RestAssured
                .given()
                .header("Content-Type", "application/json")
                .body("{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}");
        //Method is not executable, and its POST
        Response responseforpost = withHeader.request(Method.POST, "api/users");
        System.out.println(responseforpost.getStatusCode());
        System.out.println(responseforpost.getStatusLine());
        System.out.println(responseforpost.getBody().asPrettyString());

    }
}
