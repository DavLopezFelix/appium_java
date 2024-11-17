package com.globant_test.stepDefinitions;

import com.globant_test.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import static org.testng.Assert.*;

public class HomeSteps extends HomePage {

    @Given("The WebdriverIO is open")
    public void theWebDriverIoIsOpen(){

    }

    @Then("I should see {string}")
    public void iShouldSee(String expectedValue){
        assertEquals(getText(), expectedValue);
    }
}
