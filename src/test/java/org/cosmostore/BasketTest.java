package org.cosmostore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class BasketTest extends BaseTest {
    @Test
    public void addingItemsToBasket(){
        String expected = driver.findElement(By.xpath(BasketPage.FIRST_ITEM_FROM_TOP_40)).getText();
        driver.findElement(By.xpath(BasketPage.FIRST_ITEM_FROM_TOP_40)).click();
        driver.findElement(By.id(BasketPage.BTN_ADD_ITEM_TO_CART)).click();
        driver.findElement(By.xpath(BasketPage.BTN_CHECKOUT)).click();
        String actual = driver.findElement(By.xpath(BasketPage.NAME_OF_FIRST_ITEM_IN_THE_CART)).getText();
        actual.contains(expected);
    }
}
