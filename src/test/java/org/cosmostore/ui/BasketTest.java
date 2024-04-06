package org.cosmostore.ui;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BasketTest extends BaseTest {
    @Test
    @DisplayName("add some item to basket and check that the item is in the basket")
    public void testAddItemsToBasket(){
        BasketPage basketPage = new BasketPage();
        String expectedNameOfProduct = basketPage.getExpectedNameOfProduct();
        basketPage.clickFirstItemFromTop40();
        basketPage.clickBtnAddItemToCart();
        basketPage.clickBtnCheckout();
        basketPage.getNameOfAddedItem().contains(expectedNameOfProduct);
    }
}
