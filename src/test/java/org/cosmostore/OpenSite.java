package org.cosmostore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class OpenSite extends BaseTest{
    @Test
    public void openPageTest(){
        String actual = driver.findElement(By.xpath(OpenPage.COPYRIGHT)).getText();
        Assertions.assertEquals("Copyright © 2011-2024 Cosmostore.org. All rights reserved.", actual);
    }
}
