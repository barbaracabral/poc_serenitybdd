package ua.cucumber.steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

import ua.cucumber.steps.common.SearchUISteps;
import net.thucydides.core.annotations.Steps;

public class SearchStepsDefinitions {

    @Steps
    SearchUISteps searchUISteps;

    @Dado("^que eu acesso a pagina principal$")
    public void que_eu_acesso_a_pagina_principal() {
        searchUISteps.visit_home();
    }

    @Quando("^eu realizo uma busca por \"([^\"]*)\"$")
    public void eu_realizo_uma_busca_por(String str_busca) {
        searchUISteps.search_for(str_busca);
    }
    
    @Então("^eu devo visualizar que seção de heading do search está sendo exibida$")
    public void eu_devo_visualizar_que_seção_de_heading_do_search_está_sendo_exibida() {
        searchUISteps.should_view_product_listing_header();
    }



}