package iJacksonAnnotation;

import com.fasterxml.jackson.annotation.JsonGetter;
import org.testng.annotations.Test;

public class bjsongetter {
    private String name;
    private int age;

    public bjsongetter(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @JsonGetter("full_name")
    public String getFullName() {
        return name;
    }
@Test
    public void usegetjson(){
        bjsongetter mm= new bjsongetter("kiru",30);
        System.out.println(mm);
    }

}

