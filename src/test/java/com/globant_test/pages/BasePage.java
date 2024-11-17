package com.globant_test.pages;

import com.globant_test.config.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    private final WebDriverWait wait;

    public BasePage(){
        PageFactory.initElements(DriverFactory.getDriver(), this);
        wait = DriverFactory.getWait();
    }

    protected void clickElement(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    protected void inputText(WebElement element, String text){
        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
    }

    protected String getElementValue(WebElement element){

        return wait.until(ExpectedConditions.visibilityOf(element)).getText();
    }
}
