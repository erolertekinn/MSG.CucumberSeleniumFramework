@smoke
Feature: Preischeck im Warenkorb

  Background: 
    Given  Benutzer ist auf der Home Page

  Scenario: Überprüfen Sie den Preis der Produkte im Warenkorb
    And Der Benutzer loggen sich in den Webshop ein
    When Der Benutzer navigiert zum Produkt HP Z3200 WIRELESS MOUSE
    And Der Benutzer legt eine Maus der Farbe weiss und zwei der Farbe rot in den Warenkorb
    And Der Benutzer fuehrt den Bezahlprozess bis zum Ende durch
    Then Der richtige Preis der beiden roten Maeuse und der Gesamtpreis sollen verifiziert werden

    
    
    