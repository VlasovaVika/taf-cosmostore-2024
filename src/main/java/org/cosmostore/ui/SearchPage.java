package org.cosmostore.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    private WebDriver driver;
    public SearchPage(){ this.driver = Driver.getDriver();}
    public static final String SEARCH_INPUT = "//input[@class='form-control appended-form-control']";
    public static final String FOUND_ELEMENT = "//div[@id='products-list']/div/div/div[@class='card-body py-2']/h3/a";
    public void fillSearchLineAndClickEnter(){
        driver.findElement(By.xpath(SearchPage.SEARCH_INPUT)).sendKeys("shampoo", Keys.ENTER);
    }
    public String getNameOfFirstFoundElement(){
        return driver.findElement(By.xpath(SearchPage.FOUND_ELEMENT)).getText();
    }
}
