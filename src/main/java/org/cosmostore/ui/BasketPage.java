package org.cosmostore.ui;

import org.cosmostore.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasketPage {
    private WebDriver driver;
    public BasketPage(){
        this.driver = Driver.getDriver();
    }
    public static final String FIRST_ITEM_FROM_TOP_40 = "//div[@class='owl-item active'][1]/div/div[@class='card-body py-2']/h3/a";
    public static final String BTN_ADD_ITEM_TO_CART = "main_add_button";
    public static final String BTN_CHECKOUT = "//a[@class='btn btn-primary']";
    public static final String NAME_OF_FIRST_ITEM_IN_THE_CART = "//h3[@class='product-title font-size-base mb-2']/a";
    public String getExpectedNameOfProduct(){
        return driver.findElement(By.xpath(BasketPage.FIRST_ITEM_FROM_TOP_40)).getText();
    }
    public void clickFirstItemFromTop40(){
        driver.findElement(By.xpath(BasketPage.FIRST_ITEM_FROM_TOP_40)).click();
    }
    public void clickBtnAddItemToCart(){
        driver.findElement(By.id(BasketPage.BTN_ADD_ITEM_TO_CART)).click();
    }
    public void clickBtnCheckout(){
        driver.findElement(By.xpath(BasketPage.BTN_CHECKOUT)).click();
    }
    public String getNameOfAddedItem(){
        return driver.findElement(By.xpath(BasketPage.NAME_OF_FIRST_ITEM_IN_THE_CART)).getText();
    }
}
