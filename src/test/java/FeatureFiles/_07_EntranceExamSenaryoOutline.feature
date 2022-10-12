#  Bir önceki Exam Giriş Senaryosunu
#  Aşağıdaki değerler için çalıştırınız.
#
#| ExamName        | AcademicPeriodOption      | GradeLevelOption |
#| Math exam is1   | academicPeriod2              | gradeLevel4  |
#| IT exam is1     | academicPeriod2              | gradeLevel2  |
#| Oracle exam is1 | academicPeriod2              | gradeLevel3  |
#| Math exam  is1  | academicPeriod2              | gradeLevel1  |

Feature:  Entrance Exam Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly


  Scenario Outline: Create and Delete an Exam

    And Click on the element in the left Nav
      | entranceExamOne |
      | setupTwo        |
      | entranceExamTwo |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | nameInput | <ExamName> |

    And  Click on the element in the Form Content
      | academicPeriod         |
      | <AcademicPeriodOption> |
      | gradeLevel             |
      | <GradeLevelOption>     |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

    And Click on the element in the left Nav
      | entranceExamOne |
      | setupTwo        |
      | entranceExamTwo |

    And User delete item from the Dialog
      | <ExamName> |

    And Success message should be displayed

    Examples:
      | ExamName       | AcademicPeriodOption | GradeLevelOption |
      | java Exam1     | academicPeriod1      | gradeLevel2      |
      | IT Exam 8      | academicPeriod1      | gradeLevel2     |
      | Oracle exam 16 | academicPeriod1      | gradeLevel2      |
      | TestNG exam 8  | academicPeriod1      | gradeLevel2      |