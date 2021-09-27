$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/shoppingcart.feature");
formatter.feature({
  "name": "Shopping cart price verification",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@aufgabe"
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
  "name": "the user is on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.msg.step_definitions.ShoppingCartStepDef.the_user_is_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify the total price of the items in the shopping cart",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@aufgabe"
    }
  ]
});
formatter.step({
  "name": "the user log into the webshop",
  "keyword": "And "
});
formatter.match({
  "location": "com.msg.step_definitions.ShoppingCartStepDef.the_user_log_into_the_webshop()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigate to the HP Z3200 WIRELESS MOUSE product",
  "keyword": "When "
});
formatter.match({
  "location": "com.msg.step_definitions.ShoppingCartStepDef.the_user_navigate_to_the_HP_Z3200_WIRELESS_MOUSE_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user put one mouse in white and two in red in the shopping cart.",
  "keyword": "And "
});
formatter.match({
  "location": "com.msg.step_definitions.ShoppingCartStepDef.the_user_put_one_mouse_in_white_and_two_in_red_in_the_shopping_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user carry out the payment process to the end.",
  "keyword": "And "
});
formatter.match({
  "location": "com.msg.step_definitions.ShoppingCartStepDef.the_user_carry_out_the_payment_process_to_the_end()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user the correct price of the two red mice and the total price should be verified.",
  "keyword": "Then "
});
formatter.match({
  "location": "com.msg.step_definitions.ShoppingCartStepDef.the_user_the_correct_price_of_the_two_red_mice_and_the_total_price_should_be_verified()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected:\u003c11992\u003e but was:\u003c11996\u003e\r\n\tat org.junit.Assert.fail(Assert.java:89)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:835)\r\n\tat org.junit.Assert.assertEquals(Assert.java:647)\r\n\tat org.junit.Assert.assertEquals(Assert.java:633)\r\n\tat com.msg.step_definitions.ShoppingCartStepDef.the_user_the_correct_price_of_the_two_red_mice_and_the_total_price_should_be_verified(ShoppingCartStepDef.java:69)\r\n\tat ✽.the user the correct price of the two red mice and the total price should be verified.(file:///C:/Users/erole/Desktop/eclipse-workspace/MSG.CucumberSeleniumFramework/src/test/resources/features/shoppingcart.feature:12)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
});