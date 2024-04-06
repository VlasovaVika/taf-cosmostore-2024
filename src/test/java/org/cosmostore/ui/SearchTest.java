package org.cosmostore.ui;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class SearchTest extends BaseTest {
    @Test
    public void testSearch(){
        SearchPage searchPage = new SearchPage();
        driver.findElement(By.xpath(SearchPage.SEARCH_INPUT)).sendKeys("shampoo", Keys.ENTER);
        String actualResult = driver.findElement(By.xpath(SearchPage.FINDED_ELEMENT)).getText();
        actualResult.contains("shampoo");
    }
}
