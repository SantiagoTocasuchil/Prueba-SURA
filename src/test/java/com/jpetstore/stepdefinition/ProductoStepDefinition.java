package com.jpetstore.stepdefinition;
import com.jpetstore.steps.ProductoSteps;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class ProductoStepDefinition {
    @Steps
    ProductoSteps productoSteps;
    @Then("debe mostrar los resultados de los productos que tengan coincidencia con el nombre del producto")
    public void debeMostrarLosResultadosDeLosProductosQueTenganCoincidenciaConElNombreDelProducto() {
        productoSteps.debeMostrarLosResultadosDeLosProductosQueTenganCoincidenciaConElNombreDelProducto();

    }
}
