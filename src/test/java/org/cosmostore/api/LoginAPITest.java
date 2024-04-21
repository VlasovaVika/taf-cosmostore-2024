package org.cosmostore.api;

import org.cosmostore.user.UsersGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class LoginAPITest {
    @Test
    @DisplayName("with empty email and password")
    public void testLogin() {
        given().
                queryParam("location", "https%3A%2F%2Fwww.cosmostore.org%2F").
                body("email=&password=+&submit_login=true").
                contentType("application/x-www-form-urlencoded; charset=UTF-8").
                when().
                post("https://www.cosmostore.org/users/login/?location=https%3A%2F%2Fwww.cosmostore.org%2F").
                then().assertThat().
                statusCode(200).
                body(equalTo("{\"status\":\"error\",\"errors\":{\"email\":\"Required field Email\"," +
                        "\"password\":\"Invalid login information. Try to recover the password.\"}}"));
    }

    @Test
    @DisplayName("user with this email is not registered")
    public void testLogin2() {
        given().
                queryParam("location", "https%3A%2F%2Fwww.cosmostore.org%2F").
                body("email=" + UsersGenerator.generateEmailAndPasswordForUser().getEmail() +
                        "&password="+ UsersGenerator.generateEmailAndPasswordForUser().getPassword()+
                        "+&submit_login=true").
                contentType("application/x-www-form-urlencoded; charset=UTF-8").
                when().
                post("https://www.cosmostore.org/users/login/?location=https%3A%2F%2Fwww.cosmostore.org%2F").
                then().assertThat().
                statusCode(200).
                body(equalTo("{\"status\":\"error\",\"errors\":{\"message\":\"Invalid login information. " +
                        "Try to recover the password.\"}}"));
    }
}

