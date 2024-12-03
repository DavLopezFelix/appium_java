package com.globant_test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.testng.Assert.*;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//android.view.View[@content-desc=\"Login\"]")
    private WebElement logInScreen;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Sign up\"]")
    private WebElement signUpTab;

    @FindBy(xpath = "(//android.widget.TextView[@text=\"Login\"])[1]")
    private WebElement LoginTab;

    @FindBy(xpath = "//android.widget.EditText[@content-desc=\"input-email\"]")
    private WebElement emailInput;

    @FindBy(xpath = "//android.widget.EditText[@content-desc=\"input-password\"]")
    private WebElement PasswordInput;

    @FindBy(xpath = "//android.widget.EditText[@content-desc=\"input-repeat-password\"]")
    private WebElement PasswordInputConfirmation;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"button-SIGN UP\"]/android.view.ViewGroup")
    private WebElement signUpButton;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"button-LOGIN\"]/android.view.ViewGroup")
    private WebElement logInButton;

    @FindBy(id = "android:id/message")
    private WebElement popupMessage;

    public void clickLogInScreen(){
        clickElement(logInScreen);
    }

    public void clickSignUpTab(){
        clickElement(signUpTab);
    }

    public void clickLogInTab(){
        clickElement(LoginTab);
    }

    public void inputEmail(String email){
        inputText(emailInput, email);
    }

    public void inputPassword(String password){
        inputText(PasswordInput, password);
    }

    public void confirmPassword(String password){
        inputText(PasswordInputConfirmation, password);
    }

    public void clickSignUpButton(){
        clickElement(signUpButton);
    }

    public void clickLoginButton(){
        clickElement(logInButton);
    }

    public String getCurrentMessage(){
        return getElementValue(popupMessage);
    }

}
