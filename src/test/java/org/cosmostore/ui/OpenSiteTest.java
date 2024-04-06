package org.cosmostore.ui;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class OpenSiteTest extends BaseTest{
    @Test
    @DisplayName("open main page")
    public void testOpenPage(){
        OpenPage openPage = new OpenPage();
        String expected = "Copyright © 2011-2024 Cosmostore.org";
        openPage.getCopyrightText().contains(expected);
    }
}
