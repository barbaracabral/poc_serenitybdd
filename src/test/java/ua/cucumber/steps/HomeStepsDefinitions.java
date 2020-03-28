package ua.cucumber.steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;

import ua.cucumber.steps.common.HomeUISteps;
import net.thucydides.core.annotations.Steps;

public class HomeStepsDefinitions {

    @Steps
    HomeUISteps homeUISteps;


    @Dado("^que eu acesso a pagina principal$")
    public void que_eu_acesso_a_pagina_principal() {
        homeUISteps.visit();
    }

    @Então("^eu devo visualizar que a seção de header carregou$")
    public void eu_devo_visualizar_que_a_seção_de_header_carregou() {
        homeUISteps.clickOnSideMenu();
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

}