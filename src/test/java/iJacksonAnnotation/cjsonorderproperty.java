package iJacksonAnnotation;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;

@JsonPropertyOrder({"name", "age"})
public class cjsonorderproperty {

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

   @Test
    public void useorder() throws JsonProcessingException {
        cjsonorderproperty xx = new cjsonorderproperty();
        xx.setAge(22);
        xx.setName("kkk");

        ObjectMapper xxx = new ObjectMapper();
        xxx.writerWithDefaultPrettyPrinter().writeValueAsString(xx);
        System.out.println(xxx);

    }
}
