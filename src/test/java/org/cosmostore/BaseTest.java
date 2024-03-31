package org.cosmostore;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    WebDriver driver;
    @BeforeEach
    public void warmUp(){
        driver = Driver.getDriver();
        driver.navigate().to("https://www.cosmostore.org/");
    }
    @AfterEach
    public void tearDown(){
        Driver.quitDriver();
    }
}
