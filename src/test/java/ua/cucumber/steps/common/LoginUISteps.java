package ua.cucumber.steps.common;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import org.fluentlenium.core.annotation.Page;

import ua.cucumber.pages.LoginPage;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;

public class LoginUISteps extends ScenarioSteps {

	@Page
	LoginPage loginPage;
	
	// @Page 
	// RegistroDiarioPage registroDiarioPage;
	
	@Step
	public void visit() {
		loginPage.open();
	}


}
