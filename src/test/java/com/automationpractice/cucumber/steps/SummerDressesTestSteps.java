package com.automationpractice.cucumber.steps;

import com.automationpractice.pages.SummerDressesPage;
import cucumber.api.java.en.Then;

public class SummerDressesTestSteps {
    @Then("^verifies the \"([^\"]*)\" page verification text$")
    public void verifiesThePageVerificationText(String text)  {
        new SummerDressesPage().verifySummerDressesPageVerificationText(text);
    }
}
