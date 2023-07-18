Feature: Login
I as a user of the application
I want to access the application with my username and password
To make a purchase

Background: Successful login
Given that the User want do login in the application
When he enter credentials
| User              | Password | Answear |
| vlabega@gmail.com | Lima2021 | TRUE    |
Then he must access the homepage

@SearchBook
Scenario: Search and Buy online for LibreriaNacional
    Given User wants buy in LibreriaNacional
    When User search the books in LibreriaNacional and User add the books to cart
      | name          |
      | Proyecto      |    
    Then User should see the products in the cart

