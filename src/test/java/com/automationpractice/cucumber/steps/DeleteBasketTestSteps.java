package com.automationpractice.cucumber.steps;

import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.ShoppingCartPage;
import com.automationpractice.pages.ShoppingCartSummaryPage;
import com.automationpractice.pages.SummerDressesPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class DeleteBasketTestSteps {
    @Given("^User selects \"([^\"]*)\" tab from the top menu$")
    public void userSelectsTabFromTheTopMenu(String menu)  {
        new HomePage().selectItemFromMainMenu(menu);
    }

    @And("^Selects \"([^\"]*)\" from the sub menu$")
    public void selectsFromTheSubMenu(String subMenu)  {
        new HomePage().selectItemsFromWomensMenu(subMenu);
    }

    @And("^Adds item to cart$")
    public void addsItemToCart() {
        new SummerDressesPage().addPrintedChiffonDressToCart();
    }

    @And("^closes shopping cart window$")
    public void closesShoppingCartWindow() {
        new ShoppingCartPage().closeShoppingCartWindow();
    }

    @And("^verifies shopping cart has delete icon$")
    public void verifiesShoppingCartHasDeleteIcon() {
        new ShoppingCartPage().confirmDeleteIconLogoInShoppingCart();
    }

    @And("^removes item from cart$")
    public void removesItemFromCart() {
        new ShoppingCartPage().removeItemFromCart();
    }

    @Then("^verifies the displayed message \"([^\"]*)\"$")
    public void verifiesTheDisplayedMessage(String message)  {
        new ShoppingCartSummaryPage().verifyShoppingCartIsEmptyMessage(message);
    }
}
