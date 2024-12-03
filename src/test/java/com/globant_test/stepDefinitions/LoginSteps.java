package com.globant_test.stepDefinitions;

import com.globant_test.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.testng.Assert.assertEquals;

public class LoginSteps extends LoginPage {

    @Given("The Login screen is open")
    public void theLoginScreenIsOpen(){
        clickLogInScreen();
    }

    @When("I click on Sign up tab")
    public void iClickOnSignUpTab(){
        clickSignUpTab();
    }

    @When("I input email {string}")
    public void iInputEmail(String email){
        inputEmail(email);
    }

    @When("I input password {string}")
    public void iInputPassword(String password){
        inputPassword(password);
    }

    @When("I confirm password {string}")
    public void iConfirmPassword(String password){
        confirmPassword(password);
    }

    @When("I click sign up button")
    public void iClickSignUpButton(){
        clickSignUpButton();
    }

    @When("I click log in button")
    public void iClickLogInButton(){
        clickLoginButton();
    }

    @Then("I should see popup {string}")
    public void iShouldSeePopUp(String expectedMessage){
        assertEquals(getCurrentMessage(), expectedMessage);
    }


}
