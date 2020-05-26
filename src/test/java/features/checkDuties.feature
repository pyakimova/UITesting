@bcstest
Feature: check QA vacancy duties amount

  Scenario:
    Given open site "https://bcs.ru/vacancy/novosibirsk"
    And wait link QA микросервисов
    When click link QA микросервисов
    And wait duties appears
    Then check duties amount "7"
