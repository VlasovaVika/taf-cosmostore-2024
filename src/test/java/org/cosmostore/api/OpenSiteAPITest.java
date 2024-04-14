package org.cosmostore.api;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class OpenSiteAPITest {
    @Test
    @DisplayName("check status 200 when we open main page")
    public void testGetCosmostore(){
        given().
        when().
                get("https://www.cosmostore.org/").
        then().
                assertThat().
                statusCode(200);
    }
}
