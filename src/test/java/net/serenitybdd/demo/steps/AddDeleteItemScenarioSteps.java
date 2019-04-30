package net.serenitybdd.demo.steps;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.demo.steps.serenity.AddDeleteUserSteps;
import net.serenitybdd.demo.steps.serenity.LoginUserSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Aliases;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class AddDeleteItemScenarioSteps {
	
	@Steps
    AddDeleteUserSteps user;
	
	@Given("I want to add and delete items")
    public void userWantsToAddDeleteItems() {
        Serenity.takeScreenshot();
        user.opens_home_page();
        Serenity.takeScreenshot();
    }

    @When("I click the Login button")
    public void clickLoginButton() {
        user.clicks_login_button();
    }

    @When("I input Login info")
    public void inputLoginInfo() {
        user.inputs_login_info();
    }

    @When("I click the Item List button")
    public void clickItemListButton() {
        user.clicks_item_list_button();
    }

    @When("I input item info")
    public void inputItemInfo() {
        user.inputs_item_info();
    }

    @Then("I should see the Item added")
    public void resultsForAddingItem() {
        user.should_see_added_item();
    }

    @Then("I should be able to delete it")
    public void deleteAddedItem() {
        user.should_delete_added_item();
    }

    @Then("I should no longer see it")
    public void resultsForDeletingItem() {
        user.should_not_see_deleted_item();
    }

}
