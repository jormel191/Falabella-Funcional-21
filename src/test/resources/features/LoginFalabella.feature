Feature: Registrar un usuario en Falabella y hacer login

  Background:
    Given ingreso al sitio

  @test1 @release
  Scenario Outline: Registrar un usuario en falabella
    Then usuario presiona boton registrarse
    And completa formulario ingresando nombre "<nombre>"
    And ingresa apellido "<apellido>"
    Then ingresa rut "<rut>"
    And ingresa celular "<celular>"
    Then ingresa correo "<correo>"
    And ingresa contrasena "<contrasena>"
    And presiona boton registrase
    Then validar que el "<nombre>" coincida con la cuenta ingresada


    Examples:
      | nombre | apellido | rut       | celular  | correo      | contrasena |
      | Juan   | Perez    | 160406097 | 65330807 | juanperez12 | Hola123.   |

  @test2 @release
  Scenario: Loguearse con una cuenta existente
    Then usuario presiona boton inciar sesion
    And introduce correo "juanperez125487@yopmail.com"
    And introduce contrasena "Hola123."
    Then presiona ingresar
    Then validar que el "Juan" coincida con la cuenta ingresada

