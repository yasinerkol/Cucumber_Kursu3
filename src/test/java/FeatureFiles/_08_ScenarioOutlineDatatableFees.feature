#  Daha önceki Create a Fee, delete Fee Senaryosunu
#  Aşağıdaki 5 farklı değerler için çalıştırınız.

Feature:  Fee Datatable Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario Outline: Craete a Fee, delete Fee

    And Click on the element in the left Nav
      | setupOne   |
      | parameters |
      | fees       |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | nameInput            | <FeeName>  |
      | codeInput            | <Code>     |
      | integrationCodeInput | <IntCode>  |
      | priorityInput        | <Priority> |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

    And User delete item from the Dialog
      | <FeeName> |

    And Success message should be displayed

    Examples:

      | FeeName     | Code | IntCode | Priority |
      | Yasin Fee 1 | 45   | 45      | 87       |
      | Yasin Fee 2 | 35   | 35      | 101      |
      | Yasin Fee 3 | 64   | 64      | 955      |
      | Yasin Fee 4 | 46   | 46      | 66       |
      | Yasin Fee 5 | 06   | 06      | 105      |