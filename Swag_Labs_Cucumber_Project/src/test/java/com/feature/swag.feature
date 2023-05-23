Feature: Swag Labs Demo Site

Scenario: User login
Given User launch the browser and url
When User send the valid username
And User send the valid password
And User click the login button

Scenario: User Add to cart

When User click the Sauce Labs backpack add to cart button
And User click the add to cart icon
And User click the checkout button

Scenario: User Information page

When User send the firstname
And uers send the lastname
And user send the postal code
And user click the continue button

Scenario: User in overview page

When user click the Finish button
Then user validate the page