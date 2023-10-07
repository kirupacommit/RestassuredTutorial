package iJacksonAnnotation;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import org.testng.annotations.Test;

import java.util.HashMap;

public class ajsonAnygetter {
    @Getter
    private String name;
    private HashMap<String, Object> addProperties = new HashMap<>();

    public void setName(String name) {
        this.name = name;
    }

    @JsonAnyGetter
    public HashMap<String, Object> getAddProperties() {
        return addProperties;
    }

    @Test
    public void usejsonanygetter() throws JsonProcessingException {
        ajsonAnygetter newJson = new ajsonAnygetter();
        newJson.setName("kirupaagar");
        newJson.addProperties.put("degree", "mba");

        ObjectMapper convertToJson = new ObjectMapper();
        System.out.println(convertToJson.writerWithDefaultPrettyPrinter().writeValueAsString(newJson));
    }

}
