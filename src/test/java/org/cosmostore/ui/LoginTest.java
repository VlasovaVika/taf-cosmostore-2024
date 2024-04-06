package org.cosmostore.ui;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class LoginTest extends BaseTest {
    @Test
    @DisplayName("test with empty email")
    public void testLogin() {
        LoginPage loginPage = new LoginPage();
        loginPage.clickBtnLogInToCabinet();
        loginPage.enterEmail(" ");
        loginPage.enterPassword("mmll");
        loginPage.clickBtnSignIn();
        Assertions.assertEquals("Required field Email", loginPage.getErrorMessageForEmail());
    }
}
