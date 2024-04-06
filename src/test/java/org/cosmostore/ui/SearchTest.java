package org.cosmostore.ui;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class SearchTest extends BaseTest {
    @Test
    public void testSearch(){
        SearchPage searchPage = new SearchPage();
        searchPage.fillSearchLineAndClickEnter();
        searchPage.getNameOfFirstFoundElement().contains("shampoo");
    }
}
