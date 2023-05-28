Feature:
  Scenario: agrega producto
    Given ingresa a la pagina Find Bugs
    When listamos por precios bajos
    And Seleccionamos productos
    Then se debe presentar la opcion "View Cart"

  Scenario: calcula sub total de suma precios
    Given ingresa a la pagina Find Bugs
    When  listamos por precios bajos
    And   Seleccionamos productos
    And   entramos a la pagina View Cart
    Then la suma de los precios debe dar el subtotal "Correcto"

  Scenario: calcula total de suma subtotal mas impuesto
    Given ingresa a la pagina Find Bugs
    When  listamos por precios bajos
    And   Seleccionamos productos
    And   entramos a la pagina View Cart
    Then  la suma del subtotal mas impuesto debe ser "Correcto"
