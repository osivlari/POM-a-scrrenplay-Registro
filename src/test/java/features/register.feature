Feature: Register

  Scenario Outline: Registro
    Given nuevo registro
    When Este ingresa los datos en las casillas correspondientes de la informacion y le de enviar
      | firstName   | lastName   | phone   | email   | address1   | city   | state   | postalCode   | userName   | password   | confirmPassword   |
      | <firstName> | <lastName> | <phone> | <email> | <address1> | <city> | <state> | <postalCode> | <userName> | <password> | <confirmPassword> |

    Then the user logs in the page username sandra@gmail.com,456789
    Examples:
      | firstName | lastName | phone  | email            | address1       | city     | state    | postalCode | userName | password | confirmPassword |
      | sandra    | gomez    | 789456 | sandra@gmail.com | Diagonal50sur  | bogota   | bogota   | 5798       | sandras  | 456789   | 456789          |
      #| andres    | perez    | 789456 | andres@gmail.com | calle17sur     | medellin | medellin | 5798       | andres   | 56987    | 56987           |
      #| maick     | vargas   | 789456 | maick@gmail.com  | carrera58sur   | bogota   | bogota   | 5798       | maick    | 87924    | 87924           |
      #| oscar     | ladino   | 789456 | oscar@gmail.com  | autopistanorte | bogota   | bogota   | 5798       | osivlari | 13547    | 13547           |


