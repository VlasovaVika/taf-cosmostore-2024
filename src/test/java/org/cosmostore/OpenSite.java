package org.cosmostore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenSite {
    @Test
    public void openPageTest(){
        WebDriver driver  = new ChromeDriver();
        driver.navigate().to(OpenPage.URL);
        String actual = driver.findElement(By.xpath(OpenPage.COPYRIGHT)).getText();
        Assertions.assertEquals("Copyright © 2011-2024 Cosmostore.org. All rights reserved.", actual);
    }
}
