###Desafio Accenture#####
Feature: Search site
Like a Cliente
 I wood like to see my research
 The Site needs to show me

Scenario: CT_01 Happy way
    Given I acess the site sample app
##    And  I fill in the form Vehicle Data tab
##    And  I fill in the form Insurant Data tab
    And  I fill in the form Product Data tab
    And  I fill in the form Select Price Option 
    And  I fill in the form Send Quote
    Then The message Sending e-mail success is showed