package org.cosmostore;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    WebDriver driver  = new ChromeDriver();
    @BeforeEach
    public void startTest(){
        driver.manage().window().maximize();
        driver.navigate().to(OpenPage.URL);
    }
    @AfterEach
    public void finishTest(){
        driver.quit();
    }
}
