package com.jpetstore.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class BusquedaPage extends PageObject {


    @FindBy(name = "keyword")
    WebElementFacade keyword;

   @FindBy(name = "searchProducts")
    WebElementFacade searchProducts;


    public void ingresarTexto(String producto) {
        keyword.typeAndTab(producto);
    }

    public void accederBotonBuscar() {
        searchProducts.click();
    }


}
