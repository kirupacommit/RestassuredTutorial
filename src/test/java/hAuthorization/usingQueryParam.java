package hAuthorization;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class usingQueryParam {
@Test
    public void byApikey(){
        RestAssured.given()
                .baseUri("https://demoqa.com/BookStore/v1/Book")
                .queryParam("ISBN","9781449325862\n")
                .when()
                .get()
                .then()
                .log()
                .all();
    }
}
