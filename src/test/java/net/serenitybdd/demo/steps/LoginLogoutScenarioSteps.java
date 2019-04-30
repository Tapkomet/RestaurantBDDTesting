package net.serenitybdd.demo.steps;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.demo.steps.serenity.LoginUserSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Aliases;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class LoginLogoutScenarioSteps {
	
	@Steps
    LoginUserSteps user;
	
	@Given("I want to log out")
    @Aliases(values = {"I want to gain access to site without logging in"})
    public void userWantsToLogIn() {
        Serenity.takeScreenshot();
        user.opens_home_page();
        Serenity.takeScreenshot();
    }

    @When("I click the Admin View button")
    public void clickAdminViewButton() {
        user.clicks_admin_view_button();
    }
	
	@Then("I should see the Login page")
    public void resultsForClickingLoginButton() {
        user.should_see_login_page();
    }

    @Then("I should see the fields")
    public void resultsForClickingLoginButton2() {
        user.should_see_login_fields();
    }

    @When("I click the Login button")
    public void clickLoginButton() {
        user.clicks_login_button();
    }

    @When("I input Login info")
    public void inputLoginInfo() {
        user.inputs_login_info();
    }

    @When("I click the Logout button")
    public void clickLogoutButton() {
        user.clicks_logout_button();
    }

    @Then("I should see the start page")
    public void resultsForClickingLogoutButton() {
        user.should_see_start_page();
    }

}
