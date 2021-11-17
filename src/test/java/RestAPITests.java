import Users.CreateUserRequestBody;
import Users.CreateUserResponseBody;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class RestAPITests {
    @Test
    public void shouldGetUsersDetails() // Get request
    {
        Response response=given()
                .get("https://reqres.in/api/users/2");
        System.out.println(response.asString());
        Assert.assertEquals(response.statusCode(),200);

    }
    @Test
    public void shouldCreateNewUser()
    {
        CreateUserRequestBody requestBody=CreateUserRequestBody.builder().name("tester1").job("testing").build();
        CreateUserResponseBody responseBody=new CreateUserClient().createUser(requestBody);
        //System.out.println(response.asString());
        //String id=response.getBody().jsonPath().get("id").toString();
        //Assert.assertNotNull(id);
        Assert.assertNotNull(responseBody.getId());
        Assert.assertEquals(responseBody.statusCode,201);


    }
}
