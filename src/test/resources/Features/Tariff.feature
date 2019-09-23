Feature: Add customer tariff

  # Scenario:
  # Given User should be in the telecom home pagess
  # And click add tariff buttons
  #When User enter all the datasss.
  # | 499 | 90 | 50 | 200 | 1 | 10 | 5 |
  #| 399 | 80 | 40 | 300 | 2 | 20 | 4 |
  #| 299 | 70 | 30 | 400 | 3 | 30 | 3 |
  # | 199 | 60 | 20 | 500 | 4 | 40 | 2 |
  #And click on submit buttonss
  #Then user should be displayed home button is enteredd
  #Scenario:
  #Given User should be in the telecom home pagess
  #And click add tariff buttons
  #When user chooses to tariff plans
  #|re|8000 |
  #|lm |50|
  #|im|70 |
  #|sp|40 |
  #|mc| 5|
  #|ic|150|
  #|sc|200|
  #And click on submit buttonss
  #Then user should be displayed home button is enteredd
  Scenario: 
    Given User should be in the telecom home pagess
    And click add tariff buttons
    When user check the tariff plans
      | ren  | lme | ime | sps | mcs | ics  | scs |
      | 8000 |  50 |  70 |  40 |   5 |  150 | 200 |
      | 9000 |  10 |  20 |  60 |  15 | 1500 |  20 |
    And click on submit buttonss
    Then user should be displayed home button is enteredd
