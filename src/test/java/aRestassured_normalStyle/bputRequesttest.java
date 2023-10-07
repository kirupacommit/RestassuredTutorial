package aRestassured_normalStyle;

//io-->package is a standard package that stands for "input/output."
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class bputRequesttest {

    @Test
    public void putrequestVerify(){
        RestAssured.baseURI="https://reqres.in/";
        RequestSpecification putRequest = RestAssured
                .given()
                .header("Content-Type","application/json")
                .body("{\n" +
                        "    \"name\": \"morpheus\",\n" +
                        "    \"job\": \"zion resident\"\n" +
                        "}");

       Response putResponse =putRequest.request(Method.PUT,"api/users/2");

        System.out.println(putResponse.getBody().asPrettyString());
        System.out.println(putResponse.getStatusCode());

    }
}
