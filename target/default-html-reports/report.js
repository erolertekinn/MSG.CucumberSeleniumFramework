$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/warenkorb.feature");
formatter.feature({
  "name": "Preischeck im Warenkorb",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Benutzer ist auf der Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.msg.step_definitions.ShoppingCartStepDef.benutzer_ist_auf_der_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "�berpr�fen Sie den Preis der Produkte im Warenkorb",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "Der Benutzer loggen sich in den Webshop ein",
  "keyword": "And "
});
formatter.match({
  "location": "com.msg.step_definitions.ShoppingCartStepDef.der_Benutzer_loggen_sich_in_den_Webshop_ein()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Der Benutzer navigiert zum Produkt HP Z3200 WIRELESS MOUSE",
  "keyword": "When "
});
formatter.match({
  "location": "com.msg.step_definitions.ShoppingCartStepDef.der_Benutzer_navigiert_zum_Produkt_HP_Z3200_WIRELESS_MOUSE()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Der Benutzer legt eine Maus der Farbe weiss und zwei der Farbe rot in den Warenkorb",
  "keyword": "And "
});
formatter.match({
  "location": "com.msg.step_definitions.ShoppingCartStepDef.der_Benutzer_legt_eine_Maus_der_Farbe_weiss_und_zwei_der_Farbe_rot_in_den_Warenkorb()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Der Benutzer fuehrt den Bezahlprozess bis zum Ende durch",
  "keyword": "And "
});
formatter.match({
  "location": "com.msg.step_definitions.ShoppingCartStepDef.der_Benutzer_fuehrt_den_Bezahlprozess_bis_zum_Ende_durch()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Der richtige Preis der beiden roten Maeuse und der Gesamtpreis sollen verifiziert werden",
  "keyword": "Then "
});
formatter.match({
  "location": "com.msg.step_definitions.ShoppingCartStepDef.der_richtige_Preis_der_beiden_roten_Maeuse_und_der_Gesamtpreis_sollen_verifiziert_werden()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});