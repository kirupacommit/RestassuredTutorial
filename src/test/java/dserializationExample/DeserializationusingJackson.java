package dserializationExample;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DeserializationusingJackson {

   @Test
    public void  deserialize() throws JsonProcessingException {

        HashMap<String,Object> sampleJson = new HashMap<>();
        sampleJson.put("name","kirupa");
        sampleJson.put("age",30);

        List<String> cars = new ArrayList();
        cars.add("ferrari");
        cars.add("porsche");

        sampleJson.put("cars",cars);

        ObjectMapper myjson = new ObjectMapper();
        //Now  myjson in Hashmap format, so convert to json
       String json = myjson.writerWithDefaultPrettyPrinter().writeValueAsString(sampleJson);
       //json is now json format
       System.out.println(json);
       System.out.println(json.getClass());

       //convert json to hashmap and get individual values
       pojoClassFordata comparingjsonwithpojo = myjson.readValue(json, pojoClassFordata.class);
       //comparingjsonwithpojo is in java object format
       //comapring json is in java object format and matches properties
       System.out.println(comparingjsonwithpojo.getName());
       System.out.println(comparingjsonwithpojo.getClass());

       try {
           // Parse the JSON string into a JsonNode
           JsonNode jsonNode = myjson.readTree(json);

           // Iterate through all fields and their values
           jsonNode.fields().forEachRemaining(entry -> {
               String fieldName = entry.getKey();
               JsonNode fieldValue = entry.getValue();
               System.out.println(fieldName + ": " + fieldValue);
           });
       } catch (Exception e) {
           e.printStackTrace();
       }


   }
}
