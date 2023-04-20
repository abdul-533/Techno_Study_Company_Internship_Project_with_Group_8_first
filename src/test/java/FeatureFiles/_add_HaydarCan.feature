Feature: Add Bank Account Functionality

  Background:
    Given Navigate to Campus
    And Enter walid username as "turkeyts", password as "TechnoStudy123 " and click to login button
    Then User should login successfully


Scenario: Subject Categories Functionality



  And Click on the element in LeftNav
    | education         |
    | setupInSubjectCat |
    | subjectCategories |

  Scenario Outline: Adding Subject Categories

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | <catName> |
      | codeInput | <codeInput>    |

    And Click on the element in Dialog
      | saveButton |

    Then Success message should be displayed

    Examples:
      | catName  | codeInput   |
      | asd12345 | 123465 |

  Scenario Outline: Adding Already Exist Subject Categories

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | <catName> |
      | codeInput | <codeInput>    |

    And Click on the element in Dialog
      | saveButton |

    Then Already Exist message should be displayed

    Examples:
      | catName  | codeInput   |
      | asd12345 | 123465 |

  Scenario Outline: Editing Subject Categories

    And User edit item on Dialog Content
      | <searchInput> |
      | <catName>     |

    Then Success message should be displayed

    Examples:
      | searchInput | catName  |
      | asd12345    | dsa12345 |

  Scenario Outline: Deleting Subject Categories

    And User delete item from Dialog Content
      | <searchInput> |

    Then Success message should be displayed

    Examples:
      | searchInput |
      | dsa12345   |

  Scenario Outline: Accessing Deleting Subject Categories

    And User sending the keys in Dialog Content
      | searchInput | <searchInput> |
    And Click on the element in Dialog
      | searchButton |
    Then No data message should be displayed

    Examples:
      | searchInput |
      | dsa123465   |