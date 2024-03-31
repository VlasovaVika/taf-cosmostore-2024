package org.cosmostore.ui;

import org.junit.jupiter.api.Test;

public class BasketTest extends BaseTest {
    @Test
    public void addingItemsToBasket(){
        BasketPage basketPage = new BasketPage();
        String expectedNameOfProduct = basketPage.getExpectedNameOfProduct();
        basketPage.clickFirstItemFromTop40();
        basketPage.clickBtnAddItemToCart();
        basketPage.clickBtnCheckout();
        basketPage.getNameOfAddedItem().contains(expectedNameOfProduct);
    }
}
