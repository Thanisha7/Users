import io.restassured.RestAssured;
import io.restassured.response.Response;
import Users.CreateUserRequestBody;
import Users.CreateUserResponseBody;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class CreateUserClient {
    public CreateUserResponseBody createUser(CreateUserRequestBody requestBody)
    {

        Response response= RestAssured.given()
                .body(requestBody)
                .post("https://reqres.in/api/users");
        CreateUserResponseBody responseBody= response.as(CreateUserResponseBody.class);
        int status=response.statusCode();
        responseBody.setStatusCode(status);
        return responseBody;
    }
}
