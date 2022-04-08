Feature: Application Login5

  Background: 
    Given Open the respective browser
    When Browser is triggered
    Then Hit the url
    And Maximize the Browser Window
    Then Delete all the browser cookies

  @Sanity
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User login into application with username and password
    Then Home page is populated
    And Cards are displayed

  @Sanity
  Scenario: Home page default login with credentials
    Given User is on NetBanking landing page with url "https://qapr.tcsion.com"
    When User login into application with username "Subhransu" and password "12345"
    Then Home page is populated with status "true"
    And Balance would be displayed

  @Smoke @Regression
  Scenario: Home page default signUp with credentials
    Given User is on NetBanking landing page with url "https://qapr.tcsion.com"
    When User perform signIn
      | fName     | lName | address | mobNo      | country |
      | Subhransu | Panda | BBSR    | 9040199395 | India   |
    Then Click on SignIn button
    And A message with "SignIn Successful" should display

  @Regression
  Scenario Outline: Paramaterization of login Credentials
    Given User is on NetBanking landing page with url "https://qapr.tcsion.com"
    When User login into application with username <uName> and password <password>
    Then Home page is populated with status "true"
    And Balance would be displayed

    Examples: 
      | uName     | password |
      | Subhransu | Panda    |
      | John      | Roy      |
      | Hardhik   | Pandya   |
      | Rohith    | Sharma   |
      | Virat     | Kohli    |
