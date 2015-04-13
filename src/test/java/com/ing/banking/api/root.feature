Feature: Root
  Description of the root resource of the API

  Background:
    Given Server is started

  Scenario: Calling the root resource of the banking API
    When I perform a GET request at /
    Then I should get a 200 OK response
    And The response should contain the message element containing Welcome to the ING banking API

  Scenario: Deleting the root resource of the banking API
    When I perform a DELETE request at /
    Then I should get a 405 Method Not Allowed response

