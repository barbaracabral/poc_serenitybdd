package ua.cucumber.pages;

// import org.openqa.selenium.By;

// import java.util.concurrent.TimeUnit;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.actions.Switch;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("page:home.page")
public class HomePage extends PageObject {

	@FindBy(id = "onesignal-popover-cancel-button")
	WebElementFacade popUpCancel;

	@FindBy(xpath = "//element[@data-e2e-name='menu-icon']")
	WebElementFacade sideMenu;

	public void clickOnSideMenu() {
		Switch.toAlert();
		popUpCancel.click();
		sideMenu.click();
	}

}
