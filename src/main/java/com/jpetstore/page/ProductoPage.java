package com.jpetstore.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.time.Duration;

public class ProductoPage extends PageObject {


   @FindBy(xpath ="//img[@src='../images/dog2.gif']")
    WebElementFacade lblWelcomeHome;

   public boolean ValidarBusqueda() {

       withTimeoutOf(Duration.ofSeconds(10)).waitFor(lblWelcomeHome);
       return lblWelcomeHome.isVisible();

   }

}
