package com.globant_test.stepDefinitions;

import com.globant_test.pages.FormsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.testng.Assert.*;


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
        assertEquals(getTypedText(), expectedText);
    }

    @When("I click the switch")
    public void iSwipeSwitch(){
        swipeSwitch();
    }

    @Then("I should see {string} in expected switch field")
    public void iShouldSeeExpectedTextInSwitchField(String expectedText){
        assertEquals(getTypedSwitchText(), expectedText);
    }

    @When("I select the dropdown option {string}")
    public void iSelectTheOptionInDropdown(String selectedOption){
        selectOptionInDropDown(selectedOption);
    }

    @Then("The selected dropdown option should be {string}")
    public void iShouldSeeTheExpectedDropdownOoption(String expectedOption){
        assertEquals(getSelectedOptionInDropdown(), expectedOption);
    }

    @When("I click the button")
    public void iClickOnTheButton(){
        clickActiveButton();
    }

    @Then("I should see a popup")
    public void iShouldSeeAPopup(){
        assertTrue(popupIsDisplayed());
    }

    @Then("I should see {string} on the popup")
    public void iShouldSeeAMessage(String expectedMessage){
        assertEquals(getPopupMessage(), expectedMessage);
    }

    @When("I click the OK option")
    public void iClickOnTheOKOption(){
        clickOkOption();
    }

    @Then("I should not see the popup")
    public void iShouldNotSeeThepopup(){
        assertTrue(popupIsDisplayed());
    }
}
