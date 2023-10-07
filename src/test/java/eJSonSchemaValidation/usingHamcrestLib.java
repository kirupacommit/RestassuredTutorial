package eJSonSchemaValidation;

import io.restassured.module.jsv.JsonSchemaValidator;
import org.apache.commons.io.FileUtils;
import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class usingHamcrestLib {

   @Test
    public void schemavalidationusinghamcrest() throws IOException {

        File inputJson = new File("C:\\Users\\kirupaagarrm\\IdeaProjects\\RestAssuredTraining\\src\\test" +
                "\\java\\eJSonSchemaValidation\\Assests\\sampleInput.json");
        //To read the file
        File readJSon = new File("C:\\Users\\kirupaagarrm\\IdeaProjects\\RestAssuredTraining\\src\\test\\java" +
                "\\eJSonSchemaValidation\\Assests\\usingFilePath.json");

        //from apache commons.io
        String stringJson = FileUtils.readFileToString(inputJson);

        //From Hamcrest lib, accepts string and boolean as arg
        MatcherAssert.assertThat(stringJson, JsonSchemaValidator.matchesJsonSchema(readJSon));

    }
}
