package bRestAssured_BDDStyle;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class usingSpec {


    RequestSpecification reqwithurl;

    @BeforeSuite
    @Test
    public void setSpecProperties(){
       reqwithurl= given()
                .baseUri("https://reqres.in/");
    }
    public void getallRequsingBDD() {
        RestAssured
                .with()
                .spec(reqwithurl)
                .when()
                .get("api/users?page=2")
                .then()
                .log().all();

    }

   @Test
    public void putrequestusingBDD(){
        RestAssured.with()
                .spec(reqwithurl)
                .body("{\n" +
                        "    \"name\": \"morpheus\",\n" +
                        "    \"job\": \"zion resident\"\n" +
                        "}")
                .when()
                .put("/api/users/2")
                .then()
                .log().all();

    }
}
