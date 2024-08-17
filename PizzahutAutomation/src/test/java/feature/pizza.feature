Feature: This feature will be used to automate PizzaHut Website

  #ctrl + click on a scenario line will take us to the respective java code
  #Always make feature file resusable like the data table  and passing data from feature file itself like this feature file resuable, plain feature
  #file will only able to run test with one data we need to run with multiple data
  Scenario: This scenario will be used to Place the Order
    Given I have launched the application
    When I enter the location as "Pune"
    And I select the very first suggestion from the list
    Then I should land on the Deals page
    And I select the tab as "Pizzas"
    And I add "Schezwan Margherita" to the basket
    And I note down the price displayed on the screen
    Then I should see the pizza "Personal Schezwan Margherita" is added to the cart
    And price is also displayed correctly
    And I click on the Checkout button
    Then I should be landed on the secured checkout page
    And I enter the personal details
      | name  | Rajesh Sharma |
      | phone |    1234567890 |
      | email | abc@xyz.com   |
    And I enter the address details
      | 123 Main Street |
      | Some Landmark   |
