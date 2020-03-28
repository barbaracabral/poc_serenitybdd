package ua.cucumber.pages;

import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("page:login.page")
public class LoginPage extends PageObject {

	
	@FindBy(name = "username")
	WebElementFacade username;

	// public void loginComGoogle() {
	// 	loginGmail.withTimeoutOf(20, TimeUnit.SECONDS).waitUntilVisible();
	// 	loginGmail.click();
	// }

}
