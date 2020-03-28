package ua.cucumber.steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import ua.cucumber.steps.common.LoginUISteps;
import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class LoginStepsDefinitions {

	@Steps
	LoginUISteps loginUISteps;

	// @Step
	// @Screenshots(afterEachStep=true)
	// @Dado("^que eu acesso a pagina principal$")
	// public void que_eu_acesso_a_pagina_principal() {
	// 	loginUISteps.visit();
	// }

	@Step
	@Dado("^que eu acesso a pagina de login$")
	public void que_eu_acesso_a_pagina_de_login() {
		loginUISteps.visit();
	}


	@Quando("^eu insiro dados de acesso válidos$")
	public void eu_insiro_dados_de_acesso_válidos() {
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
	}

	@Então("^eu devo ver a pagina principal$")
	public void eu_devo_ver_a_pagina_principal() {
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
	}

	
	
}
