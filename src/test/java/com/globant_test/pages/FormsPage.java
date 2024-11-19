package com.globant_test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.testng.Assert.*;

public class FormsPage extends BasePage{

    @FindBy(xpath = "//android.view.View[@content-desc=\"Forms\"]")
    private WebElement formsScreen;

    @FindBy(xpath = "//android.widget.EditText[@content-desc=\"text-input\"]")
    private WebElement inputField;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"input-text-result\"]")
    private WebElement typedField;

    @FindBy(xpath = "//android.widget.Switch[@content-desc=\"switch\"]")
    private WebElement switchElement;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"switch-text\"]")
    private WebElement switchTextStatus;

    public void clickFormsScreen(){
        clickElement(formsScreen);
    }

    public void inputText(String text){
        inputText(inputField, text);
    }

    public void checkTypedText(String expectedMessage){
        assertEquals(getElementValue(typedField), expectedMessage);
    }

    public void checkSwitch(){
        clickElement(switchElement);
    }

    public void checkSwitchTextStatus(String expectedMessage){
        assertEquals(getElementValue(switchTextStatus), expectedMessage);
    }
}
