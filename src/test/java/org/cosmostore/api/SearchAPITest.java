package org.cosmostore.api;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class SearchAPITest {
    @Test
    @DisplayName("POST search 'shampoo'")
    public void testSearch1(){
        given().
                queryParam("q", "shampoo").
                when().
                get(SearcAPIPage.URL).
                then().assertThat().
                statusCode(200).body(containsString("shampoo"));
    }
    @Test
    @DisplayName("POST search 'Azzaro%20Coffret'")
    public void testSearch2(){
        given().
                queryParam("q", "Azzaro%20Coffret").
                when().
                get(SearcAPIPage.URL).
                then().assertThat().
                statusCode(200).body(containsString("Azzaro%20Coffret"));
    }
}
