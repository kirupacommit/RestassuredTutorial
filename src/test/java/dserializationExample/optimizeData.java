package dserializationExample;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class optimizeData {


    @Test
    public String setJsonData() throws JsonProcessingException {
        pojoClassFordata myJson = new pojoClassFordata();
        myJson.setName("kirupaagar");
        myJson.setAge(30);
        List<String> mycars = new ArrayList<>();
        mycars.add("ferrari");
        mycars.add("porsche");
        myJson.setCars(mycars);

        System.out.println(myJson.getName());
        System.out.println(myJson.getAge());
        System.out.println(myJson.getCars());

        ObjectMapper convertPojoObjToJson = new ObjectMapper();
        String convertedObj = convertPojoObjToJson.writerWithDefaultPrettyPrinter().writeValueAsString(myJson);
       System.out.println(convertedObj);


        return convertedObj;
    }



}
