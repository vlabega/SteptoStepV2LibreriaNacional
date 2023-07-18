#Author: vlabega@gmail.com
Feature: Google Translate
  As a Web User  
  I want to use Google Traslate
  to translate words between different languages

  Scenario: Translate from Spanish to English
    Given that vlady opens his browser at Google Home Page
    And he goes to Google Traslate
    When he traslates the word wolf it is a animal from Inglés to Español
    Then he should see the word lobo es un animal in the screen

   