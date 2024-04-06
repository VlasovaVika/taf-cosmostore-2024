package org.cosmostore.ui;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SearchTest extends BaseTest {
    @Test
    @DisplayName("search elements which names contain 'shampoo'")
    public void testSearch(){
        SearchPage searchPage = new SearchPage();
        searchPage.fillSearchLineAndClickEnter();
        searchPage.getNameOfFirstFoundElement().contains("shampoo");
    }
}
