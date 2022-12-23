Feature: Registration on FB

  Scenario: Successful Sign Up for FB
    Given User launch browser
    And Opens url "https://www.facebook.com/signup"
    And user enters firstname as "Vishwas" and surname as "Thite"
    And user enters mobilenumber as "9527436452" and password as "1188$Vish"