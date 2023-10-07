package hAuthorization;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import java.util.ResourceBundle;

public class usingBearer {

    @Test
    public void githubwithBearer(){
        RestAssured.given()
                .baseUri("https://github.com/user/repos")
                .header("Authorization","Bearer","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")
                .when()
                .get()
                .then()
                .log()
                .body();
    }
}
