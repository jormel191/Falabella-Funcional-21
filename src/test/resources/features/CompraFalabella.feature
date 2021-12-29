Feature: Ingresar a Falabella

  @test @release
  Scenario: Realizar una compra de zapato de seguridad en Falabella
    Given ingreso al sitio
    When presiono la opción Categorias
    Then me dirijo a la opción Zapatos
    And selecciono "Zapatos de seguridad"
    Then selecciono el primer zapato mostrado
    And seleccionar talla "41"
    And presiono la opcion Agregar al Carro
    Then presiono la opcion Ir al carro de Compras
    And valido el precio del carro de compra con el mostrado previamente


