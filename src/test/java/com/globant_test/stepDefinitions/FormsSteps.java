package com.globant_test.stepDefinitions;

import com.globant_test.pages.FormsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FormsSteps extends FormsPage {

    @Given("The Forms screen is open")
    public void theFormsScreenIsOpen(){
        clickFormsScreen();
    }

    @When("I input {string}")
    public void iInputText(String text){
        inputText(text);
    }

    @Then("I should see {string} in expected field")
    public void ishouldSeeExpectedText(String expectedText){
        checkTypedText(expectedText);
    }
}
