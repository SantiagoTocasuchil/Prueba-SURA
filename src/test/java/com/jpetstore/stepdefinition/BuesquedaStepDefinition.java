package com.jpetstore.stepdefinition;

import com.jpetstore.steps.BusquedaSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BuesquedaStepDefinition {

    @Steps
    BusquedaSteps busquedaSteps;

    @Given("que necesito buscar un producto")
    public void queNecesitoBuscarUnProducto() {
    busquedaSteps.queNecesitoBuscarUnProducto();

    }

    @When("se realice la busqueda de un producto {string} a traves del buscador")
    public void seRealiceLaBusquedaDeUnProductoATravesDelBuscador(String producto) {
        busquedaSteps.ingresarValor(producto);
        busquedaSteps.hacerClick();
    }


}
