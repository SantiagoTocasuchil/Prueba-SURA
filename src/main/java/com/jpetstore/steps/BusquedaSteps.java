package com.jpetstore.steps;

import com.jpetstore.page.BusquedaPage;

public class BusquedaSteps {



    BusquedaPage busquedaPage;
    public void queNecesitoBuscarUnProducto() {
        busquedaPage.open();
    }

    public void ingresarValor(String producto) {
        busquedaPage.ingresarTexto(producto);
    }

    public void hacerClick() {
       busquedaPage.accederBotonBuscar();
    }


}
