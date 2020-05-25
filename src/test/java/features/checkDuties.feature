@bcstest
Feature: check vacancy duties

  Scenario:
    Given open site bcs
    And wait link QA микросервисов appears
    When click link QA микросервисов
    And wait until duties appears
    Then check duties exactly
