@Cucumber
Feature: Validacion De Escenarios travelocity
  Esta feature se trata de validar distintos esenarios sobre travelocity.com
  Scenario: Buscar un crucero en travelocity.com
      Given ingresa al sitio web de travelocity.com
      When el usuario busca un crucero
      Then el usuario valida el crucero seleccionado