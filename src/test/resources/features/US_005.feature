
Feature:US_005

  Scenario Outline: TC01 Kullanıcının herhangi bir karakter içeren "First Name" yazması gerekir ve boş bırakılamaz.

    Given Kullanici web uygulamasinin url'ine gider.
    Then Siteye gidildigini dogrular.
    And Make an Appointment butonuna tiklar.
    And Make an Appointment yazisinin goruldugunu dogrular.
    And Firstname TextBox'a "<First Name>" girer.
    And Send an Appointment Request butonuna tiklar.
    And Make An Appointment First Name Uyari Yazisinin gorundugunu dogrular.

    Examples:
      | First Name |
      |            |
      |            |

  Scenario Outline: TC02 Kullanıcı SSN numarası girmeli (kayıtlı SSN) gecersiz giris yapilamaz.

    Given Kullanici web uygulamasinin url'ine gider.
    Then Siteye gidildigini dogrular.
    And Make an Appointment butonuna tiklar.
    And Make an Appointment yazisinin goruldugunu dogrular.
    And SSN TextBox'a "<SSN>" girer.
    And Send an Appointment Request butonuna tiklar.
    And Make An Appointment invalid SSN icin SSN Uyari Yazisi gorundugunu dogrular.

    Examples:
      | SSN         |
      | 123456789   |
      | 000000000   |
      | abc12!@#$   |
      | abcdefghi   |
      | 123-123-123 |


  Scenario Outline: TC02 Kullanıcı SSN numarası girmeli (kayıtlı SSN) boş bırakılamaz.

    Given Kullanici web uygulamasinin url'ine gider.
    Then Siteye gidildigini dogrular.
    And Make an Appointment butonuna tiklar.
    And Make an Appointment yazisinin goruldugunu dogrular.
    And SSN TextBox'a "<SSN>" girer.
    And Send an Appointment Request butonuna tiklar.
    And Make An Appointment SSN icin SSN Uyari Yazisi gorundugunu dogrular.

    Examples:
      | SSN |
      |     |
      |     |


  Scenario Outline: TC03 Kullanıcı, herhangi bir karakter içeren "Last Name" yazması gerekir, boş bırakılamaz.

    Given Kullanici web uygulamasinin url'ine gider.
    Then Siteye gidildigini dogrular.
    And Make an Appointment butonuna tiklar.
    And Make an Appointment yazisinin goruldugunu dogrular.
    And Lastname TextBox'a "<Last Name>" girer.
    And Send an Appointment Request butonuna tiklar.
    And Make An Appointment Last Name Uyari Yazisinin gorundugunu dogrular.

    Examples:
      | Last Name |
      |           |
      |           |

  Scenario Outline:TC04 Kullanıcı "." ve "@" içeren e-mail adresi girmeli, gecersiz giris yapilamaz.

    Given Kullanici web uygulamasinin url'ine gider.
    Then Siteye gidildigini dogrular.
    And Make an Appointment butonuna tiklar.
    And Make an Appointment yazisinin goruldugunu dogrular.
    And Email TextBox'a "<Email>" girer.
    And Send an Appointment Request butonuna tiklar.
    And Make An Appointment invalid Email icin "<Email Uyari Yazisi>" gorundugunu dogrular.

    Examples:
      | Email   | Email Uyari Yazisi    |
      | .@      | This field is invalid |
      | ab.bv@c | This field is invalid |
      | @.      | This field is invalid |
      | !@$.&*  | This field is invalid |
      | a.@b.c  | This field is invalid |

  Scenario Outline:TC04 Kullanıcı "." ve "@" içeren e-mail adresi girmeli, boş bırakılamaz.

    Given Kullanici web uygulamasinin url'ine gider.
    Then Siteye gidildigini dogrular.
    And Make an Appointment butonuna tiklar.
    And Make an Appointment yazisinin goruldugunu dogrular.
    And Email TextBox'a "<Email>" girer.
    And Send an Appointment Request butonuna tiklar.
    And Make An Appointment Email icin "<Email Uyari Yazisi>" gorundugunu dogrular.

    Examples:
      | Email | Email Uyari Yazisi      |
      |       | Your email is required. |
      |       | Your email is required. |

  Scenario Outline: TC05 Kullanıcı, 3. ve 6. rakamdan sonra "-" olan 10 rakamlı telefon numarasını girmeli, gecersiz giris yapilamaz.

    Given Kullanici web uygulamasinin url'ine gider.
    Then Siteye gidildigini dogrular.
    And Make an Appointment butonuna tiklar.
    And Make an Appointment yazisinin goruldugunu dogrular.
    And Phone TextBox'a "<Phone>" girer.
    And Send an Appointment Request butonuna tiklar.
    And Make An Appointment invalid Phone icin Phone Uyari Yazisi gorundugunu dogrular.

    Examples:
      | Phone         |
      | abc-abc-abcd  |
      | 1234567890    |
      | 12a-12!-123   |
      | 123-123-123   |
      | 123-123-12345 |
      | 123.123.1234  |

  Scenario Outline: TC05 Kullanıcı, 3. ve 6. rakamdan sonra "-" olan 10 rakamlı telefon numarasını girmeli, bos birakilamaz.

    Given Kullanici web uygulamasinin url'ine gider.
    Then Siteye gidildigini dogrular.
    And Make an Appointment butonuna tiklar.
    And Make an Appointment yazisinin goruldugunu dogrular.
    And Phone TextBox'a "<Phone>" girer.
    And Send an Appointment Request butonuna tiklar.
    And Make An Appointment Phone icin Phone Uyari Yazisi gorundugunu dogrular.

    Examples:
      | Phone |
      |       |
      |       |

