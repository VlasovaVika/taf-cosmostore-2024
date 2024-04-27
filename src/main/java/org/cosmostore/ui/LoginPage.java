package org.cosmostore.ui;

import org.cosmostore.driver.Driver;
import org.cosmostore.user.UsersGenerator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    public LoginPage() {
        this.driver = Driver.getDriver();
    }

    public static final String BTN_LOGIN_TO_CABINET = "//div[@class=\"navbar-tool-text login-text\"]";
    public static final String EMAIL_FIELD_ID = "si-email";
    public static final String PASSWORD_FIELD_ID = "si-password";
    public static final String ERROR_MESSAGE_FOR_EMAIL = "//div[@class='form-group'][1]/small";
    public static final String ERROR_MESSAGE_FOR_PASSWORD = "//div[@class='form-group'][2]/small";
    public static final String BTN_SIGN_IN = "//button[@class='btn btn-primary btn-block btn-shadow login_submit']";
    public static final String ERROR_MESSAGE_FOR_INVALID_DATA = "//div[@class='modal-body tab-content py-4']/form/div[@class='message_block alert alert-danger mb-3']";
    public static final String EMPTY_FIELD = " ";
    public static final String INCORRECT_EMAIL = UsersGenerator.generateEmailAndPasswordForUser().getPassword();
    public void clickBtnLogInToCabinet() {
        driver.findElement(By.xpath(LoginPage.BTN_LOGIN_TO_CABINET)).click();
    }

    public void enterEmail(String email) {
        driver.findElement(By.id(LoginPage.EMAIL_FIELD_ID)).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(By.id(LoginPage.PASSWORD_FIELD_ID)).sendKeys(password);
    }

    public void clickBtnSignIn() {
        driver.findElement(By.xpath(LoginPage.BTN_SIGN_IN)).click();
    }

    public String getErrorMessageForEmail() {
        return driver.findElement(By.xpath(LoginPage.ERROR_MESSAGE_FOR_EMAIL)).getText();
    }

    public String getErrorMessageForPassword() {
        return driver.findElement(By.xpath(LoginPage.ERROR_MESSAGE_FOR_PASSWORD)).getText();
    }
    public String getErrorMessageForInvalidData() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath(LoginPage.ERROR_MESSAGE_FOR_INVALID_DATA)).getText();
    }
}
