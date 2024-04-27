package org.cosmostore.api;

import org.cosmostore.user.UsersGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class LoginAPITest {
    @Test
    @DisplayName("POST with empty email and password")
    public void testLogin1() {
        given().
                headers(LoginAPIPage.getHeaders()).
                body(LoginAPIPage.getBody(LoginAPIPage.EMPTY_FIELD,LoginAPIPage.EMPTY_FIELD)).
                when().
                post(LoginAPIPage.URL_FOR_LOGIN).
                then().assertThat().
                statusCode(200).
                body(equalTo("{\"status\":\"error\",\"errors\":{\"email\":\"Required field Email\"," +
                        "\"password\":\"Invalid login information. Try to recover the password.\"}}"));
    }

    @Test
    @DisplayName("POST with this email is not registered")
    public void testLogin2() {
        given().
                headers(LoginAPIPage.getHeaders()).
                body(LoginAPIPage.getBody(UsersGenerator.generateEmailAndPasswordForUser().getEmail(),
                        UsersGenerator.generateEmailAndPasswordForUser().getPassword())).
                when().
                post(LoginAPIPage.URL_FOR_LOGIN).
                then().assertThat().
                statusCode(200).
                body(equalTo("{\"status\":\"error\",\"errors\":{\"message\":\"Invalid login information. " +
                        "Try to recover the password.\"}}"));
    }
    @Test
    @DisplayName("POST with empty email")
    public void testLogin3() {
        given().
                headers(LoginAPIPage.getHeaders()).
                body(LoginAPIPage.getBody(LoginAPIPage.EMPTY_FIELD,
                        UsersGenerator.generateEmailAndPasswordForUser().getPassword())).
                when().
                post(LoginAPIPage.URL_FOR_LOGIN).
                then().assertThat().
                statusCode(200).
                body(equalTo("{\"status\":\"error\",\"errors\":{\"email\":\"Required field Email\"}}"));
    }
    @Test
    @DisplayName("POST with empty password")
    public void testLogin4() {
        given().
                headers(LoginAPIPage.getHeaders()).
                body(LoginAPIPage.getBody(UsersGenerator.generateEmailAndPasswordForUser().getEmail(),
                        LoginAPIPage.EMPTY_FIELD)).
                when().
                post(LoginAPIPage.URL_FOR_LOGIN).
                then().assertThat().
                statusCode(200).
                body(equalTo("{\"status\":\"error\",\"errors\":{\"password\":\"Invalid login information. Try to recover the password.\"}}"));
    }
    @Test
    @DisplayName("POST with incorrect email")
    public void testLogin5() {
        given().
                headers(LoginAPIPage.getHeaders()).
                body(LoginAPIPage.getBody(LoginAPIPage.INCORRECT_EMAIL,
                        UsersGenerator.generateEmailAndPasswordForUser().getPassword())).
                when().
                post(LoginAPIPage.URL_FOR_LOGIN).
                then().assertThat().
                statusCode(200).
                body(equalTo("{\"status\":\"error\",\"errors\":{\"email\":\"This is not the email\"}}"));
    }
}
