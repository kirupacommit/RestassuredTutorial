package fJsonPathEvaluator;

import com.jayway.jsonpath.Criteria;
import com.jayway.jsonpath.Filter;
import com.jayway.jsonpath.JsonPath;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class jsonwithFilterAPI {


  @Test
    public void usingFilterclassinJayway() throws IOException {
        //$.phoneNumbers[?(@.number == '0123-4567-8888')]
        Filter price = Filter.filter(
                Criteria
                        .where("price")
                        .exists(true)
        );
        File readJson = new File("C:\\Users\\kirupaagarrm\\IdeaProjects\\RestAssuredTraining" +
                "\\src\\test\\java\\fJsonPathEvaluator\\Assests\\sampleBooks.json");
        Object usingprice = JsonPath.parse(readJson).read("$.store.book[?]", price);
        System.out.println(usingprice);
        //[{"title":"Book 1","author":"Author 1","price":10.99},{"title":"Book 2","author":"Author 2","price":12.99}]


    }
}
