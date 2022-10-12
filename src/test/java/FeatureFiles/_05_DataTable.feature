Feature:  Datatable Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

    Scenario: Craete Country
      And Click on the element in the left Nav
      | setupOne   |
      | parameters |
      | countries  |

      And Click on the element in the Dialog
        | addButton |

      And User sending the keys in Dialog content
        | nameInput | yasinCountry11 |
        | codeInput | 121212        |

      And Click on the element in the Dialog
         | saveButton |

      And Success message should be displayed

      And User delete item from the Dialog
      | yasinCountry11 |


  Scenario: Craete Country
    And Click on the element in the left Nav
      | setupOne   |
      | parameters |
      | nationalities  |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | nameInput | yasinNation11 |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

    And User delete item from the Dialog
      | yasinNation11 |

  Scenario: Craete a Fee, delete Fee

    And Click on the element in the left Nav
      | setupOne   |
      | parameters |
      | fees  |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | nameInput            | yasinfee11 |
      | codeInput            | 4545       |
      | integrationCodeInput | 4545       |
      | priorityInput        | 64          |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

    And User delete item from the Dialog
      | yasinfee11|

    And Success message should be displayed
