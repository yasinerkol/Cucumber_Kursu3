#  Employee menusu için Create-Exist-Delete bölümleri olan Senaryoyu yazınız
#  Daha sonra aynı senaryoru 5 farklı degerler için çalıştırınız.

Feature:  Employee Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario Outline: Craete and delete an  Employee

    And Click on the element in the left Nav
      | humanResources |
      | employees      |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Form content
      | firstNameInput | <firstName>  |
      | lastNameInput  | <lastName>   |
      | employeeId     | <EmployeeID> |
      | documentNumber | <DocNumber>  |

    And Click on the element in the Form Content
      | gender                |
      | <GenderOption>        |
      | employeeType          |
      | <EmployeeTypeOption>  |
      | qualification         |
      | <QualificationOption> |
      | documentType          |
      | <DocumentType>        |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

    And Click on the element in the left Nav
      | humanResources |
      | employees      |

    And User delete item from the Dialog
      | <firstName> |

    And Success message should be displayed

    Examples:
      | firstName | lastName | GenderOption | EmployeeTypeOption | QualificationOption | EmployeeID | DocumentType     | DocNumber |
      | Meltem    | Can      | Female       | Teacher            | Bachelor            | 111        | PersonelID       | 1         |
      | Ahmet     | Demir    | Male         | Supervisor         | Master              | 222        | PersonelID       | 2         |
      | Fatma     | Kaya     | Female       | Teacher            | Bachelor            | 333        | PersonelID       | 3         |
      | Adem      | Okur     | Male         | OtherType          | SecondaryTechnical  | 444        | Passport         | 4         |
      | Mesut     | Eren     | Male         | OtherType          | PhD                 | 555        | BirthCertificate | 5         |

  # EmployeeTypeOption : Teacher , Supervisor , OtherType
  # QualificationOption : SecondaryTechnical , Bachelor , Master , PhD
  # DocumentType : PersonelID , Passport , BirthCertificate