package dserializationExample;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class testSerialization {

    //Create a dummy data to serialize
    @Test
    public void jsonBodyUsingHashmap(){
        //create a dummy javaobj using hashmap
        HashMap<String, Object> javaObj = new HashMap<>();

        javaObj.put("name","kirupaagar");
        javaObj.put("age",30);
        //Add array of values
        List<String> mycars = new ArrayList<>();
        mycars.add("ferrari");
        mycars.add("porsche");
        javaObj.put("cars",mycars);

        //javaObj is not JSON Type
        System.out.println(javaObj); //{cars=[ferrari, porsche], name=kirupaagar, age=30}
        System.out.println(javaObj instanceof Object); //true

        RestAssured
                .given()
                .baseUri("https://reqres.in/")
                .body(javaObj)
                .header("Content-Type","application/json")
                //.contentType(ContentType.JSON) // Use ContentType.JSON to specify JSON content type
                .when()
                .post("/api/users")
                .then()
                .statusCode(201)
                .log()
                .all();

        //java.lang.IllegalArgumentException:
        // Don't know how to encode {"cars":["ferrari","porsche"],"name":"kirupaagar","age":30} as a byte stream.

    }
}
