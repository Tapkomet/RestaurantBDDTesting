package net.serenitybdd.demo.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@DefaultUrl("http://localhost:8888/")
public class RestaurantPage extends PageObject {

	static {
		System.setProperty("webdriver.chrome.driver", findFile("chromedriver.exe"));
	}

	static private String findFile(String filename) {
		String paths[] = {"", "bin/", "target/classes"}; // if you have chromedriver somewhere else on the path, then put it here.
		for (String path : paths) {
			if (new File(path + filename).exists())
				return path + filename;
		}
		return "";
	}

	@FindBy(xpath="//a[text()='Login']")
	private WebElementFacade login;

	@FindBy(xpath="//a[text()='Logout']")
	private WebElementFacade logout;

	@FindBy(xpath="//a[text()='Admin View']")
	private WebElementFacade adminView;

	@FindBy(xpath="//a[text()='Item List']")
	private WebElementFacade itemList;

    @FindBy(xpath="/html/body/div/form/input[1]")
	private WebElementFacade emailInput;

	@FindBy(xpath="/html/body/div/form/input[2]")
	private WebElementFacade passwordInput;

    @FindBy(xpath="/html/body/div/form/input[3]")
    private WebElementFacade loginButton;

	@FindBy(xpath="/html/body/form[3]/input[1]")
	private WebElementFacade idInput;

	@FindBy(xpath="/html/body/form[3]/input[2]")
	private WebElementFacade nameInput;

	@FindBy(xpath="/html/body/form[3]/input[3]")
	private WebElementFacade numberInput;

	@FindBy(xpath="/html/body/form[3]/input[4]")
	private WebElementFacade priceInput;

	@FindBy(xpath="/html/body/form[3]/input[5]")
	private WebElementFacade categoryInput;

	@FindBy(xpath="/html/body/form[3]/input[6]")
	private WebElementFacade submitItemButton;

    @FindBy(xpath = "//td[contains(text(),'Pepper Steak')]")
    private WebElementFacade pepperSteak;

    @FindBy(xpath = "//td[contains(text(),'Pepper Steak')]//ancestor::tr/child::td[6]")
    private WebElementFacade deletePepperSteak;
	
	public void clickLoginButton() {
		login.click();
    }

	public void clickLogoutButton() {
		logout.click();
	}

	public void clickAdminViewButton() {
		adminView.click();
	}

	public void clickItemListButton() {
		itemList.click();
	}

	public void inputLoginInfo() {
		emailInput.type("romakobzar@ukr.net");
        passwordInput.type("qwerty123");
        loginButton.click();
	}


	public void inputItemInfo() {
		idInput.type("99");
		nameInput.type("Pepper Steak");
		numberInput.type("56");
		priceInput.type("19000");
		categoryInput.type("Steaks");
		submitItemButton.click();
	}


    public WebElement getPepperSteak() {
	    return pepperSteak;
    }

    public void deleteAddedItem() {
	    deletePepperSteak.click();
    }
}
