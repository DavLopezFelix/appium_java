package com.globant_test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormsPage extends BasePage{
    String optionText;

    @FindBy(xpath = "//android.view.View[@content-desc='Forms']")
    private WebElement formsScreen;

    @FindBy(xpath = "//android.widget.EditText[@content-desc=\"text-input\"]")
    private WebElement inputField;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"input-text-result\"]")
    private WebElement typedField;

    @FindBy(xpath = "//android.widget.Switch[@content-desc=\"switch\"]")
    private WebElement switchElement;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"switch-text\"]")
    private WebElement switchTextStatus;

    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"text_input\"]")
    private WebElement dropdownLocator;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='button-Active']/android.view.ViewGroup")
    private WebElement activeButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout")
    private WebElement popupLocator;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message']")
    private WebElement popupMessage;

    @FindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1']")
    private WebElement okOption;

    public void clickFormsScreen(){
        clickElement(formsScreen);
    }

    public void inputText(String text){
        inputText(inputField, text);
    }

    public String getTypedText(){
        return getElementValue(typedField);
    }

    public void checkSwitch(){
        clickElement(switchElement);
    }

    public String getSwitchTextStatus(String expectedMessage){
        return getElementValue(switchTextStatus);
    }

    public void swipeSwitch(){
        clickElement(switchElement);
    }

    public String getTypedSwitchText(){
        return getElementValue(switchTextStatus);
    }

    public void selectOptionInDropDown(String selectedOption){
        selectDropdown(dropdownLocator, selectedOption);
    }

    public String getSelectedOptionInDropdown(){
        return getSelectedDropdown(dropdownLocator);
    }

    public void clickActiveButton(){
        clickElement(activeButton);
    }

    public boolean popupIsDisplayed(){
        return elementVisibility(popupLocator);
    }

    public String getPopupMessage(){
        return getElementValue(popupMessage);
    }

    public void clickOkOption(){
        clickElement(okOption);
    }

    public boolean popupIsNotVisible(){
        return elementNotVisible(popupLocator);
    }
}
