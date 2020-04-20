package ua.cucumber.steps.common;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.junit.Assert.assertEquals;

import org.fluentlenium.core.annotation.Page;
import ua.cucumber.pages.HomePage;

public class SearchUISteps extends ScenarioSteps {

	@Page
	HomePage homePage;

	@Step
	public void search_for(String str_busca) {
		homePage.fill_search(str_busca);
		homePage.click_search_button();
	}

	public void visit_home() {
		homePage.open();
	}

	//TODO: melhorar o asser aqui pra passar
	public void should_view_product_listing_header() {
		assertEquals("SEARCH  \"PRINTED CHIFFON DRESS\"", homePage.get_product_listing_label());
	}

}
