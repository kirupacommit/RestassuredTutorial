package hAuthorization;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class usingOAuth {

   @Test
    public void githubOAuth(){
        RestAssured.given()
                .baseUri("https://github.com/user/repos")
                .auth()
                .oauth2("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")
                .when()
                .get()
                .then()
                .log()
                .all();

            }
}
