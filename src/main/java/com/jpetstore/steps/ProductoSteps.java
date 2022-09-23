package com.jpetstore.steps;

import com.jpetstore.page.ProductoPage;
import org.hamcrest.MatcherAssert;

public class ProductoSteps {

    ProductoPage productoPage;

    public void debeMostrarLosResultadosDeLosProductosQueTenganCoincidenciaConElNombreDelProducto() {
        MatcherAssert.assertThat(String.valueOf(true),productoPage.ValidarBusqueda());
    }

}

