package com.globant_test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//android.widget.TextView[@text=\"Demo app for the appium-boilerplate\"]")
    private WebElement homeSubtitle;

    public String getText(){
        return getElementValue(homeSubtitle);
    }
}
