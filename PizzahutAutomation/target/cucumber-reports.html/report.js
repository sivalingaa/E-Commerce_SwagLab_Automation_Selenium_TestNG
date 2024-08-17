$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/feature/pizza.feature");
formatter.feature({
  "name": "This feature will be used to automate PizzaHut Website",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "This scenario will be used to Place the Order",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have launched the application",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdef.tests.i_have_launched_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the location as \"Pune\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdef.tests.i_enter_the_location_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select the very first suggestion from the list",
  "keyword": "And "
});
formatter.match({
  "location": "stepdef.tests.i_select_the_very_first_suggestion_from_the_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should land on the Deals page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdef.tests.i_should_land_on_the_Deals_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select the tab as \"Pizzas\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdef.tests.i_select_the_tab_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add \"Schezwan Margherita\" to the basket",
  "keyword": "And "
});
formatter.match({
  "location": "stepdef.tests.i_add_to_the_basket(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I note down the price displayed on the screen",
  "keyword": "And "
});
formatter.match({
  "location": "stepdef.tests.i_note_down_the_price_displayed_on_the_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see the pizza \"Personal Schezwan Margherita\" is added to the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdef.tests.i_should_see_the_pizza_is_added_to_the_cart(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "price is also displayed correctly",
  "keyword": "And "
});
formatter.match({
  "location": "stepdef.tests.price_is_also_displayed_correctly()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Checkout button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdef.tests.i_click_on_the_Checkout_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be landed on the secured checkout page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdef.tests.i_should_be_landed_on_the_secured_checkout_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the personal details",
  "rows": [
    {},
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "stepdef.tests.i_enter_the_personal_details(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the address details",
  "rows": [
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "stepdef.tests.i_enter_the_address_details(java.util.List\u003cjava.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});