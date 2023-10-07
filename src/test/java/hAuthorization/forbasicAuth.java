package hAuthorization;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class forbasicAuth {


    @Test
    public void usingBasicAuth(){
        RestAssured.given()
                .baseUri("https://postman-echo.com/basic-auth")
                .auth()
                .basic("postman","password")
                .when()
                .get()
                .then()
                .log()
                .all();

    }
}
