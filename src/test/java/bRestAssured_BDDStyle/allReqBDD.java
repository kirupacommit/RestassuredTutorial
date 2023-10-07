package bRestAssured_BDDStyle;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class allReqBDD {

    @Test(enabled = false)
    public void getallRequsingBDD() {
        RestAssured
                .given()
                .baseUri("https://reqres.in/")
                .when()
                .get("api/users?page=2")
                .then()
                .log().all();

    }
    @Test(enabled = false)
    public void putrequestusingBDD(){
        RestAssured.given()
                .baseUri("https://reqres.in/")
                .body("{\n" +
                        "    \"name\": \"morpheus\",\n" +
                        "    \"job\": \"zion resident\"\n" +
                        "}")
                .when()
                .put("/api/users/2")
                .then()
                .log().all();

    }

    @Test(enabled = false) //config exception if json type is not mentioned
    public void postrequsingBDD(){
        RestAssured.given()
                .baseUri("https://reqres.in/")
                .body("{\n" +
                        "    \"name\": \"morpheus\",\n" +
                        "    \"job\": \"leader\"\n" +
                        "}")
                .header("Content-Type", "application/json")
                .when()
                .post("/api/users")
                .then()
                .statusCode(201);


    }


    @Test
    public void deleterequestusingBDD(){
        RestAssured.given()
                .baseUri("https://reqres.in/")
                .when()
                .delete("/api/users/2")
                .asPrettyString();
    }

}
