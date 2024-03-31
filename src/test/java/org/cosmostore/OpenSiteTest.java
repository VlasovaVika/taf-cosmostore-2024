package org.cosmostore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OpenSiteTest extends BaseTest{
    @Test
    public void openPageTest(){
        OpenPage openPage = new OpenPage();
        String expected = "Copyright © 2011-2024 Cosmostore.org. All rights reserved.";
        Assertions.assertEquals(expected, openPage.getCopyrightText());
    }
}
