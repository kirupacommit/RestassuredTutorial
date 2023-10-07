package dserializationExample;

import com.jayway.jsonpath.JsonPath;
import org.testng.annotations.Test;

public class deserializeusingJayway {

    @Test
    public void usingjaywayto(){

        //fist we need a json
        String jsonString = "{\"name\":\"John\",\"age\":30,\"city\":\"New York\"}";
        Object parsedJson = JsonPath.parse(jsonString).read("$.name");
        System.out.println(parsedJson);


    }
}
