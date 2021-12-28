package com.automationpractice.cucumber.steps;

import com.automationpractice.pages.SummerDressesPage;
import cucumber.api.java.en.Then;

public class SummerDressesPriceRangeTestSteps {
    @Then("^moves the slider to change the price range$")
    public void movesTheSliderToChangeThePriceRange() {
        new SummerDressesPage().moveSliderToChangePrice();
    }
}
