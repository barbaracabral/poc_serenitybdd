package ua.cucumber.steps.common;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import org.fluentlenium.core.annotation.Page;
import ua.cucumber.pages.HomePage;

public class HomeUISteps extends ScenarioSteps {

	@Page
	HomePage homePage;
	
	@Step
	public void visit() {
		homePage.open();
	}


}
