package org.cosmostore.ui;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class LoginTest extends BaseTest {
    @Test
    @DisplayName("test with empty email")
    public void testLogin1() {
        LoginPage loginPage = new LoginPage();
        loginPage.clickBtnLogInToCabinet();
        loginPage.enterEmail(" ");
        loginPage.enterPassword("mmll");
        loginPage.clickBtnSignIn();
        Assertions.assertEquals("Required field Email", loginPage.getErrorMessageForEmail());
    }
    @Test
    @DisplayName("test with empty password")
    public void testLogin2() {
        LoginPage loginPage = new LoginPage();
        loginPage.clickBtnLogInToCabinet();
        loginPage.enterEmail("test11@gmail.com");
        loginPage.enterPassword(" ");
        loginPage.clickBtnSignIn();
        Assertions.assertEquals("Invalid login information. Try to recover the password.", loginPage.getErrorMessageForPassword());
    }
    @Test
    @DisplayName("test with wrong email")
    public void testLogin3() {
        LoginPage loginPage = new LoginPage();
        loginPage.clickBtnLogInToCabinet();
        loginPage.enterEmail("11111hhi");
        loginPage.enterPassword("mmll");
        loginPage.clickBtnSignIn();
        Assertions.assertEquals("This is not the email", loginPage.getErrorMessageForEmail());
    }
    @Test
    @DisplayName("test with not verified data")
    public void testLogin4() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.clickBtnLogInToCabinet();
        loginPage.enterEmail("testvv8v@gmail.com");
        loginPage.enterPassword("mmll");
        loginPage.clickBtnSignIn();
        Assertions.assertEquals("Invalid login information. Try to recover the password.", loginPage.getErrorMessageForInvalidData());
    }
}
