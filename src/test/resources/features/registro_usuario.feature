# Autor: Victor Hurtado
@stories
Feature: Registro de usuario en UTest
  @scenario1
  Scenario: Registro de Victor en la pagina de UTest
    Given Victor desea registrarse en UTest
    When El usuario ingresa los datos requeridos por el sistema
      |strNombre | strApellido | strEmail             | strMesNacimiento | strDiaNacimiento | strAnoNcimiento | strCiudad | strZip | strPais |
      |Victor    | Hurtado     |victor1478@hotmail.es | March            | 16               |1986             | Jamundi   | +57     | Colombia |
    Then El registro se completa al ver el boton de Complete Setup

