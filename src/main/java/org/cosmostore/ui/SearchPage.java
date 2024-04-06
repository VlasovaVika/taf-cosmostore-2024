package org.cosmostore.ui;

import org.openqa.selenium.WebDriver;

public class SearchPage {
    private WebDriver driver;
    public SearchPage(){ this.driver = Driver.getDriver();}
    public static final String SEARCH_INPUT = "//input[@class='form-control appended-form-control']";
    public static final String FINDED_ELEMENT= "//div[@id='products-list']/div/div/div[@class='card-body py-2']/h3/a";
}
