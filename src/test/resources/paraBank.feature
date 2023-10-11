Feature: Validation of paraBank

  Scenario: Verify the ParaBAnk
    Given User Lauch the Browser
    When User Enters Login Crendtials "<Username>" and "<Password>"
    And User opens New Account
    Then User Updates Contact Info

    Examples:
    
    |Username|Password|
    |preethishilpa|Darlumaa@20|