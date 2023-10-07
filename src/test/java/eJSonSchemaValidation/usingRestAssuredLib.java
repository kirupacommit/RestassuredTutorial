package eJSonSchemaValidation;

import com.fasterxml.jackson.core.JsonProcessingException;
import dserializationExample.optimizeData;
import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.testng.annotations.Test;

import java.io.File;

public class usingRestAssuredLib {

    //GetData from optimization
    optimizeData getJSON = new optimizeData();
    @Test
    public void useJSONSchemavalidatorUsingClasspath() throws JsonProcessingException {

        String myJson = getJSON.setJsonData();
        RestAssured.given()
                .baseUri("https://reqres.in/")
                .body(myJson)
                .header("Content-Type", "application/json")
                .when()
                .post("/api/users")
                .then()
                //I have kept the dummyJsonSchema in Resources folder , so given the name directly
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("dummyJsonSchema.json"));

    }


    @Test
    public  void useJsonSchemaValidatorWithFilePath() throws JsonProcessingException {

        //To read the file
        File readJSon = new File("C:\\Users\\kirupaagarrm\\IdeaProjects\\RestAssuredTraining\\src\\test\\java" +
                "\\eJSonSchemaValidation\\Assests\\usingFilePath.json");


        String myJson = getJSON.setJsonData();
        RestAssured.given()
                .baseUri("https://reqres.in/")
                .body(myJson)
                .header("Content-Type", "application/json")
                .when()
                .post("/api/users")
                .then()
                //I have kept the dummyJsonSchema in Resources folder , so given the name directly
                .body(JsonSchemaValidator.matchesJsonSchema(readJSon));
    }
}
