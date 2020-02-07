Feature: Create Citizenship
  @Regression
  Scenario:  Citizenship creating

    Given Go to mersys website
    And Type the username and password and click on login button
    And Click on setup on top
    And Click on parameters
    And Click on citizenship
    And Click on plus icon
    And Type the citizenship name "CucumberCitizen"
    And Type the shortName "CucCit"
    When Click on save button
    Then "CucumberCitizen" should be displayed
    And Remove the data "CucumberCitizen"
    Then Verify data is removed "CucumberCitizen"


#    get all the name from table
#    read one by one
#    make sure my value is displayed in the table
