import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEcho {

    @Test

    public void postmanEchoPostTest(){
        given()
                .baseUri("https://postman-echo.com")
                .body("Test Message")

                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body("data", equalTo("error"))
        ;
    }
}
