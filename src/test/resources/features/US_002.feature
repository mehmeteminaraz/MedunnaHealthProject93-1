Feature: US02 Kayıt olmak için email and username bilgileri girilebilmelidir.

  Background:
    Given Kullanıcı siteye gider "medunnaUrl"

  Scenario: TC01 Herhangi bir karakter içeren ve boş bırakılamayan geçerli bir "Username" olmalıdır

    When  Sayfaya gidildiği ana sayfadaki WELCOME TO MEDUNNA texti ile doğrulanır
    And   Kullanıcı sayfaya giriş için CONTACT linkinin sağında bulunan kullanıcı girişi linkine tıklar
    Then  Kullanıcı kayıt oluşturabilmek için Register linkine tıklar
    And   Kayıt sayfasında olunduğu Registration yazısı ile doğrulanır
    And   Kullanıcı geçerli bir ssn numarası girmeli
    Then  Firstname textboxına geçerli bir isim girilmeli
    Given Lastname textboxına geçerli bir soyisim girilmeli
    And   Username textboxı boş bırakıldığında çıkan Your username is required textinin görünürlüğü test edilmeli
    Then  Boşluk bırakılarak girilen bir username in geçersiz olduğu Your username is invalid textinin görünürlüğü ile test edilmeli
    And   Username textboxına geçerli bir kullanıcı adı girilmeli

  Scenario Outline: TC02 Email adresi "@" ve "." karakterleri olmadan doldurulamamalıdır.

    When  Sayfaya gidildiği ana sayfadaki WELCOME TO MEDUNNA texti ile doğrulanır
    And   Kullanıcı sayfaya giriş için CONTACT linkinin sağında bulunan kullanıcı girişi linkine tıklar
    Then  Kullanıcı kayıt oluşturabilmek için Register linkine tıklar
    And   Kayıt sayfasında olunduğu Registration yazısı ile doğrulanır
    And   Kullanıcı geçerli bir ssn numarası girmeli
    Then  Firstname textboxına geçerli bir isim girilmeli
    Given Lastname textboxına geçerli bir soyisim girilmeli
    And   Username textboxına geçerli bir kullanıcı adı girilmeli
    Then  Email textboxına "<işaretler>" @ ve . işareti içermeyen bir adres girildiğinde çıkan This field is invalid textin görünürlüğü test edilmeli
    And   Email textboxına beş karakterden az olucak şekilde email adresi yazıldığında çıkan Your email is required to be at least five characters textin görünürlüğü test edilmeli

    Examples:
      | işaretler          |
      |qakubrahotmail.com  |
      |qakubra@hotmailcom |
      |qakubrahotmailcom   |

  Scenario: TC03 e-mail boş bırakılamaz.

    When  Sayfaya gidildiği ana sayfadaki WELCOME TO MEDUNNA texti ile doğrulanır
    And   Kullanıcı sayfaya giriş için CONTACT linkinin sağında bulunan kullanıcı girişi linkine tıklar
    Then  Kullanıcı kayıt oluşturabilmek için Register linkine tıklar
    And   Kayıt sayfasında olunduğu Registration yazısı ile doğrulanır
    And   Kullanıcı geçerli bir ssn numarası girmeli
    Then  Firstname textboxına geçerli bir isim girilmeli
    Given Lastname textboxına geçerli bir soyisim girilmeli
    And   Username textboxına geçerli bir kullanıcı adı girilmeli
    Then  Email textboxı boş bırakıldığında çıkan Your email is required textinin görünürlüğü test edilmeli
    And   Email textboxına geçerli bir adres girilmeli