Feature: Busqueda de productos exitosa


  Scenario: Busqueda de un productos a traves del buscador

    Given que necesito buscar un producto
    When se realice la busqueda de un producto "bulldog" a traves del buscador
    Then debe mostrar los resultados de los productos que tengan coincidencia con el nombre del producto

