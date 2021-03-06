package net.serenitybdd.demo.steps.serenity;

import net.serenitybdd.demo.pages.RestaurantPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.WebElement;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

@SuppressWarnings("serial")
public class LoginUserSteps extends ScenarioSteps {
	
	RestaurantPage homePage;
	
	@Step
    public void opens_home_page() {
        homePage.open();
    }

    @Step
    public void clicks_login_button() {
        homePage.clickLoginButton();
    }

    @Step
    public void inputs_login_info() {
        homePage.inputLoginInfo();
    }

    @Step
    public void clicks_logout_button() {
        homePage.clickLogoutButton();
    }

    @Step
    public void clicks_admin_view_button() {
        homePage.clickAdminViewButton();
    }

    @Step
    public void should_see_login_page() {
    	WebElement currentSelection = homePage.findBy("/html/body/div/h2");
        assertThat(currentSelection.getText().contains("Please log in!")).isTrue();
    }

    @Step
    public void should_see_start_page() {
        WebElement currentSelection = homePage.findBy("/html/body/h2");
        assertThat(currentSelection.getText().contains("Landing page")).isTrue();
    }

    @Step
    public void should_see_login_fields() {
        WebElement currentSelection = homePage.findBy("/html/body/div/form/input[1]");
        assertThat(currentSelection.isEnabled());
    }

}
