package org.cosmostore.api;

import org.cosmostore.user.UsersGenerator;

import java.util.HashMap;
import java.util.Map;

public class LoginAPIPage {
    public static final String URL_FOR_LOGIN = "https://www.cosmostore.org/users/login/";
    public static final String EMPTY_FIELD = " ";
    public static final String INCORRECT_EMAIL = UsersGenerator.generateEmailAndPasswordForUser().getPassword();

    public static String getBody(String email, String password) {
        return "email=" + email + "&password=" + password + "+&submit_login=true";
    }

    public static Map<String, String> getHeaders() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("content-type", "application/x-www-form-urlencoded; charset=UTF-8");
        headers.put("location", "https%3A%2F%2Fwww.cosmostore.org%2F");
        return headers;
    }
}
