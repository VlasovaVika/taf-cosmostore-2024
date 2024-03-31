package org.cosmostore.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenPage {
    private WebDriver driver;

    public OpenPage() {
        this.driver = Driver.getDriver();
    }
    public static final String COPYRIGHT = "//div[@class='pb-4 font-size-xs text-light opacity-50 text-center text-md-left']";
    public String getCopyrightText(){
       return driver.findElement(By.xpath(OpenPage.COPYRIGHT)).getText();
    }
}
