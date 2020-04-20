package ua.cucumber.pages;

// import org.openqa.selenium.By;

// import java.util.concurrent.TimeUnit;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("page:home.page")
public class HomePage extends PageObject {

	@FindBy(id = "search_query_top")
	WebElementFacade search_field;

	@FindBy(name = "submit_search")
	WebElementFacade search_button;

	@FindBy(css = ".product-listing")
	WebElementFacade product_listing_label;
	//product-listing

	public void fill_search(String str_busca) {
		search_field.sendKeys(str_busca);
	}

	public void click_search_button() {
		search_button.click();
	}

	public String get_product_listing_label() {
		return product_listing_label.getText();
	}

}
