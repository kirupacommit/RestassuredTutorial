package fJsonPathEvaluator;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import org.apache.groovy.util.ObjectHolder;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class jsonExpressionUsingJayWay {

    @Test
    public void readJsonusingJayway() throws IOException {
        File readJson = new File("C:\\Users\\kirupaagarrm\\IdeaProjects\\RestAssuredTraining" +
                "\\src\\test\\java\\fJsonPathEvaluator\\Assests\\sampleBooks.json");

        //for Store
        Object storeObj = JsonPath.read(readJson, "$.store");
        System.out.println(storeObj);
        //{book=[{"title":"Book 1","author":"Author 1","price":10.99},{"title":"Book 2","author":"Author 2","price":12.99}], location=New York}

        //For Book
        HashMap firstBook = JsonPath.read(readJson, "$.store.book[0]");
        System.out.println(firstBook);
        //{title=Book 1, author=Author 1, price=10.99}
        System.out.println(firstBook.getClass());

    }

    @Test
    public void readMultipleParseOnce() throws IOException {

        FileInputStream readasInputStream = new FileInputStream("C:\\Users\\kirupaagarrm\\IdeaProjects\\RestAssuredTraining" +
                "\\src\\test\\java\\fJsonPathEvaluator\\Assests\\sampleBooks.json");
        //On previous , we have seen multiple times of read which is every time a parse is happening
        //To avoid the multiple parsing, use configuration from jayway
        Object parsedJson = Configuration.defaultConfiguration().jsonProvider().parse(readasInputStream.readAllBytes());
        System.out.println(parsedJson.getClass());
        //class java.util.LinkedHashMap

        //const result = jp({json: jsonObject, path: expression});
        //now give parsedJson as jsonObject
        Object usingmultiple1 = JsonPath.read(parsedJson, "$.store");
        System.out.println(usingmultiple1);

    }

    @Test
    public void FluentAPIWithoutusing() throws IOException {

        File readJson = new File("C:\\Users\\kirupaagarrm\\IdeaProjects\\RestAssuredTraining" +
                "\\src\\test\\java\\fJsonPathEvaluator\\Assests\\sampleBooks.json");

        //return type of JsonPath.parse() is documentContext
        //parse-->give filename && read --> give expression
        Object usingFluent = JsonPath.parse(readJson).read("$.store");
        System.out.println(usingFluent.getClass());
        //class java.util.LinkedHashMap
        System.out.println(usingFluent);
        //{book=[{"title":"Book 1","author":"Author 1","price":10.99},{"title":"Book 2","author":"Author 2","price":12.99}], location=New York}
    }

    @Test
    public void FluentAPIwithUsing() throws IOException {

        File readJson = new File("C:\\Users\\kirupaagarrm\\IdeaProjects\\RestAssuredTraining" +
                "\\src\\test\\java\\fJsonPathEvaluator\\Assests\\sampleBooks.json");

        Configuration usingDefaultConfig = Configuration.defaultConfiguration();

        //here using is added because configuration is added along with parse
        Object readBookwithConfig = JsonPath.using(usingDefaultConfig).parse(readJson).read("$.store.book");
        System.out.println(readBookwithConfig);
        //[{"title":"Book 1","author":"Author 1","price":10.99},{"title":"Book 2","author":"Author 2","price":12.99}]
        System.out.println(readBookwithConfig.getClass());
        //class net.minidev.json.JSONArray
    }


}
