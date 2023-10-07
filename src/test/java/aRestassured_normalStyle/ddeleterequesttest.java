package aRestassured_normalStyle;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class ddeleterequesttest {

    @Test
    public void verifyDeleterequest(){
        RestAssured.baseURI="https://reqres.in/";
        //for delete no headers or body is required if and all
      RequestSpecification deleterequestteston =  RestAssured.given();
      Response deleteRequestResponse = deleterequestteston.request(Method.DELETE,"api/users/2");
        System.out.println(deleteRequestResponse.getStatusCode());
        System.out.println(deleteRequestResponse.asPrettyString());
    }
}
