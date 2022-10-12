Feature:  Entrance Exam Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly


  Scenario: Create and Delete an Exam

    And Click on the element in the left Nav
      | entranceExamOne  |
      | setupTwo |
      | entranceExamTwo  |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | nameInput           | cucumberExam1 |

    And  Click on the element in the Form Content
      | academicPeriod  |
      | academicPeriod1 |
      | gradeLevel      |
      | gradeLevel2     |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

    And Click on the element in the left Nav
      | entranceExamOne  |
      | setupTwo |
      | entranceExamTwo  |

    And User delete item from the Dialog
      | cucumberExam1|

    And Success message should be displayed






